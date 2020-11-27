package pe.com.bootcamp.nabegacionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.com.bootcamp.nabegacionrecyclerview.model.Pelicula
import java.util.ArrayList

class PeliculaCategoriaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelicula_categoria)


        //Creamos Objtos
        val pelicula1 = Pelicula(1, "accion", "Spider man", "")
        val pelicula2 = Pelicula(2, "drama", "Guardianes de la Galaxia", "")
        val pelicula3 = Pelicula(3, "accion", "Iron Man 1", "")
        val pelicula4 = Pelicula(4, "accion", "Avengers", "")
        val pelicula5 = Pelicula(5, "romance", "Jessica Jones", "")

        val lstMeme: MutableList<Pelicula> = ArrayList()
        lstMeme.add(pelicula1)
        lstMeme.add(pelicula2)
        lstMeme.add(pelicula3)
        lstMeme.add(pelicula4)
        lstMeme.add(pelicula5)

    }
}