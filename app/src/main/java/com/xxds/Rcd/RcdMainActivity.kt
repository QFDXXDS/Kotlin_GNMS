package com.xxds.Rcd

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.BaseAdapter
import com.xxds.Rcd.Model.RcdModel
import com.xxds.Rcd.ViewHolder.RcdViewHolder
import com.xxds.kotlin_gnms.R

import kotlinx.android.synthetic.main.activity_rcd_main.*

class RcdMainActivity : AppCompatActivity() {

    lateinit var recycleView: RecyclerView
    lateinit var recycleList: ArrayList<RcdModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rcd_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }


        recycleView = findViewById(R.id.recycleView)
        recycleView.adapter = rcdAdapter<RcdViewHolder>()

    }



    inner  class rcdAdapter<RcdViewHolder>: BaseAdapter() {

          override fun getCount(): Int {

              return recycleList.size
          }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

            var v: View
            var holder: RcdViewHolder
            if (convertView == null) {

                v = View.inflate(this@RcdMainActivity,R.layout.layout,null)
                holder = RcdViewHolder(v)
                v.tag =  holder
            } else {
                v = convertView
                holder = v.tag as RcdViewHolder

            }

            holder.model = recycleList[position]
            return  v
        }

        override fun getItem(position: Int): Any {

                return 1
        }

        override fun getItemId(position: Int): Long {

            return position.toLong()
        }
     }

}
