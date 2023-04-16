package com.example.hacknu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;

public class EndActivity extends AppCompatActivity {
    String textDeliver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
    }
    public void OnLabel(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);




    }



    }
