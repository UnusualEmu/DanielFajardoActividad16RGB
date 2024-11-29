package com.example.actividad16rgb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class BlueActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blue)

        // Encuentra el TextView que muestra el código RGB
        val textView = findViewById<TextView>(R.id.colorText)
        textView.text = "RGB: (33, 150, 243)"  // Código RGB del color azul

        // Establece el color de fondo a azul
        findViewById<RelativeLayout>(R.id.activityLayout).setBackgroundColor(0xFF2196F3.toInt())

        // Configura el botón de regreso
        val buttonBack = findViewById<Button>(R.id.buttonBack)
        buttonBack.setOnClickListener {
            // Regresa a la actividad principal (MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()  // Finaliza la actividad actual
        }
    }
}
