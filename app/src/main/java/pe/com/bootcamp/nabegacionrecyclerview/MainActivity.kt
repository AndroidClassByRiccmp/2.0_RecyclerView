package pe.com.bootcamp.nabegacionrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ActivityMainBinding
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ActivityNavigationBinding
import pe.com.bootcamp.nabegacionrecyclerview.model.Pelicula
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        this.initializeUI()
        this.setup()
    }


    private fun initializeUI() {

        binding.vNavigation.initializeUI(resources.getString(R.string.view_navigation))
        binding.vList.initializeUI(resources.getString(R.string.view_list))
        binding.vMultipleList.initializeUI(resources.getString(R.string.view_list_multiple))


    }

    fun setup() {
        binding.vNavigation.setOnClickListener(this)
        binding.vList.setOnClickListener(this)
        binding.vMultipleList.setOnClickListener(this)
    }

    override fun onClick(view: View) {

        when (view.id) {
            R.id.vNavigation -> {

                val intent = Intent(this, NavigationActivity::class.java)
                intent.putExtra("pelicula", Pelicula(0, "Accion", "Star Wars", "", fecha = Date()))

                startActivity(intent)

            }
            R.id.vList -> {
                val intent = Intent(this, PeliculaActivity::class.java)
                startActivity(intent)
            }

            R.id.vMultipleList -> {
                val intent = Intent(this, PeliculaCategoriaActivity::class.java)
                startActivity(intent)
            }

            else -> {

            }

        }


    }
}