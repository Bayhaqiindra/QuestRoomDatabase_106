package com.example.questroomdatabase_106.repository

import com.example.questroomdatabase_106.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface RepositoryMhs {
    //Suspend Untuk operasi berat create,update,delete
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    fun getAllMhs() : Flow<List<Mahasiswa>>

    fun getMhs(nim : String) : Flow<Mahasiswa>

    suspend fun deleteMhs(Mahasiswa: Mahasiswa)

    suspend fun updateMhs(Mahasiswa: Mahasiswa)

}