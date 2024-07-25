package com.example.diceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        ImageView dc1  = (ImageView)findViewById(R.id.iv);
        Button d1 = (Button)findViewById(R.id.btn1);
        Button d2 = (Button)findViewById(R.id.btn2);
        Button d3 = (Button)findViewById(R.id.btn3);
        Button d4 = (Button)findViewById(R.id.btn4);
        Button d5 = (Button)findViewById(R.id.btn5);

        dc1.setImageResource(R.drawable.start);

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in1 = new Intent(Start.this,MainActivity.class);
                startActivity(in1);
            }
        });

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in2 = new Intent(Start.this,MainActivity2.class);
                startActivity(in2);
            }
        });

        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in3 = new Intent(Start.this,MainActivity3.class);
                startActivity(in3);
            }
        });

        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in4 = new Intent(Start.this,MainActivity4.class);
                startActivity(in4);
            }
        });

        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in5 = new Intent(Start.this,History.class);
                startActivity(in5);
            }
        });
    }
}