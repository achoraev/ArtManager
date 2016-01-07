package com.artmanager.art.enums;

/**
 * Created by difince on 06.01.16.
 */
public enum EventType {
    AVAILABLE("Available"),
    CHECK_IN("CheckIn"),
    CHECK_OUT("Checkout"),
    SOLD("Sold");

    public String strVal;

    EventType(String strVal) {
        this.strVal = strVal;
    }

    public static EventType getByStringValue(String strVal) {
        switch (strVal) {
            case "Available":
                return EventType.AVAILABLE;
            case "CheckIn":
                return EventType.CHECK_IN;
            case "Checkout":
                return EventType.CHECK_OUT;
            case "Sold":
                return EventType.SOLD;
        }
        throw new RuntimeException("EventType value not supported " + strVal);
    }
}
