package com.example.questroomdatabase_106.ui.viewmodel

import com.example.questroomdatabase_106.data.entity.Mahasiswa

//memindahkan data dari entity ke ui
fun Mahasiswa.toDetailUiEvent () : MahasiswaEvent {
    return MahasiswaEvent(
        nim = nim,
        nama = nama,
        jenisKelamin = jenisKelamin,
        alamat = alamat,
        kelas = kelas,
        angkatan = angkatan
    )
}