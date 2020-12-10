package pe.com.bootcamp.nabegacionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import pe.com.bootcamp.nabegacionrecyclerview.adapter.PeliculaAdapter
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ActivityPeliculaBinding
import pe.com.bootcamp.nabegacionrecyclerview.model.Pelicula
import java.util.*
import kotlin.collections.ArrayList

class PeliculaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPeliculaBinding
    private lateinit var adapter: PeliculaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelicula)


        binding = ActivityPeliculaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        setup()
    }

    fun setup() {

        val pelicula1 = Pelicula(1, "accion", "Spider man", "", Date())
        val pelicula2 = Pelicula(2, "drama", "Guardianes de la Galaxia", "", Date())
        val pelicula3 = Pelicula(3, "accion", "Iron Man 1", "", Date())
        val pelicula4 = Pelicula(4, "accion", "Avengers", "", Date())
        val pelicula5 = Pelicula(5, "romance", "Jessica Jones", "", Date())

        val lstPelicula: MutableList<Pelicula> = ArrayList()
        lstPelicula.add(pelicula1)
        lstPelicula.add(pelicula2)
        lstPelicula.add(pelicula3)
        lstPelicula.add(pelicula4)
        lstPelicula.add(pelicula5)


        adapter = PeliculaAdapter()

        binding.rviPeliculas.layoutManager = LinearLayoutManager(this)
        binding.rviPeliculas.adapter = adapter

        adapter.arrayPeliculas = lstPelicula


        adapter.itemClickListener = { _, data ->
            Toast.makeText(this, "Nombre pelicula: ${data.nombre}", Toast.LENGTH_SHORT).show()


        }


        adapter.itemEliminarClickListener = { _, data ->
            Toast.makeText(this, "Se elimino pelicula ${data.nombre}", Toast.LENGTH_SHORT).show()


        }

    }
}