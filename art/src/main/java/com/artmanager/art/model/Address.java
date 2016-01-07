package com.artmanager.art.model;

import com.artmanager.art.interfaces.HasId;

public class Address implements HasId {

	private static final long serialVersionUID = 1814657126966191476L;
	private Town town;
	private int townId;
	private String details;

	public int getTownId() {
		return townId;
	}

	public void setTownId(int townId) {
		this.townId = townId;
	}


	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public int setId() {
		return id;
	}

}
