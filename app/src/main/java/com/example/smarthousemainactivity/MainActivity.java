package com.example.smarthousemainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AddRoom(View view) {
        Intent intent;
        intent = new Intent(MainActivity.this, AddRoomActivity.class);
        startActivity(intent);
    }
}