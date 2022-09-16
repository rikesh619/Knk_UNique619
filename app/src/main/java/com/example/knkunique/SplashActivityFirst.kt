package com.example.knkunique

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivityFirst : AppCompatActivity() {
    private  val splashActivityFirstimeout : Long = 2500
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_first)

        Handler().postDelayed({

            startActivity(Intent(this , TextSplashActivity::class.java))
        }, splashActivityFirstimeout)
    }
}