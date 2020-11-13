package com.example.qt.dl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.qt.MainActivity;
import com.example.qt.R;

public class welcome extends AppCompatActivity {
    Handler handler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(welcome.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
