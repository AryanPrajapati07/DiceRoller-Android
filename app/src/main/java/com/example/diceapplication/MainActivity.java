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

public class MainActivity extends AppCompatActivity {

    public SQLiteDatabase db;
    ArrayAdapter<String> mp;
    private TextView textView;
    private ImageView imageView;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.score);
        imageView = findViewById(R.id.image);
        b1 = (Button) findViewById(R.id.roll);

        // create database & table
        try{
            db = openOrCreateDatabase("DiceRollerr",SQLiteDatabase.CREATE_IF_NECESSARY,null);
            db.execSQL("Create Table dice1(One_Dice Integer)");
        }catch(SQLException e){

        }

            // Sound Code
            final MediaPlayer mp = MediaPlayer.create(this, R.raw.dice);


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mp.start();     // Sound code Executed

                    ContentValues cv = new ContentValues();
                    cv.put("One_Dice",textView.getText().toString());

                    db.insert("dice1",null,cv);

                    Random random = new Random();
                    int ans = random.nextInt(6)+1;
                    final Handler handler;
                    handler = new Handler(Looper.getMainLooper());
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            textView.setText(String.valueOf(ans));
                            switch (ans) {
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
                        }
                    }, 500);
                }
            });
        }

        //Animation Code Here
        public void startAnimation() {
            ObjectAnimator animator = ObjectAnimator.ofFloat(imageView, "rotation", 0f, 360f);
            animator.setDuration(500);
            AnimatorSet animset = new AnimatorSet();
            animset.playTogether(animator);
            animset.start();
        }
}
