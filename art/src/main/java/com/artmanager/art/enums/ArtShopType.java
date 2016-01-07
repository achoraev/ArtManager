package com.artmanager.art.enums;

public enum ArtShopType {
	GALLERY(1, "Gallery"),
	SHOP(2, "shop"),
	OTHER(3, "Other");
	
	public int val;
	public String strVal;

	private ArtShopType(int val, String strVal) {
		this.val = val;
		this.strVal = strVal;
	}
	
	public ArtShopType valueOf(int val){
		switch (val) {
		case 1:
			return GALLERY;
		case 2:
			return SHOP;
		case 3:
			return OTHER;
		}
		throw new RuntimeException("ArtShopType: value not supportted " + val);
	}
}
