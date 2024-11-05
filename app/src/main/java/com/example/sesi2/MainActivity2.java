package com.example.sesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.v("act2", "on create dipanggil");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("act2", "on start dipanggil");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("act2", "on resume dipanggil");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("act2", "on pause dipanggil");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("act2", "on stop dipanggil");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("act2", "on destroy dipanggil");
    }
}