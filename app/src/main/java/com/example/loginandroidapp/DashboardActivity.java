package com.example.loginandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    String NameHolder;
    TextView Name,Email, Password;
    String EditFullName;
    Button LogOUT ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Name = (TextView)findViewById(R.id.textView1);
        Email = (TextView)findViewById(R.id.textView2);
        Password= (TextView)findViewById(R.id.textView3) ;
        LogOUT = (Button)findViewById(R.id.button1);


        Intent intent = getIntent();


        NameHolder = intent.getStringExtra(MainActivity.userName);
        NameHolder = intent.getStringExtra(RegisterActivity.emailAddress);
        NameHolder = intent.getStringExtra(RegisterActivity.password);




        Name.setText(Name.getText().toString()+ NameHolder);
        Email.setText(Email.getText().toString()+ NameHolder);
        Password.setText(Password.getText().toString()+ NameHolder);
        //Name.setText(Name.getText().toString()+ NameHolder);
        //EditFullName = intent.getStringExtra(RegisterActivity.fullName);


        LogOUT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                finish();

                Toast.makeText(DashboardActivity.this,"Log Out Successfull", Toast.LENGTH_LONG).show();

            }
        });

    }
}