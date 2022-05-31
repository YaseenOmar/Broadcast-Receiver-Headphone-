package com.example.broadcastreceiverhead;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        MyReceiver1 myReceiver1 = new MyReceiver1();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(.HEADSET_PLUG);
    }
}