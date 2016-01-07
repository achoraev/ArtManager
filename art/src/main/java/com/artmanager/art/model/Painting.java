package com.artmanager.art.model;

import com.artmanager.art.enums.ArtTechnic;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

@ParseClassName("Painting")
public class Painting extends ParseObject {
	public Painting(){}

	public int getHeight() {
		return getInt("Height");
	}

	public void setHeight(int height) {
		put("Height", height);
	}

	public String getName() {
		return getString("Name");
	}

	public void setName(String name) {
		put("Name", name);
	}

	public ArtTechnic getType() {
		return ArtTechnic.getByStringValue(getString("Type"));
	}

	public void setType(ArtTechnic type) {
		put("Type", type.strVal);
	}

	public int getWidth() {
		return getInt("Width");
	}

	public void setWidth(int width) {
		put("Width", width);
	}

	public static ParseQuery<Painting> getQuery() {
		return ParseQuery.getQuery(Painting.class);
	}

//	private static final long serialVersionUID = 5725441302360724022L;
//	private int width;
//	private int height;
//
//	public int getWidth() {
//		return width;
//	}
//
//	public void setWidth(int width) {
//		this.width = width;
//	}
//
//	public int getHeight() {
//		return height;
//	}
//
//	public void setHeight(int height) {
//		this.height = height;
//	}
}
