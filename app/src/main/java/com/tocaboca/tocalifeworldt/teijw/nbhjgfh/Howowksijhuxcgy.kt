package com.tocaboca.tocalifeworldt.teijw.nbhjgfh

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.tocaboca.tocalifeworldt.R
import com.tocaboca.tocalifeworldt.databinding.ActivityHowowksijhuxcgyBinding
import com.tocaboca.tocalifeworldt.teijw.wqwsa.Oiwuwygstff
import kotlin.random.Random

class Howowksijhuxcgy : AppCompatActivity() {
    private var countd : CountDownTimer? = null
    private lateinit var shareds : SharedPreferences
    private var lisimf = listOf(
        R.drawable.halc_it_1,
        R.drawable.halc_it_2,
        R.drawable.halc_it_3,
        R.drawable.halc_it_4,
        R.drawable.halc_it_5,
        R.drawable.halc_it_6,
        R.drawable.halc_it_7,
        R.drawable.halc_it_8,
    )

    private var bonuses = listOf(
        2,3,4,5,6,7,8,10
    )
    private lateinit var xcovkdf : ActivityHowowksijhuxcgyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xcovkdf = ActivityHowowksijhuxcgyBinding.inflate(layoutInflater)
        setContentView(xcovkdf.root)
        shareds = getSharedPreferences("halc_bonus", MODE_PRIVATE)
        xcovkdf.bLaunch.setOnClickListener {
            iasijdhuw()
        }

    }


    private fun iasijdhuw() = with(xcovkdf){
        countd?.cancel()
        var coiuhf =0
        countd = object :CountDownTimer(5000,300){
            override fun onTick(p0: Long) {
                bLaunch.alpha = 0.7f
                bLaunch.isClickable = false
                coiuhf ++
                if(coiuhf > 7) coiuhf = 0

                im1Sec.setImageResource(lisimf[coiuhf])
                im2Sec.setImageResource(lisimf[coiuhf])
                im3Sec.setImageResource(lisimf[coiuhf])
                im4Sec.setImageResource(lisimf[coiuhf])
                val bondf = bonuses[coiuhf]
                tvTrs.text = "Treasure bonus : x$bondf"


            }

            override fun onFinish() {
                bLaunch.alpha = 1.0f
                bLaunch.isClickable = true
                val bondfs = bonuses[Random.nextInt(8)]
             shareds.edit().putInt("halc_bonus",bondfs).apply()
                startActivity(Intent(this@Howowksijhuxcgy,Oiwuwygstff::class.java))
            }

        }.start()
    }


    override fun onDestroy() {
        super.onDestroy()
        countd?.cancel()
    }
}