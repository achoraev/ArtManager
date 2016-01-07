package com.artmanager.art.model;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by angelr on 05-Jan-16.
 */
@ParseClassName("Shop")
public class Shop extends ParseObject {

    public Shop(){}

    public String getAddress() {
        return getString("Address");
    }

    public void setAddress(String address) {
        put("Address", address);
    }

    public String getCity() {
        return getString("City");
    }

    public void setCity(String city) {
        put("City", city);
    }

    public String getContactName() {
        return getString("ContactName");
    }

    public void setContactName(String contName) {
        put("ContactName", contName);
    }

    public String getDetails() {
        return getString("Details");
    }

    public void setDetails(String det) {
        put("Details", det);
    }

//    public InstrumentType getType() {
//        return InstrumentType.parse(getString("type"));
//    }
//    public void setType(InstrumentType type) {
//        put("type", type.toString());
//    }
    public String getName() {
        return getString("Name");
    }

    public void setName(String name) {
        put("Name", name);
    }

    public String getTelephone() {
        return getString("Telephone");
    }

    public void setTelephone(String tel) {
        put("Telephone", tel);
    }

    public static ParseQuery<Shop> getQuery() {
        return ParseQuery.getQuery(Shop.class);
    }
}
