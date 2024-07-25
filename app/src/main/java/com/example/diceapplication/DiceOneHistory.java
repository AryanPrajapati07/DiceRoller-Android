package com.example.diceapplication;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DiceOneHistory extends AppCompatActivity {

    //    private static final String FILE_NAME = "Dice1.txt";
    public SQLiteDatabase db;
    ListView lv;
    ArrayAdapter<String> mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_one_history);

        lv = findViewById(R.id.listView1);

        // create database & table
        try{
            db = openOrCreateDatabase("DiceRollerr",SQLiteDatabase.CREATE_IF_NECESSARY,null);
        }catch(SQLException e){

        }


        mp = new ArrayAdapter<>(DiceOneHistory.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        Cursor c = db.rawQuery("SELECT One_Dice FROM dice1",null);
        c.moveToFirst();
        while(!c.isAfterLast()){
            mp.add("\t\t\t\t"+c.getString(0));
            c.moveToNext();
        }
        c.close();
        lv.setAdapter(mp);
    }
}