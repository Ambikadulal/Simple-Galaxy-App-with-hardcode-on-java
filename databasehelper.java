package com.technofeild.galaxystore;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import java.util.ArrayList;

public class databasehelper extends SQLiteOpenHelper {
    String menu;
    static String name = "test";
    static int version = 1;
    String createTableuser = "CREATE TABLE if not exists \"user\" (\n" +
            "\t\"menu\"\tBLOB  ,\n" +
            "\t\"search\"\tBLOB  ,\n" +
            "\t\"liveme\"\tBLOB  ,\n" +
            "\t\"download\"\tBLOB  ,\n" +
            "\t\"adobeicon\"\tBLOB  ,\n" +
            "\t\"download1\"\tBLOB  ,\n" +
            "\t\"download2\"\tBLOB  ,\n" +
            "\t\"vsco\"\tBLOB  ,\n" +
            "\t\"chat\"\t Text  ,\n" +
            "\t\"inpurchase\"\t Text  ,\n" +
            "\t\"livevdo\"\t Text  ,\n" +

            "\t\"download3\"\tText  \n" + ")";
    private userinfo username;


    public databasehelper(@Nullable Context context) {
        super(context, name, null, version);
        getWritableDatabase().execSQL(createTableuser);
    }


    public void insertuser(ContentValues ContentValues) {
        getWritableDatabase().insert("user", "", ContentValues);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    public ArrayList<userinfo> getApplist() {
        String sql = "select * from user ";
        Cursor Cursor = getReadableDatabase().rawQuery(sql, null);

        ArrayList<userinfo> list = new ArrayList<>();
        while (Cursor.moveToNext()) {
            userinfo info = new userinfo();
            info.chat = Cursor.getString(Cursor.getColumnIndex("chat"));
            info.livevdo = Cursor.getString(Cursor.getColumnIndex("livevdo"));
            info.inpurchase = Cursor.getString(Cursor.getColumnIndex("inpurchase"));
            info.image = Cursor.getBlob(Cursor.getColumnIndex("liveme"));

            list.add(info);

        }
        Cursor.close();
        return list;

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

