package com.example.contractor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_otpverification extends AppCompatActivity {




    EditText otpenter;
    Button submitotp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpverification);

        otpenter = findViewById(R.id.otpenter);
        submitotp = findViewById(R.id.submitotp);

        TextView textView = findViewById(R.id.otpmobileshow);
        textView.setText(String.format(

                "+91-%s",getIntent().getStringExtra("mobile")
        ));

    }
}