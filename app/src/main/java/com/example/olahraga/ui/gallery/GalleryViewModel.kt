package com.example.olahraga.ui.gallery

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.olahraga.R
import com.example.olahraga.model.DataGallery

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _judul = MutableLiveData<String>()
    val judul: LiveData<String> = _judul

    private val _genre = MutableLiveData<String>()
    val genre: LiveData<String> = _genre

    fun loadData(): List<DataGallery>{
        return listOf(
            DataGallery(R.drawable.basket,R.string.basket,R.string.bolabesar),
            DataGallery(R.drawable.bola,R.string.bola, R.string.bolabesar),
            DataGallery(R.drawable.voli,R.string.voli, R.string.bolabesar),
        )
    }

    fun setData(data: DataGallery, context: Context) {
        _judul.value = context.getString(data.judulResourceId)
        _image.value = data.imageResourceId
        _genre.value = context.getString(data.genreResourceId)
    }
}