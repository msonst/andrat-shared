package com.cs.pc;

import java.io.Serializable;

public class Sms  implements Serializable{
    private boolean deleted;
    private boolean uploaded;
    private long smsId;
    private long timeMs;
    private String smsSender;
	private String device;
	private String smsBody;
	private SmsType smsType;

    public Sms() {
		
	}
    
    public Sms(String device, boolean deleted, boolean uploaded, long smsId, long timeMs, String smsSender, String smsBody,
			SmsType smsType) {
		
		this.device=device;
		this.deleted = deleted;
		this.uploaded = uploaded;
		this.smsId = smsId;
		this.timeMs = timeMs;
		this.smsSender = smsSender;
		this.smsBody = smsBody;
		this.smsType = smsType;
	}

	public boolean isDeleted() {
        return deleted;
    }

    public long getTimeMs() {
        return timeMs;
    }

    public void setTimeMs(long timeMs) {
        this.timeMs = timeMs;
    }

    public String getSmsSender() {
        return smsSender;
    }

    public void setSmsSender(String smsSender) {
        this.smsSender = smsSender;
    }

    public String getSmsBody() {
        return smsBody;
    }

    public void setSmsBody(String smsBody) {
        this.smsBody = smsBody;
    }

    public SmsType getSmsType() {
        return smsType;
    }

    public void setSmsType(SmsType smsType) {
        this.smsType = smsType;
    }

    public long getSmsId() {
        return smsId;
    }

    public void setSmsId(long id) {
        this.smsId = id;
    }


    public String toCSV() {
        return smsId + ";" + UnixTimeConverter.convertUnixTimeToDate(timeMs) + ";" + smsSender + ";" + smsBody.replace("\n", " ").replace(";", ",") + ";" + smsType + ";" + deleted +";" +uploaded;
    }

    public void setDeleted(boolean deleted) {
        this.deleted=deleted;
    }

    public boolean isUploaded() {
        return uploaded;
    }

    public void setUploaded(boolean uploaded) {
        this.uploaded = uploaded;
    }

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
}
