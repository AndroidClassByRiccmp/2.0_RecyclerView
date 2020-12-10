package pe.com.bootcamp.nabegacionrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ActivityMainBinding
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ActivityNavigationBinding

class MainActivity : AppCompatActivity() {


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
        //vNavigation.setOnClickListener(this)
        //vList.setOnClickListener(this)
        //vMultipleList.setOnClickListener(this)
    }
}