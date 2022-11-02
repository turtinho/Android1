package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.bumptech.glide.Glide

class teste : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste)

        val button = findViewById<Button>(R.id.carregarImagem)
        button.setOnClickListener {
            var url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Emirates_logo.svg/566px-Emirates_logo.svg.png"
            var imageView = findViewById<ImageView>(R.id.imageView)
            Glide.with(this).load(url).into(imageView)
        }


    }

}