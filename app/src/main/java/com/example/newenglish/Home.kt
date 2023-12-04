package com.example.newenglish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.anim)
        val button1: Button = findViewById(R.id.button2)
        val button2: Button = findViewById(R.id.button3)
        val button3: Button = findViewById(R.id.button5)

        button1.startAnimation(animationFadeIn)
        button2.startAnimation(animationFadeIn)
        button3.startAnimation(animationFadeIn)
    }
    fun btnUroki(view: View){
        val intent: Intent = Intent(this@Home, LessonsUroki::class.java)
        startActivity(intent)
    }
    fun btnAlphavit(view: View){
        val intent: Intent = Intent(this@Home, Alphabet::class.java)
        startActivity(intent)
    }
    fun btnPesnya(view: View){
        val intent: Intent = Intent(this@Home, Pesnya::class.java)
        startActivity(intent)
    }
}