package com.example.knkunique

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class TextSplashActivity : AppCompatActivity() {
    private val textSplashActivityimeout : Long = 2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_splash)

        Handler().postDelayed({
            startActivity(Intent(this , MainActivity ::class.java))
            finish()
        }, textSplashActivityimeout)
    }
}