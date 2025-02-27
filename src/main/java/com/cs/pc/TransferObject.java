package com.cs.pc;

public class TransferObject {

	public enum Type{
		GPS, SMS, CALL, BT_DEV, GEOFENCE, AUDIO, WHATSAPP, LOG,  USER_INPUT, CONTACT;
	}
	
	private Type mType;
	private byte[] mData;
	
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
