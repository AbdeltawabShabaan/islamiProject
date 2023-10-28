package com.example.islamicapp.islamiProject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.islamicapp.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed(object : Runnable {
            override fun run() {
                val intent = Intent(this@SplashActivity,HomeActivity::class.java)
                startActivity(intent)
                finish()
            }

        },2500)

    }
}