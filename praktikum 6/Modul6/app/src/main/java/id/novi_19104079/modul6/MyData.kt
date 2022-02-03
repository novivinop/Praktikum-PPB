package id.novi_19104079.modul6

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyData(
    var name: String,
    var description: String,
    var photo: String,
    val lat: Double,
    val lang: Double
) : Parcelable