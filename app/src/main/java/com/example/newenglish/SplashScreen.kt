package com.example.newenglish

import android.content.Intent
import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        scheduleSplashScreen()
    }
    private fun scheduleSplashScreen() {
        val imageView: ImageView = findViewById(R.id.imageView)
        imageView.setBackgroundResource(R.drawable.avd_anim)
        val animation = imageView.background as AnimatedVectorDrawable
        animation.start()
        val splashScreenDuration: Long = 2001
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashScreen,
                MainActivity::class.java)
            startActivity(intent)
            finish()
        }, splashScreenDuration)
    }
}