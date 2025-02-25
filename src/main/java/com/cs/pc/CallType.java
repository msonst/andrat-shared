package com.cs.pc;

import java.io.Serializable;

// Enum for CallType
public enum CallType  implements Serializable{
    UNKNOWN(0),
    INCOMING(1),
    OUTGOING(2),
    MISSED(3);

    private final int value;

    CallType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static CallType fromValue(int value) {
        for (CallType type : CallType.values()) {
            if (type.value == value) {
                return type;
            }
        }
        return UNKNOWN;  // Default to UNKNOWN if value is not found
    }
}