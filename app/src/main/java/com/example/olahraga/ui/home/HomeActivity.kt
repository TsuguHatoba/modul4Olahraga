package com.example.olahraga.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.olahraga.R
import com.example.olahraga.databinding.ActivityGalleryBinding
import com.example.olahraga.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"
        const val EXTRA_DATE = "date"
        const val EXTRA_DESCRIPTION = "description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityHomeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageHomeDetail
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.nameHomeDetail
        name.text = intent.getStringExtra(EXTRA_NAME)

        val date = binding.dateHomeDetail
        date.text = intent.getStringExtra(EXTRA_DATE)

        val description = binding.descHomeDetail
        description.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}