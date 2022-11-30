package com.example.exmple1java;

import static com.example.exmple1java.R.id.email;
import static com.example.exmple1java.R.id.name;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name,email;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      name=findViewById(R.id.name);
      email=findViewById(R.id.email);
      btn=findViewById(R.id.btn);


      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {


              String Name=name.getText().toString();
              String Email=email.getText().toString();



              Intent intent=new Intent(MainActivity.this,second.class);
              intent.putExtra("name",Name);
              intent.putExtra("email",Email);
              startActivity(intent);

          }
      });



    }
}