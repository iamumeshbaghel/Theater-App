package com.ubproject.theater;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void on_add(View view) {
        Intent intent = new Intent(MainActivity.this, Insert.class);
        startActivity(intent);
    }
}