package com.example.actividad16rgb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonGreen = findViewById<Button>(R.id.buttonGreen)
        val buttonRed = findViewById<Button>(R.id.buttonRed)
        val buttonBlue = findViewById<Button>(R.id.buttonBlue)

        buttonGreen.setOnClickListener {
            val intent = Intent(this, GreenActivity::class.java)
            startActivity(intent)
        }

        buttonRed.setOnClickListener {
            val intent = Intent(this, RedActivity::class.java)
            startActivity(intent)
        }

        buttonBlue.setOnClickListener {
            val intent = Intent(this, BlueActivity::class.java)
            startActivity(intent)
        }

    }
}