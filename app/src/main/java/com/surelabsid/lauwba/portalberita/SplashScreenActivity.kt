package com.surelabsid.lauwba.portalberita

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.surelabsid.lauwba.portalberita.databinding.ActivitySplashScreenBinding
import java.util.*
import kotlin.concurrent.schedule

class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Timer().schedule(3000L) {
            finish()
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
        }
    }
}