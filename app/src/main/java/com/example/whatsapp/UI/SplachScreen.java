package com.example.whatsapp.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.whatsapp.R;

public class SplachScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splach_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in =new Intent(SplachScreen.this,MainActivity.class);
                startActivity(in);
                finish();
            }
        },2000);
    }
    }
