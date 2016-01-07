package com.artmanager.art.model;

import com.artmanager.art.enums.ArtShopType;
import com.artmanager.art.interfaces.HasId;

public class ArtShop implements HasId {
	private static final long serialVersionUID = 7015753045977616091L;

	private String name;
	private ArtShopType type;
	private Address address;
	private String ownerName;
	private String contactName;
	private String telephone;
	private String eMail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public int setId() {
		return id;
	}

	public ArtShopType getType() {
		return type;
	}

	public void setType(ArtShopType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "ArtShop [name=" + name + ", type=" + type + ", address=" + address + ", ownerName=" + ownerName
				+ ", contactName=" + contactName + ", telephone=" + telephone + ", eMail=" + eMail + "]";
	}

}
