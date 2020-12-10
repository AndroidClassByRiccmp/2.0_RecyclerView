package pe.com.bootcamp.nabegacionrecyclerview.util.component

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.core.content.res.ResourcesCompat
import pe.com.bootcamp.nabegacionrecyclerview.R
import pe.com.bootcamp.nabegacionrecyclerview.databinding.ViewTitleActionBinding


class TitleActionView(context: Context, attrs: AttributeSet? = null) :
    LinearLayout(context, attrs) {

    private val binding =
        ViewTitleActionBinding.inflate(LayoutInflater.from(context), this, true)

    init {


        inflate(context, R.layout.view_title_action, this)

        attrs?.let {
            val attributes = context.obtainStyledAttributes(attrs, R.styleable.TitleActionView)
            binding.tviTitle.text = attributes.getString(R.styleable.TitleActionView_title)


            attributes.recycle()
        }


    }


    fun initializeUI(
        title: String
    ) {

        binding.tviTitle.text = title
        binding.tviTitle.setTextColor(
            ResourcesCompat.getColor(
                this.resources,
                R.color.white,
                null
            )
        )


    }


}