package com.artmanager.art.enums;

public enum EventState {
	PENDING(1, "Pending"),
	SOLD(2, "Sold"),
	RETURED(3, "Returned");
	
	public int val;
	public String strVal;

	private EventState(int val, String strVal) {
		this.val = val;
		this.strVal = strVal;
	}
	
	public EventState valueOf(int val){
		switch (val) {
		case 1:
			return PENDING;
		case 2:
			return SOLD;
		case 3:
			return RETURED;
		}
		throw new RuntimeException("ArtTechnic: value not supportted " + val);
	}
}
