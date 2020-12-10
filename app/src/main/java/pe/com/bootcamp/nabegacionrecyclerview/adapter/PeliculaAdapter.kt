package pe.com.bootcamp.nabegacionrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ItemPeliculaBinding
import pe.com.bootcamp.nabegacionrecyclerview.model.Pelicula
import pe.com.bootcamp.nabegacionrecyclerview.util.ItemClickListener
import pe.com.bootcamp.nabegacionrecyclerview.util.onClick


class PeliculaAdapter() : RecyclerView.Adapter<PeliculaAdapter.ViewHolder>() {

    lateinit var itemClickListener: ItemClickListener<Pelicula>
    lateinit var itemEliminarClickListener: ItemClickListener<Pelicula>

    var arrayPeliculas: List<Pelicula> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        //Este metodo hace la relacion con el layout del item
        val view = ItemPeliculaBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //Este metodo itera de acuerdo a lo que indicas en el metodo getItemCount

        val pelicula = arrayPeliculas[position]
        holder.bind(pelicula)

        holder.itemView.onClick {

            itemClickListener(position, pelicula)

        }

        holder.binding.butEliminar.onClick {
            itemEliminarClickListener(position, pelicula)
        }


    }

    override fun getItemCount(): Int {
        //Aqui indicas cuantas filas tendra tu RecyclerView
        return arrayPeliculas.size
    }


    class ViewHolder(private val itemBinding: ItemPeliculaBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {

        lateinit var binding: ItemPeliculaBinding

        fun bind(pelicula: Pelicula) {

            binding = itemBinding
            itemBinding.tviNombrePelicula.text = pelicula.nombre

        }
    }

}