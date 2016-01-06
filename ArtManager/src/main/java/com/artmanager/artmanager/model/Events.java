package com.artmanager.artmanager.model;

import com.artmanager.artmanager.enums.EventType;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseQuery;

/**
 * Created by angelr on 05-Jan-16.
 */
@ParseClassName("Events")
public class Events extends ParseObject {
    public Events(){}

    public EventType getEventType() {
        return EventType.getByStringValue(getString("EventType"));
    }

    public void setEventType(EventType eventType) {
        put("EventType", eventType.strVal);
    }

    public int getRevenue() {
        return getInt("Revenue");
    }

    public void setRevenue(int revenue) {
        put("Revenue", revenue);
    }

//    public static ParseQuery<Events> getQuery() {
//        return ParseQuery.getQuery(Events.class);
//    }


    public String getShopId() {
        return getString("ShopId");
    }


    public void setShopId(String shopId) {
        put("ShopId", shopId);
    }

    public void setShop(Shop shop) {
        put("ShopId", shop.get("objectId"));
    }

    public String getPaintingId() {
        return getString("PaintingId");
    }

    public void setPaintingId(String paintingId) {
        put("PaintingId", paintingId);
    }
    public void setPainting(Painting painting) {
        put("PaintingId", painting.get("objectId"));
    }
    public static ParseQuery<Events> getQueryDescendingOrder() {
        return ParseQuery.getQuery(Events.class).orderByDescending("createdAt");
    }

//    public static ParseQuery<Events> getQueryByShop() {
//        return ParseQuery.getQuery(Events.class).whereEqualTo("ShopId",);
//    }
}
