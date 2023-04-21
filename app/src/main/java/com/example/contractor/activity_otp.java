package com.example.contractor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class activity_otp extends AppCompatActivity {
    EditText enternumber;
    Button getotp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        enternumber = findViewById(R.id.enternumber);
        getotp = findViewById(R.id.getotp);

        getotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the mobile number is empty
                if (enternumber.getText().toString().trim().isEmpty()) {
                    Toast.makeText(activity_otp.this, "Enter mobile number", Toast.LENGTH_SHORT).show();
                } else if (enternumber.getText().toString().trim().length() < 10) { // Check if the mobile number is less than 10 digits
                    Toast.makeText(activity_otp.this, "Please enter a correct number", Toast.LENGTH_LONG).show();
                } else {
                    // Start the verification activity and pass the mobile number as an extra
                    Intent intent = new Intent(getApplicationContext(), activity_otpverification.class);
                    intent.putExtra("mobile", enternumber.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
