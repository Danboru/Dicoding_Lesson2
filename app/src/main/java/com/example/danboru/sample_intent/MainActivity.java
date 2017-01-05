package com.example.danboru.sample_intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    //Butoon View
    Button keSatu, keDua, keDial;

    //EditText View
    EditText inputUser;

    //String data
    String inputanUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button
        keSatu = (Button) findViewById(R.id.btn_satu);
        keDua = (Button) findViewById(R.id.btn_dua);
        keDial = (Button) findViewById(R.id.btn_dial);


        //Button Satu
        keSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent subSatu = new Intent(MainActivity.this, Sub1Activity.class);

                startActivity(subSatu);

            }
        });

        //Button Dua
        keDua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //EditText
                inputUser = (EditText) findViewById(R.id.edt_inputanUser);

                //Input
                inputanUser = inputUser.getText().toString().trim();

                if(TextUtils.isEmpty(inputanUser)){

                    Toast.makeText(MainActivity.this, "Inputkan Data Terlebih Dahulu", Toast.LENGTH_SHORT).show();

                }else {

                    Intent subDuaActivity = new Intent(MainActivity.this, Sub2Activity.class);

                    try {

                        Log.d("PuttExtras", "Data Berhasil Di putExtras");
                        //putExtra
                        subDuaActivity.putExtra(Sub2Activity.keyExtras, inputanUser);

                    }catch (Exception e){

                        Log.d("PutExtras", "Terjadi Kesalahan Saat putExtras = " + e.getMessage());
                    }

                    startActivityForResult(subDuaActivity, 0);

                }

            }
        });

        //Button Dial
        keDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try{

                    Log.i("Dial Button", "Berhasil Dial Sebuah Nomor");
                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082121212093"));
                    startActivity(intent);

                }catch (Exception e){

                    Log.i("Dial Button", "Terjadi Kesalahan di Button Dial = " + e.getMessage());

                }

            }
        });


    }
}
