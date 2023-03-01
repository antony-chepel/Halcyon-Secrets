package com.tocaboca.tocalifeworldt.teijw.nbhjgfh
import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.gokd
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.fkodkosokkoko
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.jcjnxjnvd
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.uhxzhucjijjijijixcjiz
import com.tocaboca.tocalifeworldt.teijw.sppxockixcjv
import com.tocaboca.tocalifeworldt.teijw.ucijxoksd
import org.koin.core.logger.Level
import java.util.*

class Losoixutygds: Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(fkodkosokkoko)

        val sijdjiw = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val xijzcji = getSharedPreferences("PREFS_NAME", 0)

        val sdijwjijisaudhuasd = MyTracker.getTrackerParams()
        val xnnzcjn = MyTracker.getTrackerConfig()
        val sokwdkokooskijxzchuhzuxc = MyTracker.getInstanceId(this)
        xnnzcjn.isTrackingLaunchEnabled = true
        val fdele = UUID.randomUUID().toString()

        if (xijzcji.getBoolean("my_first_time", true)) {
            sdijwjijisaudhuasd.setCustomUserId(fdele)
            sijdjiw.edit().putString(gokd, fdele).apply()
            sijdjiw.edit().putString(uhxzhucjijjijijixcjiz, sokwdkokooskijxzchuhzuxc).apply()
            xijzcji.edit().putBoolean("my_first_time", false).apply()
        } else {
            val okfkosdk = sijdjiw.getString(gokd, fdele)
            sdijwjijisaudhuasd.setCustomUserId(okfkosdk)
        }
        MyTracker.initTracker(jcjnxjnvd, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@Losoixutygds)
            modules(
                listOf(
                    sppxockixcjv, ucijxoksd
                )
            )
        }
    }
}