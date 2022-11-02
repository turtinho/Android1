package com.example.android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun abrirTela(view: View){
        var intent = Intent(this,teste::class.java)
        startActivity(intent)
    }
    fun abrirTela2(view: View){
        var intent = Intent(this,bottomNavigatorActivity::class.java)
        startActivity(intent)
    }
    fun abrirTela3(view: View){
        var intent = Intent(this,SettingsActivity::class.java)
        startActivity(intent)
    }
}
