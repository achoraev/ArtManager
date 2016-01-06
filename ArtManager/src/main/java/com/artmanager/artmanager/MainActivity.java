package com.artmanager.artmanager;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.artmanager.artmanager.enums.ArtTechnic;
import com.artmanager.artmanager.enums.EventType;
import com.artmanager.artmanager.model.Events;
import com.artmanager.artmanager.model.Painting;
import com.artmanager.artmanager.model.Shop;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i<5 ; i++) {
            Shop saveShop = new Shop();
            saveShop.setAddress("add");
            saveShop.setCity("Sofia" + i);
            saveShop.setContactName("Didi");
            saveShop.setDetails("det");
            saveShop.setName("name" + i);
            saveShop.setTelephone("+359882545");
            saveShop.saveEventually();

            Painting  painting = new Painting();
            painting.setHeight(20);
            painting.setWidth(30);
            painting.setType(ArtTechnic.GRAPHIC);
            painting.setName("Zora"+ i);
            painting.saveEventually();

            Events event = new Events();
            event.setEventType(EventType.CHECK_IN);
            event.setRevenue(125);
            event.setPainting(painting);
            event.setShop(saveShop);
            event.saveEventually();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
