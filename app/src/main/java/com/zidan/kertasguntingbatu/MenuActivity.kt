package com.zidan.kertasguntingbatu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView

class MenuActivity : AppCompatActivity() {
    private lateinit var pindah_button : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        setUpView()
        setMainMatch()
    }

    fun setUpView(){
        pindah_button = findViewById(R.id.pindah_btn)
    }

    fun setMainMatch(){
        pindah_button.setOnClickListener(){
            val intent = Intent(this, PlayActivity::class.java)
            startActivity(intent)
        }
    }
}