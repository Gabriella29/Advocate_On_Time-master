package com.example.mildr.advocate_on_time;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by mildr on 12-2-2017.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Users.db";
    public static final String TABLE_NAME = "User";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_USERNAME = "username";
    public static final String COLUMN_PASSWORD = "password";
    public static final String COLUMN_CONFIRMPASSWORD = "confirmpassword";
    public static final String COLUMN_FIRSTNAME = "firstname";
    public static final String COLUMN_LASTNAME = "lastname";
    public static final String COLUMN_EMAIL = "email";
    public static final String COLUMN_GENDER = "gender";
    public static final String COLUMN_KANTOOR = "kantoor";
    public static final String COLUMN_ADRES = "adres";
    public static final String COLUMN_PHONE = "phone";
    SQLiteDatabase db;
    private static final String TABLE_CREATE = "create table" + TABLE_NAME + " " +
            "(ID INTEGER PRIMARY KEY NOT NULL AUTOINCREMENT), USERNAME TEXT, PASSWORD TEXT, CONFIRMPASSWORD TEXT ," +
            " FIRSTNAME UNIQUE TEXT , LASTNAME TEXT , EMAIL TEXT , GENDER TEXT , KANTOOR TEXT , ADRES TEXT , PHONE TEXT";



    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;

    }

    public void insertUser(Users user ){
        db = this.getWritableDatabase();
        ContentValues contentValeus = new ContentValues();
        contentValeus.put(COLUMN_USERNAME,user.getUserName());
        contentValeus.put(COLUMN_PASSWORD,user.getPassword());
        contentValeus.put(COLUMN_CONFIRMPASSWORD, user.getConfirmPassword());
        contentValeus.put(COLUMN_FIRSTNAME,user.getFirstName());
        contentValeus.put(COLUMN_LASTNAME,user.getLastName());
        contentValeus.put(COLUMN_EMAIL,user.getEmail());
        contentValeus.put(COLUMN_GENDER,user.getGender());
        contentValeus.put(COLUMN_KANTOOR,user.getKantoor());
        contentValeus.put(COLUMN_ADRES,user.getAdres());
        contentValeus.put(COLUMN_PHONE,user.getPhone());

        db.insertOrThrow(TABLE_NAME, null, contentValeus);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL("DROP TABLE IF EXISTS " + "TEMPLATE");
       db.execSQL(query);
        this.onCreate(db);

    }

    public DatabaseHelper open() throws SQLException
    {
        db = getWritableDatabase();
        return this;
    }
    public void close()
    {
        db.close();
    }
    public  SQLiteDatabase getDatabaseInstance()
    {
        return db;
    }


public String getUser(String username) {
    SQLiteDatabase db = this.getReadableDatabase();
    String user;
    String query = "select * from USERS where username = ?";
    Cursor cursor = db.rawQuery(query,new String[]{username});
    if (cursor.getCount()>0);
    {
        cursor.moveToFirst();
        user = cursor.getString(cursor.getColumnIndex("username"));

    }
    return user;

    }
}



