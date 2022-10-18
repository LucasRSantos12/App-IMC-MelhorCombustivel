package br.com.cotemig.provaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MelhorCombustivel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.melhorcombustivel)

        val bt_voltar = findViewById<ImageButton>(R.id.imageButton2)


        bt_voltar.setOnClickListener{
            finish()
        }


    }
}