package com.yarenbergi.sayitahminoyunu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rnd = (1..100).random()
        var score = 100

        buttonTahmin.setOnClickListener {
            val tahminSayi = tahmin_etme.text.toString()
            val tahmintoint : Int = Integer.parseInt(tahminSayi)

            if(tahmintoint < rnd) {
                tahmin.setText("Daha Büyük Bir Sayı Dene")
                score -= 1
                textScore.setText("Skorunuz: $score")
            } else if (tahmintoint > rnd) {
                tahmin.setText("Daha Küçük Bir Sayı Dene")
                score -= 1
                textScore.setText("Skorunuz: $score")
            } else if (tahmintoint == rnd) {
                tahmin.setText("Tebrikler Bildiniz! Skorunuz: $score")
                textScore.setText("")
                tahmin_etme.visibility = View.GONE
            }
        }
    }
}