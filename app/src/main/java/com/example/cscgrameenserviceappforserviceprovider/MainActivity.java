package com.example.cscgrameenserviceappforserviceprovider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
   private EditText phoneno;
   Button otp;
   FirebaseAuth m
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneno=findViewById(R.id.editTextPhone);
        otp=findViewById(R.id.getotp);

    }
    private int generateOTP()
    {

        return ;
    }
}