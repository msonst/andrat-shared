package com.cs.pc;

import java.io.Serializable;

public class BtDevice implements Serializable{
    private Long timestamp;
    private String name;
    private String address;
    private Integer rssi;
	private String device;

    public BtDevice() {
    }

    public BtDevice(String device, Long timestamp, String name, String address, Integer rssi) {
        this.device=device;
		this.timestamp = timestamp;
        this.name = name;
        this.address = address;
        this.rssi = rssi;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRssi() {
        return rssi;
    }

    public void setRssi(Integer rssi) {
        this.rssi = rssi;
    }

    @Override
    public String toString() {
        return "BtDevice{" +
                "timestamp=" + timestamp +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", rssi=" + rssi +
                '}';
    }

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}
}
