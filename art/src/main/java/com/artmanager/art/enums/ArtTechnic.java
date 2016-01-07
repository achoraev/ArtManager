package com.artmanager.art.enums;

public enum ArtTechnic {
	OIL_PAINTING("Oil Painting"),
	GRAPHIC("Graphic"),
	WATER_PAINTING("Water Painting");

	public String strVal;

	ArtTechnic(String strVal) {
		this.strVal = strVal;
	}

	public static ArtTechnic getByStringValue(String val) {
		switch (val) {
			case "Oil Painting":
				return ArtTechnic.OIL_PAINTING;
			case "Graphic":
				return ArtTechnic.GRAPHIC;
			case "Water Painting":
				return ArtTechnic.WATER_PAINTING;
		}
		throw new RuntimeException("Sport Type value not supported " + val);
	}
}
