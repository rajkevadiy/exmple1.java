package com.example.exmple1java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {

    TextView name,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name=findViewById(R.id.txt_name);
        email=findViewById(R.id.txt_email);


    String Name=getIntent().getStringExtra("name");
    String Email=getIntent().getStringExtra("email");


    name.setText(""+name);
    email.setText(""+email);
    }
}