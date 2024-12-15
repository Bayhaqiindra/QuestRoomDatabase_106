package com.example.questroomdatabase_106.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.questroomdatabase_106.data.dao.MahasiswaDao
import com.example.questroomdatabase_106.data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract class KrsDatabase : RoomDatabase(){

    abstract fun mahasiswaDao(): MahasiswaDao

    companion object {
        @Volatile
        private var Instance:KrsDatabase? = null

        //Membuat Database
        fun getDataBase(context: Context): KrsDatabase {
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java,
                    "KrsDatabase"
                )
                    .build().also { Instance = it}
            })
        }
    }
}