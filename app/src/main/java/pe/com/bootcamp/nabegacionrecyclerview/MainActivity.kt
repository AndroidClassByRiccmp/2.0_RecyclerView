package pe.com.bootcamp.nabegacionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.initializeUI()
        this.setup()
    }


    private fun initializeUI() {
        vNavigation.initializeUI(resources.getString(R.string.view_navigation))
        vList.initializeUI(resources.getString(R.string.view_list))
        vMultipleList.initializeUI(resources.getString(R.string.view_list_multiple))


    }

    fun setup() {
        //vNavigation.setOnClickListener(this)
        //vList.setOnClickListener(this)
        //vMultipleList.setOnClickListener(this)
    }
}