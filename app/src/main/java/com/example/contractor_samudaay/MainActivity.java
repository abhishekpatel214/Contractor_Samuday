package com.example.contractor_samudaay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                navigateToDestination();
            }
        }, 3000); // Delay of 5 seconds (5000 milliseconds)
    }

    private void navigateToDestination() {
        Intent intent = new Intent(MainActivity.this,activity_OTP.class);
        startActivity(intent);
        finish();

    }
}