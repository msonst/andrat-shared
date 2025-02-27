package com.cs.pc;

import java.io.Serializable;

public class TransferObject implements Serializable {

	public enum Type {
		GPS, SMS, CALL, BT_DEV, GEOFENCE, AUDIO, WHATSAPP, LOG, USER_INPUT, CONTACT, EVT, FILE;
	}

	private Type mType;
	private byte[] mData;

	public TransferObject() {

	}

	public TransferObject(Type type, byte[] data) {
		super();
		mType = type;
		mData = data;
	}

	public Type getType() {
		return mType;
	}

	public void setType(Type type) {
		mType = type;
	}

	public byte[] getData() {
		return mData;
	}

	public void setData(byte[] data) {
		mData = data;
	}

}
