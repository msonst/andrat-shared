package com.cs.pc;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class FileStorage {

	private static final String TMPDIR = "tmp";
	private static final String READYDIR = "rdy";
	private final String mBaseDir;

	public FileStorage(String mBaseDir) {
		this.mBaseDir = mBaseDir;
	}

	public synchronized String store(TransferObject data) throws IOException {
		String fileName = System.currentTimeMillis() + "-" + UUID.randomUUID().toString() + ".dat";

		String type = ""+data.getType().ordinal();

		// Deriving tmpDir and readyDir relative to mBaseDir
		Path tmpPath = Path.of(mBaseDir, TMPDIR, type, fileName);

		// Ensure the parent directories exist
		Files.createDirectories(tmpPath.getParent());

		// Write the file content to the temporary path
		Files.write(tmpPath, toByteArray(data), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

		// Deriving readyDir relative to mBaseDir
		Path readyPath = Path.of(mBaseDir, READYDIR,type, fileName);

		// Ensure the parent directories exist
		Files.createDirectories(readyPath.getParent());

		Files.move(tmpPath, readyPath, StandardCopyOption.REPLACE_EXISTING);

		return fileName;
	}

	public synchronized TransferObject load(int type,String fileName) {
		// Deriving the path to the ready directory
		Path readyPath = Path.of(mBaseDir, READYDIR, ""+type, fileName);

		if (Files.exists(readyPath)) {
			// Open the file and deserialize the object
			try (FileInputStream fileInputStream = new FileInputStream(readyPath.toFile());
					ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

				// Read the object and cast to TransferObject
				return (TransferObject) objectInputStream.readObject();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public synchronized boolean delete(int type,String fileName) {
		// Deriving the path to the ready directory
		Path readyPath = Path.of(mBaseDir, READYDIR, ""+type, fileName);

		if (Files.exists(readyPath)) {
			try {
				Files.delete(readyPath); // Delete the file from the ready directory
				return true; // Return true if file is successfully deleted
			} catch (IOException e) {
				// Log and return false in case of an error
				e.printStackTrace();
				return false;
			}
		} else {
			// Log and return false if the file doesn't exist
			System.err.println("File not found: " + readyPath.toString());
			return false;
		}
	}

	public static byte[] toByteArray(Object object) throws IOException {
		try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
			objectOutputStream.writeObject(object);
			return byteArrayOutputStream.toByteArray();
		}
	}

}
