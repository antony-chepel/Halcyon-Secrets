package com.tocaboca.tocalifeworldt.teijw.fdgf

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworldt.R
import com.tocaboca.tocalifeworldt.databinding.ActivityJusissxcsuhBinding
import kotlin.random.Random

class Jusissxcsuh : AppCompatActivity() {
    private lateinit var sharedTotal : SharedPreferences
    private lateinit var sharedBonus : SharedPreferences
    private val lsidwyg = listOf(
        R.drawable.halc_it_1,
        R.drawable.halc_it_2,
        R.drawable.halc_it_3,
        R.drawable.halc_it_4,
        R.drawable.halc_it_5,
        R.drawable.halc_it_6,
        R.drawable.halc_it_7,
        R.drawable.halc_it_8,
    )
    private lateinit var asdiwjij : ActivityJusissxcsuhBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        asdiwjij = ActivityJusissxcsuhBinding.inflate(layoutInflater)
        setContentView(asdiwjij.root)
        sharedTotal = getSharedPreferences("halc_totals", MODE_PRIVATE)
        sharedBonus = getSharedPreferences("halc_bonus", MODE_PRIVATE)
        okasijijds()
    }


    private fun okasijijds() = with(asdiwjij){
        val scres = sharedTotal.getInt("halc_totals",100)
        val bonuses = sharedBonus.getInt("halc_bonus",2)
        val calcToat = scres * bonuses
        tvRes.text = "You got $calcToat secrets points"
        imGft.setImageResource(lsidwyg[Random.nextInt(8)])
        bAg.setOnClickListener {
            startActivity(Intent(this@Jusissxcsuh,Kwoowisadasx::class.java))
        }
    }
}