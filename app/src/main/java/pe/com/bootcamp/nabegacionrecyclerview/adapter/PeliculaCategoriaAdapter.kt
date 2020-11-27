package pe.com.bootcamp.nabegacionrecyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_pelicula_accion.view.*
import kotlinx.android.synthetic.main.item_pelicula_drama.view.*
import kotlinx.android.synthetic.main.item_pelicula_romance.view.*
import pe.com.bootcamp.nabegacionrecyclerview.R
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


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<*> {
        return when (viewType) {
            TYPE_ACCION -> {

                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_pelicula_accion, parent, false)
                PeliculaAccionHolder(view)

            }
            TYPE_ROMANCE -> {

                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_pelicula_romance, parent, false)
                PeliculaRomanceHolder(view)

            }
            TYPE_DRAMA -> {

                val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_pelicula_drama, parent, false)
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

            is PeliculaDramaHolder -> {
                holder.bind(pelicula)
            }

            is PeliculaRomanceHolder -> {
                holder.bind(pelicula)
            }

        }
        //holder.bindProduct(pelicula)

    }

    override fun getItemViewType(position: Int): Int {
        val xd = arrayPeliculas[position].genero
        return when (arrayPeliculas[position].genero) {
            "accion" -> TYPE_ACCION
            "romance" -> TYPE_ROMANCE
            "drama" -> TYPE_DRAMA
            else -> TYPE_DRAMA
        }
    }


    override fun getItemCount(): Int {
        //Aqui indicas cuantas filas tendra tu RecyclerView
        return arrayPeliculas.size
    }


    inner class PeliculaAccionHolder(private val view: View) : BaseViewHolder<Pelicula>(view) {
        override fun bind(item: Pelicula) {

            itemView.tviTitleAccion.text = "${item.genero}:  ${item.nombre}"

        }
    }

    inner class PeliculaDramaHolder(private val view: View) : BaseViewHolder<Pelicula>(view) {
        override fun bind(item: Pelicula) {
            itemView.tviTitleDrama.text = "${item.genero}: ${item.nombre}"

        }
    }

    inner class PeliculaRomanceHolder(private val view: View) : BaseViewHolder<Pelicula>(view) {
        override fun bind(item: Pelicula) {
            itemView.tviTitleRomance.text = "${item.genero}:  ${item.nombre}"

        }
    }
}

abstract class BaseViewHolder<T>(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bind(item: T)
}