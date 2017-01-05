package com.example.danboru.sample_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Sub2Activity extends AppCompatActivity {

    TextView tampilData;

    public static String keyExtras = "data";
    String getValue = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        tampilData = (TextView) findViewById(R.id.txt_getIntent);

        try {

            Log.d("getIntentValue", "Data Berhasil di Get");
            getValue = getIntent().getStringExtra(keyExtras);

        }catch (Exception e){

            Log.d("getIntentValue", "Kesalahan Saat getIntent " + e.getMessage());

        }

        tampilData.setText(getValue);

    }
}
