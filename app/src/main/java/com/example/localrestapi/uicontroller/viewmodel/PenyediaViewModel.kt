package com.example.localrestapi.uicontroller.viewmodel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.localrestapi.repositori.AplikasiSiswa

fun CreationExtras.aplikasiSiswa(): AplikasiSiswa = (
    this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa
)

object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(aplikasiSiswa().container.repositoryDataSiswa)
        }
        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoryDataSiswa)
        }
    }
}