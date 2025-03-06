package com.cs.pc;

import java.io.Serializable;

public class TransferObject implements Serializable {

	

	private AndratType mType;
	private byte[] mData;

	public TransferObject() {

	}

	public TransferObject(AndratType type, byte[] data) {
		super();
		mType = type;
		mData = data;
	}

	public AndratType getType() {
		return mType;
	}

	public void setType(AndratType type) {
		mType = type;
	}

	public byte[] getData() {
		return mData;
	}

	public void setData(byte[] data) {
		mData = data;
	}

}
