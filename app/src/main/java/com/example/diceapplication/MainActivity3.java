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

public class MainActivity3 extends AppCompatActivity {

    public SQLiteDatabase db;
    ArrayAdapter<String> mp;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView tv1 = (TextView) findViewById(R.id.s1);
        TextView tv2 = (TextView) findViewById(R.id.s2);
        TextView tv3 = (TextView) findViewById(R.id.s3);
        ImageView iv1  = (ImageView) findViewById(R.id.dice1);
        ImageView iv2 = (ImageView) findViewById(R.id.dice2);
        ImageView iv3 = (ImageView) findViewById(R.id.dice3);
        Button b4 = (Button)findViewById(R.id.bt4);

        try{
            db = openOrCreateDatabase("DiceRollerr", SQLiteDatabase.CREATE_IF_NECESSARY,null);
            db.execSQL("Create Table dice3(FirstDice Integer, SecondDice Integer, ThirdDice Integer)");
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

                ContentValues cv = new ContentValues();
                cv.put("FirstDice",tv1.getText().toString());
                cv.put("SecondDice",tv2.getText().toString());
                cv.put("ThirdDice",tv3.getText().toString());
                db.insert("dice3",null,cv);



    /*--------------------- Dice Code Starts From Here ------------------------------------ */
                final Handler handler;
                handler = new Handler(Looper.getMainLooper());
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        // Dice 1 Code Here
                        tv1.setText(String.valueOf(ans1));
                        switch (ans1)
                        {
                            case 1:
                                iv1.setImageResource(R.drawable.roller1);
                                break;
                            case 2:
                                iv1.setImageResource(R.drawable.roller2);
                                break;
                            case 3:
                                iv1.setImageResource(R.drawable.roller3);
                                break;
                            case 4:
                                iv1.setImageResource(R.drawable.roller4);
                                break;
                            case 5:
                                iv1.setImageResource(R.drawable.roller5);
                                break;
                            case 6:
                                iv1.setImageResource(R.drawable.roller6);
                                break;
                        }

                        // Dice 2 Code Here
                        tv2.setText(String.valueOf(ans2));
                        switch (ans2)
                        {
                            case 1:
                                iv2.setImageResource(R.drawable.roller1);
                                break;
                            case 2:
                                iv2.setImageResource(R.drawable.roller2);
                                break;
                            case 3:
                                iv2.setImageResource(R.drawable.roller3);
                                break;
                            case 4:
                                iv2.setImageResource(R.drawable.roller4);
                                break;
                            case 5:
                                iv2.setImageResource(R.drawable.roller5);
                                break;
                            case 6:
                                iv2.setImageResource(R.drawable.roller6);
                                break;
                        }

                        // Dice 3 Code Here
                        tv3.setText(String.valueOf(ans3));
                        switch (ans3)
                        {
                            case 1:
                                iv3.setImageResource(R.drawable.roller1);
                                break;
                            case 2:
                                iv3.setImageResource(R.drawable.roller2);
                                break;
                            case 3:
                                iv3.setImageResource(R.drawable.roller3);
                                break;
                            case 4:
                                iv3.setImageResource(R.drawable.roller4);
                                break;
                            case 5:
                                iv3.setImageResource(R.drawable.roller5);
                                break;
                            case 6:
                                iv3.setImageResource(R.drawable.roller6);
                                break;
                        }

                    }
                },500);
            }
        });
    }

}