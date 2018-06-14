package com.example.kangjh_mac.roompractice.db;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.kangjh_mac.roompractice.dao.BorrowModelDao;
import com.example.kangjh_mac.roompractice.model.BorrowModel;

@Database(entities = {BorrowModel.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public static AppDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "borrow_db")
                    .build();
        }
        return INSTANCE;
    }

    public abstract BorrowModelDao itemAndPersonModel();
}
