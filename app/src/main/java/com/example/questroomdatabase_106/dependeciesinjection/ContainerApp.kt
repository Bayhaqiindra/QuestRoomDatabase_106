package com.example.questroomdatabase_106.dependeciesinjection

import android.content.Context
import com.example.questroomdatabase_106.data.database.KrsDatabase
import com.example.questroomdatabase_106.repository.LocalRepositoryMhs
import com.example.questroomdatabase_106.repository.RepositoryMhs

interface InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDataBase(context).mahasiswaDao())
    }
}