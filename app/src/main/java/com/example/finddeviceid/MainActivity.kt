package com.example.finddeviceid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("HardwareIds")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "KotlinApp"
        val textView: TextView = findViewById(R.id.textView)
        val id: String = Settings.Secure.getString(contentResolver, Settings.Secure.ANDROID_ID)
        textView.text = "Device ID: $id"
    }
}