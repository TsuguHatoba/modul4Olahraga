package com.example.olahraga.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Selamat datang di aplikasi olahraga\n" +
                "Jika ingin ke menu gallery, klik tombol di bawah"
    }
    val text: LiveData<String> = _text
}