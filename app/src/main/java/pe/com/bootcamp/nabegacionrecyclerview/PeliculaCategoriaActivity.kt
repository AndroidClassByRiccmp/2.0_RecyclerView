package pe.com.bootcamp.nabegacionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pe.com.bootcamp.nabegacionrecyclerview.adapter.PeliculaCategoriaAdapter
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ActivityPeliculaCategoriaBinding
import pe.com.bootcamp.nabegacionrecyclerview.model.Pelicula
import java.util.*

class PeliculaCategoriaActivity : AppCompatActivity() {


    private lateinit var binding: ActivityPeliculaCategoriaBinding
    private lateinit var adapter: PeliculaCategoriaAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pelicula_categoria)

        binding = ActivityPeliculaCategoriaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //Creamos Obejtos
        val pelicula1 = Pelicula(1, "accion", "Spider man", "", Date())
        val pelicula2 = Pelicula(2, "drama", "Guardianes de la Galaxia", "", Date())
        val pelicula3 = Pelicula(3, "accion", "Iron Man 1", "", Date())
        val pelicula4 = Pelicula(4, "accion", "Avengers", "", Date())
        val pelicula5 = Pelicula(5, "romance", "Jessica Jones", "", Date())

        val lstPeliculas: MutableList<Pelicula> = ArrayList()
        lstPeliculas.add(pelicula1)
        lstPeliculas.add(pelicula2)
        lstPeliculas.add(pelicula3)
        lstPeliculas.add(pelicula4)
        lstPeliculas.add(pelicula5)


        adapter = PeliculaCategoriaAdapter()

        binding.rviPeliculas.layoutManager = LinearLayoutManager(this)
        binding.rviPeliculas.adapter = adapter

        adapter.arrayPeliculas = lstPeliculas


    }
}