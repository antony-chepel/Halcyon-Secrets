package com.tocaboca.tocalifeworldt.teijw.wqwsa
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject
import android.app.Application
import android.webkit.WebSettings
import android.webkit.WebView
import android.content.pm.PackageManager
import androidx.lifecycle.ViewModel





class Bxoidiuwuwsda(wopqooskox: Application): ViewModel() {
    val xijzcjijis = wopqooskox.packageManager


    fun fokokos(gctxyuu: String) {
        OneSignal.setExternalUserId(
            gctxyuu,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(usiows: JSONObject) {
                    try {
                        if (usiows.has("push") && usiows.getJSONObject("push").has("success")) {
                            val cgyxvuhd = usiows.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $cgyxvuhd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (usiows.has("email") && usiows.getJSONObject("email").has("success")) {
                            val oqoqppspsad =
                                usiows.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $oqoqppspsad"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (usiows.has("sms") && usiows.getJSONObject("sms").has("success")) {
                            val xhuchuzs = usiows.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $xhuchuzs"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    fun hchjxjxijjidshuf(wopq: String): Boolean {
        try {
            xijzcjijis.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }


    fun ncnkxkduhshugywygdtfas(yxuzi: WebView): WebSettings{
        val ppwowkos = yxuzi.settings
        ppwowkos.setSupportZoom(true)
        ppwowkos.setSupportMultipleWindows(false)
        ppwowkos.javaScriptEnabled = true
        ppwowkos.allowContentAccess = true
        ppwowkos.useWideViewPort = true
        ppwowkos.allowFileAccess = true
        ppwowkos.mediaPlaybackRequiresUserGesture = false
        ppwowkos.builtInZoomControls = true
        ppwowkos.allowFileAccess = true
        ppwowkos.pluginState = WebSettings.PluginState.ON
        ppwowkos.javaScriptCanOpenWindowsAutomatically = true
        ppwowkos.loadWithOverviewMode = true
        ppwowkos.allowContentAccess = true
        ppwowkos.displayZoomControls = false
        ppwowkos.cacheMode = WebSettings.LOAD_DEFAULT
        ppwowkos.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        ppwowkos.domStorageEnabled = true
        ppwowkos.userAgentString = ppwowkos.userAgentString.replace("; wv", "")
        return ppwowkos
    }


}