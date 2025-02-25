package com.cs.pc;

import java.io.Serializable;
import java.sql.Timestamp;

public class GPSData implements Serializable {

    private long timeMs;
    private String device;
    private Long elapsedRealtimeNs;
    private Double elapsedRealtimeUncertaintyNs;
    private Double latitude;
    private Double longitude;
    private Float horizontalAccuracyMeters;
    private Double altitudeMeters;
    private Double altitudeAccuracyMeters;
    private Float speedMetersPerSecond;
    private Float speedAccuracyMetersPerSecond;
    private Float bearingDegrees;
    private Float bearingAccuracyDegrees;
    private Double mslAltitudeMeters;
    private Float mslAltitudeAccuracyMeters;

    // Default constructor
    public GPSData() {}

    // Constructor with arguments
    public GPSData(String device, Long timeMs, Double latitude, Double longitude) {
        this.device = device;
        this.timeMs=timeMs;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public GPSData(String device, Long timeMs, Long elapsedRealtimeNs, Double elapsedRealtimeUncertaintyNs,
                   Double latitude, Double longitude, Float horizontalAccuracyMeters, Double altitudeMeters,
                   Double altitudeAccuracyMeters, Float speedMetersPerSecond, Float speedAccuracyMetersPerSecond,
                   Float bearingDegrees, Float bearingAccuracyDegrees, Double mslAltitudeMeters,
                   Float mslAltitudeAccuracyMeters) {
        this.device = device;
        this.timeMs=timeMs;
        this.elapsedRealtimeNs = elapsedRealtimeNs;
        this.elapsedRealtimeUncertaintyNs = elapsedRealtimeUncertaintyNs;
        this.latitude = latitude;
        this.longitude = longitude;
        this.horizontalAccuracyMeters = horizontalAccuracyMeters;
        this.altitudeMeters = altitudeMeters;
        this.altitudeAccuracyMeters = altitudeAccuracyMeters;
        this.speedMetersPerSecond = speedMetersPerSecond;
        this.speedAccuracyMetersPerSecond = speedAccuracyMetersPerSecond;
        this.bearingDegrees = bearingDegrees;
        this.bearingAccuracyDegrees = bearingAccuracyDegrees;
        this.mslAltitudeMeters = mslAltitudeMeters;
        this.mslAltitudeAccuracyMeters = mslAltitudeAccuracyMeters;
    }


    // Getters and Setters

    @Override
	public String toString() {
		return "GPSData [timeMs=" + timeMs + ", device=" + device + ", elapsedRealtimeNs=" + elapsedRealtimeNs
				+ ", elapsedRealtimeUncertaintyNs=" + elapsedRealtimeUncertaintyNs + ", latitude=" + latitude
				+ ", longitude=" + longitude + ", horizontalAccuracyMeters=" + horizontalAccuracyMeters
				+ ", altitudeMeters=" + altitudeMeters + ", altitudeAccuracyMeters=" + altitudeAccuracyMeters
				+ ", speedMetersPerSecond=" + speedMetersPerSecond + ", speedAccuracyMetersPerSecond="
				+ speedAccuracyMetersPerSecond + ", bearingDegrees=" + bearingDegrees + ", bearingAccuracyDegrees="
				+ bearingAccuracyDegrees + ", mslAltitudeMeters=" + mslAltitudeMeters + ", mslAltitudeAccuracyMeters="
				+ mslAltitudeAccuracyMeters + "]";
	}

	public String getDevice() { return device; }
    public void setDevice(String device) { this.device = device; }

    public Long getElapsedRealtimeNs() { return elapsedRealtimeNs; }
    public void setElapsedRealtimeNs(Long elapsedRealtimeNs) { this.elapsedRealtimeNs = elapsedRealtimeNs; }

    public Double getElapsedRealtimeUncertaintyNs() { return elapsedRealtimeUncertaintyNs; }
    public void setElapsedRealtimeUncertaintyNs(Double elapsedRealtimeUncertaintyNs) { this.elapsedRealtimeUncertaintyNs = elapsedRealtimeUncertaintyNs; }

    public Double getLatitude() { return latitude; }
    public void setLatitude(Double latitude) { this.latitude = latitude; }

    public Double getLongitude() { return longitude; }
    public void setLongitude(Double longitude) { this.longitude = longitude; }

    public Float getHorizontalAccuracyMeters() { return horizontalAccuracyMeters; }
    public void setHorizontalAccuracyMeters(Float horizontalAccuracyMeters) { this.horizontalAccuracyMeters = horizontalAccuracyMeters; }

    public Double getAltitudeMeters() { return altitudeMeters; }
    public void setAltitudeMeters(Double altitudeMeters) { this.altitudeMeters = altitudeMeters; }

    public Double getAltitudeAccuracyMeters() { return altitudeAccuracyMeters; }
    public void setAltitudeAccuracyMeters(Double altitudeAccuracyMeters) { this.altitudeAccuracyMeters = altitudeAccuracyMeters; }

    public Float getSpeedMetersPerSecond() { return speedMetersPerSecond; }
    public void setSpeedMetersPerSecond(Float speedMetersPerSecond) { this.speedMetersPerSecond = speedMetersPerSecond; }

    public Float getSpeedAccuracyMetersPerSecond() { return speedAccuracyMetersPerSecond; }
    public void setSpeedAccuracyMetersPerSecond(Float speedAccuracyMetersPerSecond) { this.speedAccuracyMetersPerSecond = speedAccuracyMetersPerSecond; }

    public Float getBearingDegrees() { return bearingDegrees; }
    public void setBearingDegrees(Float bearingDegrees) { this.bearingDegrees = bearingDegrees; }

    public Float getBearingAccuracyDegrees() { return bearingAccuracyDegrees; }
    public void setBearingAccuracyDegrees(Float bearingAccuracyDegrees) { this.bearingAccuracyDegrees = bearingAccuracyDegrees; }

    public Double getMslAltitudeMeters() { return mslAltitudeMeters; }
    public void setMslAltitudeMeters(Double mslAltitudeMeters) { this.mslAltitudeMeters = mslAltitudeMeters; }

    public Float getMslAltitudeAccuracyMeters() { return mslAltitudeAccuracyMeters; }
    public void setMslAltitudeAccuracyMeters(Float mslAltitudeAccuracyMeters) { this.mslAltitudeAccuracyMeters = mslAltitudeAccuracyMeters; }

    public long getTimeMs() {
        return timeMs;
    }

    public void setTimeMs(long timeMs) {
        this.timeMs = timeMs;
    }
}
