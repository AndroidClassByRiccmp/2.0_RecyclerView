package pe.com.bootcamp.nabegacionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_pelicula_categoria.*
import pe.com.bootcamp.nabegacionrecyclerview.adapter.PeliculaCategoriaAdapter
import pe.com.bootcamp.nabegacionrecyclerview.model.Pelicula
import java.util.ArrayList

class PeliculaCategoriaActivity : AppCompatActivity() {

    private lateinit var adapter: PeliculaCategoriaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelicula_categoria)


      this.setup()

    }

    fun setup() {
        //Creamos Objtos
        val pelicula1 = Pelicula(1, "accion", "Spider man", "")
        val pelicula2 = Pelicula(2, "drama", "Guardianes de la Galaxia", "")
        val pelicula3 = Pelicula(3, "accion", "Iron Man 1", "")
        val pelicula4 = Pelicula(4, "accion", "Avengers", "")
        val pelicula5 = Pelicula(5, "romance", "Jessica Jones", "")

        val lstPelicula: MutableList<Pelicula> = ArrayList()
        lstPelicula.add(pelicula1)
        lstPelicula.add(pelicula2)
        lstPelicula.add(pelicula3)
        lstPelicula.add(pelicula4)
        lstPelicula.add(pelicula5)

        //Setup RecyclerView
        adapter = PeliculaCategoriaAdapter()


        rviPeliculaCategoria.layoutManager = LinearLayoutManager(this)
        rviPeliculaCategoria.adapter = adapter

        adapter.arrayPeliculas = lstPelicula
    }
}