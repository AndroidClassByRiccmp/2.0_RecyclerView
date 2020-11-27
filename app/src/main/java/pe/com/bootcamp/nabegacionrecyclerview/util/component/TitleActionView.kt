package pe.com.bootcamp.nabegacionrecyclerview.util.component

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.core.content.res.ResourcesCompat
import kotlinx.android.synthetic.main.view_title_action.view.*
import pe.com.bootcamp.nabegacionrecyclerview.R


class TitleActionView(context: Context, attrs: AttributeSet? = null) :
    LinearLayout(context, attrs) {

    init {


        inflate(context, R.layout.view_title_action, this)

        attrs?.let {
            val attributes = context.obtainStyledAttributes(attrs, R.styleable.TitleActionView)
            tviTitle.text = attributes.getString(R.styleable.TitleActionView_title)


            attributes.recycle()
        }


    }


    fun initializeUI(
        title: String
    ) {

        tviTitle.text = title
        tviTitle.setTextColor(
            ResourcesCompat.getColor(
                this.resources,
                R.color.white,
                null
            )
        )


    }


}