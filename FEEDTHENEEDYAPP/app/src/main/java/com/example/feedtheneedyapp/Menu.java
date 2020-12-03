package com.example.feedtheneedyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
    Button breakfast,lunch,dinner;
    TextView menu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        breakfast = findViewById(R.id.btn1);
        lunch = findViewById(R.id.btn2);
        dinner = findViewById(R.id.btn3);

        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),BreakFast.class);
                startActivity(intent);
            }
        });
        lunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(getApplicationContext(),Lunch.class);
                startActivity(intent1);
            }
        });
        dinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(),Dinner.class);
                startActivity(intent2);
            }
        });



    }

}