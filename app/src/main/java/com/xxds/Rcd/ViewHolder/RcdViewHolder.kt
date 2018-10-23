package com.xxds.Rcd.ViewHolder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.xxds.Rcd.Model.RcdModel
import kotlinx.android.synthetic.main.layout.view.*


/**
 * Created by xxds on 2018/10/22.
 */

class  RcdViewHolder (val content: View) {


    val imgView: ImageView = content.findViewById(R.id.imageView)
    val title: TextView = content.findViewById(R.id.title)
    val subTitle: TextView  = content.findViewById(R.id.subTitle)

    var model: RcdModel? = null

    set(value) {

        if (value != model) {

            title.text = model?.title
            subTitle.text = model?.artist_name

        }
    }
}