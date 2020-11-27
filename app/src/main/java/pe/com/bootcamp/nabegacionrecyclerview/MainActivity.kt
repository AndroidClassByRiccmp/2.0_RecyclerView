package pe.com.bootcamp.nabegacionrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import pe.com.bootcamp.nabegacionrecyclerview.model.Pais
import pe.com.bootcamp.nabegacionrecyclerview.util.Constants

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.initializeUI()
        this.setup()
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.vNavigation -> {
                val intent = Intent(this, NavigationActivity::class.java)
                intent.putExtra(Constants.INTENT_VALUE, Pais(1, "Peru", 100000, ""))
                startActivity(intent)
            }

            R.id.vList -> {
                startActivity(Intent(this, PeliculaActivity::class.java))
            }

            R.id.vMultipleList -> {
                startActivity(Intent(this, PeliculaCategoriaActivity::class.java))
            }

        }
    }

    private fun initializeUI() {
        vNavigation.initializeUI(resources.getString(R.string.view_navigation))
        vList.initializeUI(resources.getString(R.string.view_list))
        vMultipleList.initializeUI(resources.getString(R.string.view_list_multiple))


    }

    private fun setup() {
        vNavigation.setOnClickListener(this)
        vList.setOnClickListener(this)
        vMultipleList.setOnClickListener(this)
    }


}