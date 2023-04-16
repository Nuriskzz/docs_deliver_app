package com.example.hacknu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private String selectedDelivery = "";
    EditText adress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout pony = findViewById(R.id.linearLayout1);
        final LinearLayout cdek = findViewById(R.id.linearLayout2);
        final LinearLayout tigr = findViewById(R.id.linearLayout3);
        final LinearLayout rika = findViewById(R.id.linearLayout4);

        final Button start = findViewById(R.id.button_next_page2);

        CheckBox checkBox = findViewById(R.id.checkBox);
        TextView textView = findViewById(R.id.text_1);
        EditText editText = findViewById(R.id.text_2);



        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView.setVisibility(View.VISIBLE);
                    editText.setVisibility(View.VISIBLE);
                } else {
                    textView.setVisibility(View.INVISIBLE);
                    editText.setVisibility(View.INVISIBLE);
                }
            }
        });


        pony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDelivery = "pony";
                pony.setBackgroundResource(R.drawable.round_back_white_green_round10);
                cdek.setBackgroundResource(R.drawable.round_back_white_round10);
                tigr.setBackgroundResource(R.drawable.round_back_white_round10);
                rika.setBackgroundResource(R.drawable.round_back_white_round10);

            }
        });

        cdek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDelivery = "cdek";
                pony.setBackgroundResource(R.drawable.round_back_white_round10);
                cdek.setBackgroundResource(R.drawable.round_back_white_green_round10);
                tigr.setBackgroundResource(R.drawable.round_back_white_round10);
                rika.setBackgroundResource(R.drawable.round_back_white_round10);

            }
        });
        tigr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDelivery = "tigr";
                pony.setBackgroundResource(R.drawable.round_back_white_round10);
                cdek.setBackgroundResource(R.drawable.round_back_white_round10);
                tigr.setBackgroundResource(R.drawable.round_back_white_green_round10);
                rika.setBackgroundResource(R.drawable.round_back_white_round10);

            }
        });
        rika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedDelivery = "rika";
                pony.setBackgroundResource(R.drawable.round_back_white_round10);
                cdek.setBackgroundResource(R.drawable.round_back_white_round10);
                tigr.setBackgroundResource(R.drawable.round_back_white_round10);
                rika.setBackgroundResource(R.drawable.round_back_white_green_round10);

            }
        });


    }
    public void nextPageOpen(View view) {
        adress = findViewById(R.id.adress);
        if(adress.getText().toString().trim().equals(""))
            Toast.makeText(MainActivity.this, R.string.no_adress, Toast.LENGTH_SHORT).show();
        else {
            Intent intent = new Intent(this, PayActivity.class);
            startActivity(intent);
        }
    }
}