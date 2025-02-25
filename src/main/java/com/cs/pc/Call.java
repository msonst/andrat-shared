package com.cs.pc;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Locale;

// Class for Call
public class Call  implements Serializable{
    private boolean isDeleted;
    private long callId;
    private String number;
    private String name;
    private CallType type;
    private long date;
    private long duration;
    private String voicemailUri;
    private String formattedNumber;
    private String countryIso;
    private boolean isRead;
    private String callTypeContext; // Optional field if needed for additional context
    private String geoLocation;
    private boolean uploaded;
	private String device;

	public Call() {
		
	}
	
    // Constructor
    public Call(String device, long callId, String number, String name, CallType type, long date, long duration,
                String voicemailUri, String formattedNumber, String countryIso, boolean isRead,
               String callTypeContext, String geoLocation, boolean isDeleted, boolean uploaded) {
        this.setDevice(device);
		this.callId = callId;
        this.number = number;
        this.name = name;
        this.type = type;
        this.date = date;
        this.duration = duration;
        this.voicemailUri = voicemailUri;
        this.formattedNumber = formattedNumber;
        this.countryIso = countryIso;
        this.isRead = isRead;
        this.callTypeContext = callTypeContext;
        this.geoLocation = geoLocation;
        this.isDeleted = isDeleted;
        this.uploaded = uploaded;
    }

    // Getters and setters
    public long getCallId() {
        return callId;
    }

    public void setCallId(long id) {
        this.callId = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CallType getType() {
        return type;
    }

    public void setType(CallType type) {
        this.type = type;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getVoicemailUri() {
        return voicemailUri;
    }

    public void setVoicemailUri(String voicemailUri) {
        this.voicemailUri = voicemailUri;
    }

    public String getFormattedNumber() {
        return formattedNumber;
    }

    public void setFormattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public String getCallTypeContext() {
        return callTypeContext;
    }

    public void setCallTypeContext(String callTypeContext) {
        this.callTypeContext = callTypeContext;
    }

    public String getGeoLocation() {
        return geoLocation;
    }

    public void setGeoLocation(String geoLocation) {
        this.geoLocation = geoLocation;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        this.isDeleted = deleted;
    }

    public boolean isUploaded() {
        return uploaded;
    }

    public void setUploaded(boolean uploaded) {
        this.uploaded = uploaded;
    }

    @Override
    public String toString() {
        return "Call{" +
                "id=" + callId +
                ", number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", date=" + date +
                ", duration=" + duration +
                ", voicemailUri='" + voicemailUri + '\'' +
                ", formattedNumber='" + formattedNumber + '\'' +
                ", countryIso='" + countryIso + '\'' +
                ", isRead=" + isRead +
                ", callTypeContext='" + callTypeContext + '\'' +
                ", geoLocation='" + geoLocation + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                ", uploaded='" + uploaded + '\'' +
                '}';
    }

    // Method to convert Call object to CSV format
    public String toCSV() {
        return callId + ";" +
                escapeCsvField(number) + ";" +
                escapeCsvField(name) + ";" +
                type.getValue() + ";" +
                UnixTimeConverter.convertUnixTimeToDate(date) + ";" +
                duration + ";" +
                escapeCsvField(voicemailUri) + ";" +
                escapeCsvField(formattedNumber) + ";" +
                escapeCsvField(countryIso) + ";" +
                (isRead ? "1" : "0") + ";" +
                escapeCsvField(callTypeContext) + ";" +
                escapeCsvField(geoLocation) + ";" +
                (isDeleted ? "1" : "0") + ";" +
                (uploaded ? "1" : "0");
    }

    // Helper method to escape fields for CSV format
    private String escapeCsvField(String value) {
        if (value == null) return "";
        return "\"" + value.replace("\"", "\"\"") + "\"";
    }

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
}