package com.example.hacknu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText user_iin;
    EditText number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }



        public void nextPage(View view) {
            user_iin = findViewById(R.id.user_iin);
            number = findViewById(R.id.number);
            if(user_iin.getText().toString().trim().equals("") || number.getText().toString().trim().equals(""))
                Toast.makeText(LoginActivity.this, R.string.no_iin, Toast.LENGTH_SHORT).show();
            else {

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

            }

    }
}