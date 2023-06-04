package com.example.contractor_samudaay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.EditText;
import android.widget.RadioButton;

public class add_Workerpage extends AppCompatActivity {

    private Handler handler;


    RadioButton SuperVisor = findViewById(R.id.option2);
    RadioButton Majdor = findViewById(R.id.option3);
    RadioButton Karigar = findViewById(R.id.option4);
    EditText fullname = findViewById(R.id.full_name_editText);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_workerpage);








    }
}