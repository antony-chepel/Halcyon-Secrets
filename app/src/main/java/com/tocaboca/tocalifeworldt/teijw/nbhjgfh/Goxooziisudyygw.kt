package com.tocaboca.tocalifeworldt.teijw.nbhjgfh
import org.koin.core.qualifier.named
import java.io.File
import android.content.Intent
import java.text.SimpleDateFormat
import android.widget.Toast
import android.webkit.*
import com.tocaboca.tocalifeworldt.teijw.wqwsa.Bxoidiuwuwsda
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.gokd
import android.os.Environment
import android.os.Handler
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.io.IOException
import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.sokwdokkosdk
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.os.Bundle

import android.content.Context
import androidx.appcompat.app.AppCompatActivity

import java.util.*
import android.net.Uri

import com.tocaboca.tocalifeworldt.teijw.isdoko.Twiwiooosoxcs.jcjnjnx


class Goxooziisudyygw : AppCompatActivity() {
    private val stdywhu by viewModel<Bxoidiuwuwsda>(
        named("BeamModel")
    )
    var owwplslpd = ""
    private var fjdjis: ValueCallback<Array<Uri>>? = null
    private var dokskosa: String? = null

    lateinit var hcbhxjn: WebView
    private  val zxnciijcsjichudhygdf = 1
    private var kxkiockskod = false




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hcbhxjn = WebView(this)
        setContentView(hcbhxjn)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(hcbhxjn, true)
        stdywhu.ncnkxkduhshugywygdtfas(hcbhxjn)

        hcbhxjn.webViewClient = Eqowkwkoijsixuhhuc()
        hcbhxjn.webChromeClient = Woosoixjhugycx()
        hcbhxjn.loadUrl(gcoxooijixhuhufydygsd())
    }
    inner class Woosoixjhugycx : WebChromeClient() {

        override fun onShowFileChooser(
            yushijdjs: WebView?,
            hbcx: ValueCallback<Array<Uri>>?,
            suiwoks: FileChooserParams?
        ): Boolean {
            fjdjis?.onReceiveValue(null)
            fjdjis = hbcx
            var jjxkmcisj: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (jjxkmcisj!!.resolveActivity(packageManager) != null) {
                var wslplplplpxzockok: File? = null
                try {
                    wslplplplpxzockok = gchhjxjjijvjiduh()
                    jjxkmcisj.putExtra("PhotoPath", dokskosa)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (wslplplplpxzockok != null) {
                    dokskosa = "file:" + wslplplplpxzockok.absolutePath
                    jjxkmcisj.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(wslplplplpxzockok)
                    )
                } else {
                    jjxkmcisj = null
                }
            }
            val ncnncxhhijjdiuhshu = Intent(Intent.ACTION_GET_CONTENT)
            ncnncxhhijjdiuhshu.addCategory(Intent.CATEGORY_OPENABLE)
            ncnncxhhijjdiuhshu.type = "image/*"
            val uxozokokocs: Array<Intent?> = jjxkmcisj?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val rokkoekookskoadko = Intent(Intent.ACTION_CHOOSER)
            rokkoekookskoadko.putExtra(Intent.EXTRA_INTENT, ncnncxhhijjdiuhshu)
            rokkoekookskoadko.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            rokkoekookskoadko.putExtra(Intent.EXTRA_INITIAL_INTENTS, uxozokokocs)
            startActivityForResult(rokkoekookskoadko, zxnciijcsjichudhygdf)
            return true
        }

        fun gchhjxjjijvjiduh(): File? {
            val dokwoo = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val yxuzchs = "JPEG_" + dokwoo + "_"
            val kxkmkmmkcjhud = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                yxuzchs,
                ".jpg",
                kxkmkmmkcjhud
            )
        }
    }


    override fun onBackPressed() {

        if (hcbhxjn.canGoBack()) {
            if (kxkiockskod) {
                hcbhxjn.stopLoading()
                hcbhxjn.loadUrl(owwplslpd)
            }
            this.kxkiockskod = true
            hcbhxjn.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                kxkiockskod = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }



    fun fplelpeplws(uxhcijs: String?) {
        if (!uxhcijs!!.contains("t.me")) {

            if (owwplslpd == "") {
                owwplslpd = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    uxhcijs
                ).toString()

                val ncnxjuijdjifje = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ekookwokws = ncnxjuijdjifje.edit()
                ekookwokws.putString("SAVED_URL", uxhcijs)
                ekookwokws.apply()
            }
        }
    }


    override fun onActivityResult(gkoosd: Int, fpllpslpd: Int, viojcjobk: Intent?) {

        if (gkoosd != zxnciijcsjichudhygdf || fjdjis == null) {
            super.onActivityResult(gkoosd, fpllpslpd, viojcjobk)
            return
        }
        var dpellpwlps: Array<Uri>? = null

        if (fpllpslpd == RESULT_OK) {
            if (viojcjobk == null) {
                if (dokskosa != null) {
                    dpellpwlps = arrayOf(Uri.parse(dokskosa))
                }
            } else {
                val jjhdygfeyg = viojcjobk.dataString
                if (jjhdygfeyg != null) {
                    dpellpwlps = arrayOf(Uri.parse(jjhdygfeyg))
                }
            }
        }
        fjdjis!!.onReceiveValue(dpellpwlps)
        fjdjis = null
        return
    }

    inner class Eqowkwkoijsixuhhuc: WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (stdywhu.hchjxjxijjidshuf(url)) {

                    val ycuhcijdjf = Intent(Intent.ACTION_VIEW)
                    ycuhcijdjf.data = Uri.parse(url)
                    startActivity(ycuhcijdjf)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            fplelpeplws(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@Goxooziisudyygw, description, Toast.LENGTH_SHORT).show()
        }
    }

    private fun gcoxooijixhuhufydygsd(): String {
        val owokkokosjidijx = getSharedPreferences("SHARED_PREF",
            Context.MODE_PRIVATE)
        val dfkoks = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
        val bhcxjivjidji = owokkokosjidijx.getString(gokd, null)
        val sudhwji = owokkokosjidijx.getString(sokwdokkosdk, null)
        val uxhchuzhucs = owokkokosjidijx.getString(jcjnjnx, null)






        when (owokkokosjidijx.getString("WebInt", null)) {
            "campaign" -> {
                stdywhu.fokokos(sudhwji.toString())
            }
            "deepLink" -> {
                stdywhu.fokokos(sudhwji.toString())
            }
            "deepLinkNOApps" -> {
                stdywhu.fokokos(bhcxjivjidji.toString())
            }
            "geo" -> {
                stdywhu.fokokos(bhcxjivjidji.toString())
            }
        }
        return dfkoks.getString("SAVED_URL", uxhchuzhucs).toString()
    }




}

