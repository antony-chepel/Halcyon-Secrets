package com.tocaboca.tocalifeworldt.teijw

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tocaboca.tocalifeworldt.teijw.fdgf.Tiosksajix
import com.tocaboca.tocalifeworldt.teijw.wqwsa.Bxoidiuwuwsda
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val ucijxoksd = module {

    single  <Njskksioxcjisid> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(Njskksioxcjisid::class.java)
    }

    single <Dsookxjis> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Dsookxjis::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://halcyonsecrets.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        Wqokqkookjiisjdji(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Zosokwjis(get(named("HostInter")))
    }
    single{
        fpgovkc()
    }
    single (named("SharedPreferences")) {
        hbhjvijiv(androidApplication())
    }
}

fun hbhjvijiv(epllpq: Application): SharedPreferences {
    return epllpq.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun fpgovkc(): Gson {
    return GsonBuilder().create()
}

val sppxockixcjv = module {
    viewModel (named("MainModel")){
        Tiosksajix((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Bxoidiuwuwsda(get())
    }
}