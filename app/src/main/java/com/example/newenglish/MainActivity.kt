package com.example.newenglish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTheme(androidx.appcompat.R.style.Theme_AppCompat_NoActionBar)
        val textView: TextView = findViewById(R.id.textView)
        val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.anim)
        textView.startAnimation(animationFadeIn)
    }
    fun btnClick(view: View){
        val intent: Intent = Intent(this@MainActivity, Home::class.java)
        startActivity(intent)
    }
}