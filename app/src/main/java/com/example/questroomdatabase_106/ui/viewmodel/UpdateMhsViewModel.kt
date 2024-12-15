package com.example.questroomdatabase_106.ui.viewmodel

import com.example.questroomdatabase_106.data.entity.Mahasiswa

fun Mahasiswa. toUIStateMhs () : MhsUIState = MhsUIState (
    mahasiswaEvent = this. toDetailUiEvent (),
)