package pe.com.bootcamp.nabegacionrecyclerview.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class Pelicula(
    var id: Int,
    var genero: String,
    var nombre: String,
    var url: String,
    var fecha: Date
) : Parcelable