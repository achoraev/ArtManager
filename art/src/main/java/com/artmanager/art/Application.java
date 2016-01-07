package com.artmanager.art;

import com.artmanager.art.model.Events;
import com.artmanager.art.model.Painting;
import com.artmanager.art.model.Shop;
import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by angelr on 05-Jan-16.
 */
public class Application extends android.app.Application{

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Shop.class);
        ParseObject.registerSubclass(Events.class);
        ParseObject.registerSubclass(Painting.class);

        Parse.enableLocalDatastore(this);
        Parse.initialize(this);
    }
}
