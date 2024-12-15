package com.example.questroomdatabase_106.ui.viewmodel

import com.example.questroomdatabase_106.data.entity.Mahasiswa

data class MhsUIState(
    val mahasiswaEvent: MahasiswaEvent = MahasiswaEvent(),
    val isEntryValid: FormErrorState = FormErrorState(),
    val snackBarMessage: String? = null,
)

data class FormErrorState(
    val nim: String? = null,
    val nama: String? = null,
    val jenisKelamin: String? = null,
    val alamat: String? = null,
    val kelas: String? = null,
    val angkatan: String? = null,
){
    fun isValid(): Boolean {
        return nim == null && nama == null && jenisKelamin == null &&
                alamat == null && kelas == null && angkatan == null
    }
}

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