package pe.com.bootcamp.nabegacionrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.com.bootcamp.nabegacionrecyclerview.R
import pe.com.bootcamp.nabegacionrecyclerview.model.Pelicula
import pe.com.bootcamp.nabegacionrecyclerview.util.ItemClickListener


class PeliculaAdapter() : RecyclerView.Adapter<PeliculaAdapter.ViewHolder>() {

    lateinit var itemClickListener: ItemClickListener<Pelicula>

    var arrayPeliculas: List<Pelicula> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        //Este metodo hace la relacion con el layout del item

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_pelicula, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Este metodo itera de acuerdo a lo que indicas en el metodo getItemCount


        //holder.bindProduct(pelicula)

    }

    override fun getItemCount(): Int {
        //Aqui indicas cuantas filas tendra tu RecyclerView
        return arrayPeliculas.size
    }


    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        fun bindProduct(pelicula: Pelicula) {

        }

    }

}