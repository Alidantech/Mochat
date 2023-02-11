package com.app.mochat;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {


    public static final String table_name = "MOCHAT_USERS";
    public static final String user_id = "user_id";
    public static final String user_name = "user_name";
    public static final String phone_number = "phone_number";
    public static final String password = "password";

    public DatabaseHelper(@Nullable Context context) {
        super(context, "users.db", null, 1);
    }

    //this method is called the first time yo create a new database.
    @Override
    public void onCreate(SQLiteDatabase db) {
        String create_table_statement = "CREATE TABLE " + table_name + "(" + user_id + " INT PRIMARY KEY," +
                                                                            " " + user_name + " VARCHAR," +
                                                                            " " + phone_number + " INT," +
                                                                            " " + password + " VARCHAR);";
        db.execSQL(create_table_statement);
    }

    //this method is called if database version number changes
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    }

    public boolean addone(SingUpFragment singUpFragment){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

            cv.put(user_id, singUpFragment.getUser_id());
            cv.put(user_name, singUpFragment.getUser_name());
            cv.put(phone_number, singUpFragment.getPhone_number());
            cv.put(password, singUpFragment.getUser_password());

            db.insert(table_name, null, cv);

            return true;
    }
}
