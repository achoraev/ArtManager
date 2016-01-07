package com.artmanager.art;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import com.artmanager.art.enums.ArtTechnic;
import com.artmanager.art.enums.EventType;
import com.artmanager.art.model.Events;
import com.artmanager.art.model.Painting;
import com.artmanager.art.model.Shop;
import com.parse.ParseException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for (int i = 0; i < 5; i++) {
            Shop saveShop = new Shop();
            saveShop.setAddress("add");
            saveShop.setCity("Sofia" + i);
            saveShop.setContactName("Didi");
            saveShop.setDetails("det");
            saveShop.setName("name" + i);
            saveShop.setTelephone("+359882545");
            saveShop.saveEventually();

            Painting painting = new Painting();
            painting.setHeight(20);
            painting.setWidth(30);
            painting.setType(ArtTechnic.GRAPHIC);
            painting.setName("Zora" + i);
            try {
                painting.save();
            } catch (ParseException e) {
                e.printStackTrace();
            }

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
