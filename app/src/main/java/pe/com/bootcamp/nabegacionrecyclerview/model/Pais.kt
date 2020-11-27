package pe.com.bootcamp.nabegacionrecyclerview.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Pais(
    var id: Int,
    var nombre: String,
    var ciudadanos: Int,
    var bandera: String
) : Parcelable