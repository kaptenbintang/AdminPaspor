package com.example.adminpaspor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuUtama extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);


        button = (Button) findViewById(R.id.btnQR);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qrcode();
            }
        });

        button = (Button) findViewById(R.id.btnTandatangan);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tandatangan();
            }
        });
    }
    private void qrcode() {
        Intent intent = new Intent(this, qr.class);
        startActivity(intent);

    }

    private void tandatangan() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
