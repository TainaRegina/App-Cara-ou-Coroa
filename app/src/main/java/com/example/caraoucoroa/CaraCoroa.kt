package com.example.caraoucoroa

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_cara_coroa.*

class CaraCoroa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cara_coroa)

        val dados: Bundle = intent.extras!!
        val numero = dados.getInt("numero")

        if (numero == 0 ){
            imageJogo.setImageResource(R.drawable.cara)
        }else{
            imageJogo.setImageResource(R.drawable.coroa)
        }

        btnVoltar.setOnClickListener{
            finish()
        }

    }
}