package com.cs.pc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
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

	public String store(TransferObject data) throws IOException {
		String fileName = System.currentTimeMillis() + "-" + UUID.randomUUID().toString() + ".dat";

		String type = data.getType().toString();

		// Deriving tmpDir and readyDir relative to mBaseDir
		Path tmpPath = Path.of(mBaseDir, TMPDIR, type, fileName);

		// Ensure the parent directories exist
		Files.createDirectories(tmpPath.getParent());

		// Write the file content to the temporary path
		Files.write(tmpPath, toByteArray(data), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);

		// Deriving readyDir relative to mBaseDir
		Path readyPath = Path.of(mBaseDir, READYDIR, fileName);

		// Ensure the parent directories exist
		Files.createDirectories(readyPath.getParent());

		Files.move(tmpPath, readyPath, StandardCopyOption.REPLACE_EXISTING);

		return fileName;
	}

	public static byte[] toByteArray(Object object) throws IOException {
		try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream)) {
			objectOutputStream.writeObject(object);
			return byteArrayOutputStream.toByteArray();
		}
	}

}
