package com.xxds.Rcd.ViewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.xxds.Rcd.Model.RcdModel
import com.xxds.kotlin_gnms.R


/**
 * Created by xxds on 2018/10/22.
 */

//class  RcdViewHolder (val content: View,itemClickLisner: ()->Unit ): RecyclerView.ViewHolder(content) {


//    val imgView: ImageView = content.findViewById(R.id.imageView)
//    val title: TextView = content.findViewById(R.id.title)
//    val subTitle: TextView  = content.findViewById(R.id.subTitle)
//
//    var model: RcdModel? = null
//    set(value) {
//
//        if (value != field) {
//
//            field = value
//        }
//        title.text = model?.displayName
//        subTitle.text = model?.phone
//    }
//
//    init {
//
//        content.setOnClickListener {
//
//            if(itemClickLisner != null) itemClickLisner()
//
//        }
//    }
//}