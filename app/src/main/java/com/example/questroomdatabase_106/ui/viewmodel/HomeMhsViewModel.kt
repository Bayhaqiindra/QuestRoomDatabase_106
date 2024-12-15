package com.example.questroomdatabase_106.ui.viewmodel

import com.example.questroomdatabase_106.data.entity.Mahasiswa

data class HomeUiState (
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String =""
)