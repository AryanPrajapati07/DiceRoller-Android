package com.example.diceapplication;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    public SQLiteDatabase db;
    ArrayAdapter<String> mp;
    ImageView imageView;
    ImageView imageView2;
    Random random = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tv1 = (TextView) findViewById(R.id.score2);
        TextView tv2 = (TextView) findViewById(R.id.score3);
        ImageView imageView  = (ImageView) findViewById(R.id.dice1);
        ImageView imageView2 = (ImageView) findViewById(R.id.dice2);
        Button b2 = (Button)findViewById(R.id.button2);

        try{
            db = openOrCreateDatabase("DiceRollerr", SQLiteDatabase.CREATE_IF_NECESSARY,null);
            db.execSQL("Create Table dice2(FirstDice Integer, SecondDice Integer)");
        }catch(SQLException e){

        }

        // Sound Code
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.dice);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Dice 2 Code Here
                mp.start();
                // Random Number Generated
                int ans = random.nextInt(6) + 1;

                ContentValues cv = new ContentValues();
                cv.put("FirstDice",tv1.getText().toString());
                cv.put("SecondDice",tv2.getText().toString());
                db.insert("dice2",null,cv);

                // Dice 1 Code Here
                tv1.setText(String.valueOf(ans));
                switch (ans)
                {
                    case 1:
                        imageView.setImageResource(R.drawable.roller1);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.roller2);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.roller3);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.roller4);
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.roller5);
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.roller6);
                        break;
                }

                // Dice 2
                int ans2 = random.nextInt(6) + 1;
                tv2.setText(String.valueOf(ans2));
                switch (ans2)
                {
                    case 1:
                        imageView2.setImageResource(R.drawable.roller1);
                        break;
                    case 2:
                        imageView2.setImageResource(R.drawable.roller2);
                        break;
                    case 3:
                        imageView2.setImageResource(R.drawable.roller3);
                        break;
                    case 4:
                        imageView2.setImageResource(R.drawable.roller4);
                        break;
                    case 5:
                        imageView2.setImageResource(R.drawable.roller5);
                        break;
                    case 6:
                        imageView2.setImageResource(R.drawable.roller6);
                        break;
                }
            }

        });
    }


}