package com.cs.pc;

import java.io.Serializable;

public enum SmsType  implements Serializable{
	MESSAGE_TYPE_ALL, MESSAGE_TYPE_INBOX, MESSAGE_TYPE_DRAFT, MESSAGE_TYPE_OUTBOX, MESSAGE_TYPE_SENT,
	MESSAGE_TYPE_FAILED, MESSAGE_TYPE_QUEUED;

	public static SmsType fromInt(int type) {
		if (type < MESSAGE_TYPE_ALL.ordinal() || type > MESSAGE_TYPE_QUEUED.ordinal())
			throw new IllegalArgumentException("Invalid message type: " + type);

		return SmsType.values()[type];
	}
}
