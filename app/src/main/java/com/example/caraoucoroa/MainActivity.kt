package com.example.caraoucoroa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJogar.setOnClickListener {

            val intent = Intent(applicationContext, CaraCoroa::class.java)

            //gerar numero aleatorio
            val numero = Random.nextInt(2)

            //enviar numero randomico
            intent.putExtra("numero", numero)

            startActivity(intent)
        }
    }
}