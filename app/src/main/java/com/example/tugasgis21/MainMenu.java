package com.example.tugasgis21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    public Button button1;
    public Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);



        button1.setOnClickListener(v -> {
            Intent intent1 = new Intent(MainMenu.this,MapsActivity.class);
            startActivity(intent1);
        });

        button2.setOnClickListener(v -> {
            Intent intent2 = new Intent(MainMenu.this,MapsActivity2.class);
            startActivity(intent2);
        });
    }
}