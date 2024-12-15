package com.example.questroomdatabase_106

import android.app.Application
import com.example.questroomdatabase_106.dependeciesinjection.ContainerApp

class KrsApp : Application() {
    //fungsinya untuk menyimpan instance ContainerApp
    lateinit var containerApp: ContainerApp

    override fun onCreate() {
        super.onCreate()
        // Membuat instance ContainerApp
        containerApp = ContainerApp(this)
        //Instance adalah object yang dibuat dari class
    }
}