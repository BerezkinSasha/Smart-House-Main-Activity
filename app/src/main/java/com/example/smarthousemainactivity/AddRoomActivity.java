package com.example.smarthousemainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddRoomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_room);
    }

    public void Back(View view) {
        Intent intent;
        intent = new Intent(AddRoomActivity.this, MainActivity.class);
        startActivity(intent);
    }
}