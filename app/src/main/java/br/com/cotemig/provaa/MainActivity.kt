package br.com.cotemig.provaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

/*
Nome Aluno: Lucas Rodrigues Santos
Matricula: 72001275
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt_comb = findViewById<Button>(R.id.bt_melhorcomb)
        val bt_calc = findViewById<Button>(R.id.bt_calcimc)
        bt_comb.setOnClickListener{
            IrParaTelaComb()
        }
        bt_calc.setOnClickListener{
            IrParaTelaCalc()
        }
    }
    private fun IrParaTelaComb(){
        val melhorcomb = Intent(this,MelhorCombustivel::class.java)
        startActivity(melhorcomb)
    }
    private fun IrParaTelaCalc(){
        val calcimc = Intent(this,CalcularIMC::class.java)
        startActivity(calcimc)
    }

}