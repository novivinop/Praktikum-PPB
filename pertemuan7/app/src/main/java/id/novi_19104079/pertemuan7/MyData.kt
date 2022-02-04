package id.novi_19104079.pertemuan7

import android.os.Parcelable

@Parcelize
class MyData (
    var name: String,
    var description: String,
    var photo: String,
    val lat: Double,
    val lang: Double
): Parcelable