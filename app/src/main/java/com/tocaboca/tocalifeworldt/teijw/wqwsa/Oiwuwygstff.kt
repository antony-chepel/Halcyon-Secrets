package com.tocaboca.tocalifeworldt.teijw.wqwsa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.tocaboca.tocalifeworldt.R
import com.tocaboca.tocalifeworldt.databinding.ActivityOiwuwygstffBinding
import com.tocaboca.tocalifeworldt.teijw.fdgf.Jusissxcsuh

class Oiwuwygstff : AppCompatActivity() {
    private var secPlAnim : Animation? = null
    private lateinit var xzuhsudh : ActivityOiwuwygstffBinding
    private var countd : CountDownTimer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        xzuhsudh = ActivityOiwuwygstffBinding.inflate(layoutInflater)
        setContentView(xzuhsudh.root)
        secPlAnim = AnimationUtils.loadAnimation(applicationContext, R.anim.halc_rotat)
        tasdygw()
        asygdgyw()

    }


    private fun tasdygw(){
        countd  = object :CountDownTimer(10000,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                startActivity(Intent(this@Oiwuwygstff,Jusissxcsuh::class.java))
            }

        }.start()
    }


    private fun asygdgyw() = with(xzuhsudh){
        im1.startAnimation(secPlAnim)
        im2.startAnimation(secPlAnim)
        im3.startAnimation(secPlAnim)
        im4.startAnimation(secPlAnim)
        im5.startAnimation(secPlAnim)
        im6.startAnimation(secPlAnim)
        im7.startAnimation(secPlAnim)
        im8.startAnimation(secPlAnim)
        im9.startAnimation(secPlAnim)
    }






    override fun onDestroy() {
        super.onDestroy()
        countd?.cancel()
    }
}