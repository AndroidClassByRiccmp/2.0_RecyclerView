package pe.com.bootcamp.nabegacionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import pe.com.bootcamp.nabegacionrecyclerview.model.Pais
import pe.com.bootcamp.nabegacionrecyclerview.util.Constants

class NavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation)


        intent.getParcelableExtra<Pais>(Constants.INTENT_VALUE)?.let {

            Toast.makeText(this, it.nombre, Toast.LENGTH_SHORT).show()

        }

    }
}