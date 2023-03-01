package com.tocaboca.tocalifeworldt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tocaboca.tocalifeworldt.teijw.fdgf.Tiosksajix
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named

class MainActivity : AppCompatActivity() {
    val hdowwookkosdoak by viewModel<Tiosksajix>(named("MainModel"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hdowwookkosdoak.fokrokelppls(this)
    }
}