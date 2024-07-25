package com.example.diceapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);


        Button b1 = (Button)findViewById(R.id.h1);
        Button b2 = (Button)findViewById(R.id.h2);
        Button b3 = (Button)findViewById(R.id.h3);
        Button b4 = (Button)findViewById(R.id.h4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(History.this,DiceOneHistory.class);
                startActivity(i1);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(History.this, DiceTwoHistory.class);
                startActivity(i2);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(History.this, DiceThreeHistory.class);
                startActivity(i3);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4 = new Intent(History.this, DiceFourHistory.class);
                startActivity(i4);
            }
        });

    }
}