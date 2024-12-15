package com.example.questroomdatabase_106.ui.viewmodel

import com.example.questroomdatabase_106.data.entity.Mahasiswa

//menyimpan input form ke dalam entity
fun MahasiswaEvent.toMahasiswaEntity(): Mahasiswa = Mahasiswa(
    nim = nim,
    nama = nama,
    jenisKelamin = jenisKelamin,
    alamat = alamat,
    kelas = kelas,
    angkatan = angkatan
)

//data class variable yang menyimpan data input form
data class MahasiswaEvent(
    val nim: String = "",
    val nama: String ="",
    val jenisKelamin: String ="",
    val alamat: String ="",
    val kelas: String ="",
    val angkatan: String ="",
)