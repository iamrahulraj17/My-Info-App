package com.example.textandscrollview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnIntent = findViewById<Button>(R.id.button)

        btnIntent.setOnClickListener {
            val intent = Intent(applicationContext, secondActivity::class.java)
            startActivity(intent)
        }
    }
}
