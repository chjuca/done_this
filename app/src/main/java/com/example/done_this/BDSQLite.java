package com.example.done_this;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BDSQLite extends SQLiteOpenHelper {

    private String sql = "create table eventos(" +
            "idEvento int identity," +
            "nombreEvento varchar(40)," +
            "Ubicacion varchar(60)" +
            "fechadesde date,"+
            "horadesde time," +
            "fechahasta date,"+
            "horahasta time," +
            "descripcion varchar(60))";

    public BDSQLite(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
