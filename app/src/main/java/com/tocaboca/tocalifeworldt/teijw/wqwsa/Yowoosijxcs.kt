package com.tocaboca.tocalifeworldt.teijw

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
class Zosokwjis(private val uxiizioc: Njskksioxcjisid) {
    suspend fun fewosoa() = uxiizioc.cbbbbcxjjxuhuds()
}

@Keep
data class Rowokkosixcj(
    @SerializedName("countryCode")
    val jcjxjjixijcjijidv: String,
)

class Wqokqkookjiisjdji(private val xnzcjjnjsi: Dsookxjis) {
    suspend fun tysuuidjiwj() = xnzcjjnjsi.xhzhcjsidjihushu()
}

interface Njskksioxcjisid {
    @GET("halc_secrts.json")
    suspend fun cbbbbcxjjxuhuds(): Response<Jowoowokskkxijcxz>
}


@Keep
data class Jowoowokskkxijcxz(
    @SerializedName("halc_secrts_gfiicixugyvg")
    val yhxksa: String,
    @SerializedName("halc_secrts_vbgdtys")
    val eplwpllpplskookckoxz: String,
    @SerializedName("halc_secrts_aeiwqusxxc")
    val yggcyuhuxh: String,
)

interface Dsookxjis {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun xhzhcjsidjihushu(): Response<Rowokkosixcj>
}









