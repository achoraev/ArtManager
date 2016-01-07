package com.artmanager.art.enums;

public enum ArticulType {
	PAINTING(1, "painting"),
	RINGS(2, "rings"),
	MEDALLION(3, "medallion"),
	BANGLE(4, "bangle"); // grivna

	public int val;
	public String strVal;

	private ArticulType(int val, String strVal) {
		this.val = val;
		this.strVal = strVal;
	}
	
	public ArticulType valueOf(int val){
		switch (val) {
		case 1:
			return PAINTING;
		case 2:
			return RINGS;
		case 3:
			return MEDALLION;
		case 4:
			return BANGLE;
		}
		throw new RuntimeException("ArticulTime: value not supportted " + val);
	}
}
