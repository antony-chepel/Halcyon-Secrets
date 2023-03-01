package com.tocaboca.tocalifeworldt.teijw.fdgf

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworldt.R
import com.tocaboca.tocalifeworldt.databinding.ActivityKwoowisadasxBinding
import com.tocaboca.tocalifeworldt.teijw.nbhjgfh.Howowksijhuxcgy
import kotlin.random.Random

class Kwoowisadasx : AppCompatActivity() {
    var checkhows = 0
    private var totalcount = 0
    var listadds = listOf(
        50,100,150,200,230,250,310,360,400,430,450,500
    )
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
    private lateinit var shared : SharedPreferences
    private lateinit var jxcnvhufh : ActivityKwoowisadasxBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        jxcnvhufh = ActivityKwoowisadasxBinding.inflate(layoutInflater)
        setContentView(jxcnvhufh.root)
        shared = getSharedPreferences("halc_totals", MODE_PRIVATE)
        saijdwuhu()
    }


    private fun saijdwuhu() = with(jxcnvhufh){
        im1Fst.setImageResource(lisimf[Random.nextInt(8)])
        im2Fst.setImageResource(lisimf[Random.nextInt(8)])
        im3Fst.setImageResource(lisimf[Random.nextInt(8)])
        im4Fst.setImageResource(lisimf[Random.nextInt(8)])
        im1Fst.setOnClickListener {
            im1Fst.isClickable = false
            checkhows +=1
            im1Fst.visibility = View.GONE
            val calcs = listadds[Random.nextInt(12)]
            totalcount +=calcs
            Snackbar.make(jxcnvhufh.root,"Your current scores : $totalcount",Snackbar.LENGTH_SHORT).show()
            if(checkhows == 4){
                shared.edit().putInt("halc_totals",totalcount).apply()
                Handler().postDelayed({
                    startActivity(Intent(this@Kwoowisadasx,Howowksijhuxcgy::class.java))
                },1000)

            }

        }

        im2Fst.setOnClickListener {
            im2Fst.isClickable = false
            checkhows +=1
            im2Fst.visibility = View.GONE
            val calcs = listadds[Random.nextInt(12)]
            totalcount +=calcs
            Snackbar.make(jxcnvhufh.root,"Your current scores : $totalcount",Snackbar.LENGTH_SHORT).show()
            if(checkhows == 4){
                shared.edit().putInt("halc_totals",totalcount).apply()
                Handler().postDelayed({
                    startActivity(Intent(this@Kwoowisadasx,Howowksijhuxcgy::class.java))
                },1000)
            }

        }

        im3Fst.setOnClickListener {
            im3Fst.isClickable = false
            checkhows +=1
            im3Fst.visibility = View.GONE
            val calcs = listadds[Random.nextInt(12)]
            totalcount +=calcs
            Snackbar.make(jxcnvhufh.root,"Your current scores : $totalcount",Snackbar.LENGTH_SHORT).show()
            if(checkhows == 4){
                shared.edit().putInt("halc_totals",totalcount).apply()
                Handler().postDelayed({
                    startActivity(Intent(this@Kwoowisadasx,Howowksijhuxcgy::class.java))
                },1000)
            }

        }

        im4Fst.setOnClickListener {
            im4Fst.isClickable = false
            checkhows +=1
            im4Fst.visibility = View.GONE
            val calcs = listadds[Random.nextInt(12)]
            totalcount +=calcs
            Snackbar.make(jxcnvhufh.root,"Your current scores : $totalcount",Snackbar.LENGTH_SHORT).show()

            if(checkhows == 4){
                shared.edit().putInt("halc_totals",totalcount).apply()
                Handler().postDelayed({
                    startActivity(Intent(this@Kwoowisadasx,Howowksijhuxcgy::class.java))
                },1000)
            }

        }
    }
}