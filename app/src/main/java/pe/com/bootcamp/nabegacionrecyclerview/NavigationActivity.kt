package pe.com.bootcamp.nabegacionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ActivityNavigationBinding
import pe.com.bootcamp.nabegacionrecyclerview.model.Pelicula

class NavigationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)


        intent.getParcelableExtra<Pelicula>("pelicula")?.let { movie ->

            Toast.makeText(this, "Nombre pelicula: ${movie.nombre}", Toast.LENGTH_SHORT).show()
        }


    }
}