package pe.com.bootcamp.nabegacionrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ItemPeliculaAccionBinding
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ItemPeliculaDramaBinding
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ItemPeliculaRomanceBinding
import pe.com.bootcamp.nabegacionrecyclerview.model.Pelicula


class PeliculaCategoriaAdapter() : RecyclerView.Adapter<BaseViewHolder<*>>() {


    companion object {
        const val TYPE_ACCION = 1
        const val TYPE_ROMANCE = 2
        const val TYPE_DRAMA = 3
    }

    var arrayPeliculas: List<Pelicula> = ArrayList()
        set(value) {
            field = value
            notifyDataSetChanged()

        }


    override fun getItemViewType(position: Int): Int {
        return when (arrayPeliculas[position].genero) {
            "accion" -> TYPE_ACCION
            "romance" -> TYPE_ROMANCE
            "drama" -> TYPE_DRAMA
            else -> TYPE_DRAMA
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return when (viewType) {
            TYPE_ACCION -> {

                //val view = ItemPeliculaBinding.inflate(LayoutInflater.from(parent.context), parent, false)

                val view = ItemPeliculaAccionBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                PeliculaAccionHolder(view)

            }
            TYPE_ROMANCE -> {

                val view = ItemPeliculaRomanceBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                PeliculaRomanceHolder(view)

            }
            TYPE_DRAMA -> {

                val view = ItemPeliculaDramaBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                PeliculaDramaHolder(view)

            }
            else -> throw IllegalArgumentException("Invalid view type")
        }

    }

    override fun onBindViewHolder(holder: BaseViewHolder<*>, position: Int) {
        //Este metodo itera de acuerdo a lo que indicas en el metodo getItemCount

        val pelicula = arrayPeliculas[position]

        when (holder) {
            is PeliculaAccionHolder -> {
                holder.bind(pelicula)

            }

            is PeliculaRomanceHolder -> {
                holder.bind(pelicula)
            }

            is PeliculaDramaHolder -> {
                holder.bind(pelicula)
            }
        }


    }


    override fun getItemCount(): Int {
        //Aqui indicas cuantas filas tendra tu RecyclerView
        return arrayPeliculas.size
    }

    //region holder

    inner class PeliculaAccionHolder(private val itemBinding: ItemPeliculaAccionBinding) :
        BaseViewHolder<Pelicula>(itemBinding.root) {

        override fun bind(item: Pelicula) {

            itemBinding.tviNombrePelicula.text = "${item.genero}:  ${item.nombre}"

        }
    }


    inner class PeliculaDramaHolder(private val itemBinding: ItemPeliculaDramaBinding) :
        BaseViewHolder<Pelicula>(itemBinding.root) {
        override fun bind(item: Pelicula) {

            itemBinding.tviTitleDrama.text = "Esto es una pelicula de drama: ${item.nombre}"

        }
    }

    inner class PeliculaRomanceHolder(private val itemBinding: ItemPeliculaRomanceBinding) :
        BaseViewHolder<Pelicula>(itemBinding.root) {
        override fun bind(item: Pelicula) {


            itemBinding.tviTitleRomance.text = "${item.genero}:  ${item.nombre}"

        }
    }

    //endregion

}

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item: T)
}