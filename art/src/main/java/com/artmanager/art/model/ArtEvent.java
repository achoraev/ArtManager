package com.artmanager.art.model;

import com.artmanager.art.enums.EventState;
import com.artmanager.art.interfaces.HasId;

import java.util.Date;

public class ArtEvent implements HasId {

	private static final long serialVersionUID = -2265059428226807387L;

	private int acticulId;
	private int artShopId;
	private Date dateIn;
	private Date dateOut;
	private EventState state;
	private Integer price;
	@Override
	public int getId() {
		return id;
	}

	@Override
	public int setId() {
		return id;
	}

	public int getActiculId() {
		return acticulId;
	}

	public void setActiculId(int acticulId) {
		this.acticulId = acticulId;
	}

	public int getArtShopId() {
		return artShopId;
	}

	public void setArtShopId(int artShopId) {
		this.artShopId = artShopId;
	}

	public Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	public EventState getState() {
		return state;
	}

	public void setState(EventState state) {
		this.state = state;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ArtEvent [acticulId=" + acticulId + ", artShopId=" + artShopId + ", dateIn=" + dateIn + ", dateOut="
				+ dateOut + ", state=" + state + ", price=" + price + "]";
	}

}
