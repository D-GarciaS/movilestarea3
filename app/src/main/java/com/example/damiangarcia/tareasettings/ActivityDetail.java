package com.example.damiangarcia.tareasettings;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.damiangarcia.tareasettings.Beans.ItemProduct;

public class ActivityDetail extends AppCompatActivity {

    protected EditText title, store, location;
    protected ImageView image;
    protected Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        title = (EditText) findViewById(R.id.activity_detail_title);
        store = (EditText) findViewById(R.id.activity_detail_store);
        location = (EditText) findViewById(R.id.activity_detail_location);
        image = (ImageView) findViewById(R.id.activity_detail_image);
        save = (Button) findViewById(R.id.activity_detail_save);

        ItemProduct product = getIntent().getParcelableExtra("ITEM");

        store.setText(product.getStore());
        title.setText(product.getTitle());
        location.setText(product.getLocation());
        switch (product.getImage()) {
            case 0:
                image.setImageResource(R.drawable.mac);
                break;
            case 1:
                image.setImageResource(R.drawable.alienware);
                break;
        }
    }
}
