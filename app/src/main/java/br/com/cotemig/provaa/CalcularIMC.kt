package br.com.cotemig.provaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class CalcularIMC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculoimc)


        val bt_voltar1 = findViewById<ImageButton>(R.id.imageButton3)
        val bt_calc = findViewById<Button>(R.id.button4)

        bt_voltar1.setOnClickListener{
            finish()
        }

    }
}