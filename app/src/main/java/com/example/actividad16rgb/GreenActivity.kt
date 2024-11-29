package com.example.actividad16rgb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class GreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        // Encuentra el TextView que muestra el código RGB
        val textView = findViewById<TextView>(R.id.colorText)
        textView.text = "RGB: (76, 175, 80)"  // Código RGB del color verde

        // Establece el color de fondo a verde
        findViewById<RelativeLayout>(R.id.activityLayout).setBackgroundColor(0xFF4CAF50.toInt())

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
