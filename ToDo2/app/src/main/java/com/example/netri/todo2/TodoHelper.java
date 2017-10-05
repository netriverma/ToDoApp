package com.example.netri.todo2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Netri on 24-03-2017.
 */

public class TodoHelper extends SQLiteOpenHelper {

    final static  String TODO_TABLE_NAME="ToDo";
    final static  String TODO_COLUMN_TITLE="Title";
    final static  String TODO_COLUMN_DESCRIPTION="Desc";
    final static  String TODO_COLUMN_DATE="Date";
    final static  String TODO_COLUMN_TIME="Time";
    final static  String TODO_COLUMN_LIST="List";
    final static  String TODO_COLUMN_ID="_id";

    public TodoHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "+TODO_TABLE_NAME + "("
                + TODO_COLUMN_ID +"INTEGER PRIMARY KEY AUTO INCREMENT,"
                + TODO_COLUMN_TITLE +"TEXT,"
                + TODO_COLUMN_DESCRIPTION +"TEXT,"
                + TODO_COLUMN_DATE + "DATE,"
                + TODO_COLUMN_TIME + "REAL,"
                + TODO_COLUMN_LIST + "TEXT);";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
