package com.example.diceapplication;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DiceThreeHistory extends AppCompatActivity {

    public SQLiteDatabase db;
    ListView lv3;
    ArrayAdapter<String> mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_three_history);

        lv3 = findViewById(R.id.listView3);

        // create database & table
        try{
            db = openOrCreateDatabase("DiceRollerr",SQLiteDatabase.CREATE_IF_NECESSARY,null);
        }catch(SQLException e){

        }


        mp = new ArrayAdapter<>(DiceThreeHistory.this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item);
        Cursor c = db.rawQuery("SELECT * FROM dice3",null);
        c.moveToFirst();
        while(!c.isAfterLast()){
            mp.add("\t\t\t\t"+c.getString(0)  + "\t\t\t\t\t\t\t" + c.getString(1)  + "\t\t\t\t\t\t\t" + c.getString(2));
            c.moveToNext();
        }
        c.close();
        lv3.setAdapter(mp);



    }
}