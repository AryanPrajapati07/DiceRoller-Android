package com.example.diceapplication;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity4 extends AppCompatActivity {

    public SQLiteDatabase db;
    ArrayAdapter<String> mp;
    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        TextView s1 = (TextView) findViewById(R.id.sc1);
        TextView s2 = (TextView) findViewById(R.id.sc2);
        TextView s3 = (TextView) findViewById(R.id.sc3);
        TextView s4 = (TextView) findViewById(R.id.sc4);
        ImageView img1  = (ImageView) findViewById(R.id.di1);
        ImageView img2 = (ImageView) findViewById(R.id.di2);
        ImageView img3 = (ImageView) findViewById(R.id.di3);
        ImageView img4 = (ImageView) findViewById(R.id.di4);
        Button b4 = (Button)findViewById(R.id.btn6);

        try{
            db = openOrCreateDatabase("DiceRollerr", SQLiteDatabase.CREATE_IF_NECESSARY,null);
            db.execSQL("Create Table dice4(FirstDice Integer, SecondDice Integer, ThirdDice Integer, FourthDice Integer)");
        }catch(SQLException e){

        }

        // Sound Code
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dice);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                // Random Number Generates Here
                Random random = new Random();
                int ans1 = random.nextInt(6) + 1;
                int ans2 = random.nextInt(6) + 1;
                int ans3 = random.nextInt(6) + 1;
                int ans4 = random.nextInt(6) + 1;

                ContentValues cv = new ContentValues();
                cv.put("FirstDice",s1.getText().toString());
                cv.put("SecondDice",s2.getText().toString());
                cv.put("ThirdDice",s3.getText().toString());
                cv.put("FourthDice",s4.getText().toString());
                db.insert("dice4",null,cv);


                /*--------------------- Dice Code Starts From Here ------------------------------------ */
                final Handler handler;
                handler = new Handler(Looper.getMainLooper());
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        // Dice 1 Code Here
                        s1.setText(String.valueOf(ans1));
                        switch (ans1)
                        {
                            case 1:
                                img1.setImageResource(R.drawable.roller1);
                                break;
                            case 2:
                                img1.setImageResource(R.drawable.roller2);
                                break;
                            case 3:
                                img1.setImageResource(R.drawable.roller3);
                                break;
                            case 4:
                                img1.setImageResource(R.drawable.roller4);
                                break;
                            case 5:
                                img1.setImageResource(R.drawable.roller5);
                                break;
                            case 6:
                                img1.setImageResource(R.drawable.roller6);
                                break;
                        }

                        // Dice 2 Code Here
                        s2.setText(String.valueOf(ans2));
                        switch (ans2)
                        {
                            case 1:
                                img2.setImageResource(R.drawable.roller1);
                                break;
                            case 2:
                                img2.setImageResource(R.drawable.roller2);
                                break;
                            case 3:
                                img2.setImageResource(R.drawable.roller3);
                                break;
                            case 4:
                                img2.setImageResource(R.drawable.roller4);
                                break;
                            case 5:
                                img2.setImageResource(R.drawable.roller5);
                                break;
                            case 6:
                                img2.setImageResource(R.drawable.roller6);
                                break;
                        }

                        // Dice 3 Code Here
                        s3.setText(String.valueOf(ans3));
                        switch (ans3)
                        {
                            case 1:
                                img3.setImageResource(R.drawable.roller1);
                                break;
                            case 2:
                                img3.setImageResource(R.drawable.roller2);
                                break;
                            case 3:
                                img3.setImageResource(R.drawable.roller3);
                                break;
                            case 4:
                                img3.setImageResource(R.drawable.roller4);
                                break;
                            case 5:
                                img3.setImageResource(R.drawable.roller5);
                                break;
                            case 6:
                                img3.setImageResource(R.drawable.roller6);
                                break;
                        }

                        // Dice 4 Code Here
                        s4.setText(String.valueOf(ans4));
                        switch (ans4)
                        {
                            case 1:
                                img4.setImageResource(R.drawable.roller1);
                                break;
                            case 2:
                                img4.setImageResource(R.drawable.roller2);
                                break;
                            case 3:
                                img4.setImageResource(R.drawable.roller3);
                                break;
                            case 4:
                                img4.setImageResource(R.drawable.roller4);
                                break;
                            case 5:
                                img4.setImageResource(R.drawable.roller5);
                                break;
                            case 6:
                                img4.setImageResource(R.drawable.roller6);
                                break;
                        }
                    }
                },500);
            }
        });
    }

}