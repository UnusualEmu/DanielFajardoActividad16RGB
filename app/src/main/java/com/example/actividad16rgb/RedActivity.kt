package com.example.actividad16rgb

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class RedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_red)

        // Encuentra el TextView que muestra el código RGB
        val textView = findViewById<TextView>(R.id.colorText)
        textView.text = "RGB: (244, 67, 54)"  // Código RGB del color rojo

        // Establece el color de fondo a rojo
        findViewById<RelativeLayout>(R.id.activityLayout).setBackgroundColor(0xFFF44336.toInt())

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
