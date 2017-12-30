package com.example.galib.assessment;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Galib on 12/30/2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="registeration";
    public static final String COL1="ID";
    public static final String COL2="Name";
    public static final String COL3="DOB";
    public static final String COL4="Address";
    public static final String COL5="Gender";
    public static final String COL6="Email";
    public static final String COL7="Password";
    public static final String COL8="Contact";
    public static final String COL9="Emergencycontact";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT,DOB TEXT,Address TEXT,Gender TEXT,Email TEXT,Password TEXT,Contact TEXT,Emergencycontact TEXT)");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" +TABLE_NAME); //Drop older table if exists
        onCreate(db);
    }
}
