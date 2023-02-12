package com.app.mochat;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

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

    public boolean addUser(SingUpFragment singUpFragment){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

            cv.put(user_id, singUpFragment.getUser_id());
            cv.put(user_name, singUpFragment.getUser_name());
            cv.put(phone_number, singUpFragment.getPhone_number());
            cv.put(password, singUpFragment.getUser_password());

            db.insert(table_name, null, cv);
            return true;
    }

    public List<SingUpFragment> getUsersList(){
        List<SingUpFragment> usersList = new ArrayList<>();
        String queryString = "SELECT * FROM " + table_name;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
                if(cursor.moveToFirst()){
                    //loop through the result and create a new
                    do {
                        double user_id = cursor.getDouble(0);
                        String user_name = cursor.getString(1);
                        String phone_number = cursor.getString(2);
                        String password = cursor.getString(3);

                        SingUpFragment newUser = new SingUpFragment(user_id, user_name, phone_number, password);
                        usersList.add(newUser);

                    }while(cursor.moveToFirst());
                }else{
                    //if it fails leave list as it is.
                }
                cursor.close();
                db.close();
        return usersList;
    }
}
