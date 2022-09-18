package com.abhinav.photocarousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    lateinit var photoCarousel : ViewPager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        photoCarousel = findViewById<ViewPager>(R.id.id_1)
        val photoAdapter = ImageAdapter(this)
        photoCarousel.adapter = photoAdapter
    }
}