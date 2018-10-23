package com.xxds.Rcd

import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
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


        recycleList = ArrayList()
        recycleList.add(RcdModel("first",23411))
        recycleView = findViewById(R.id.recycleView)
        recycleView.layoutManager = LinearLayoutManager(this)
        recycleView.adapter = rcdAdapter(recycleList,{

            print("12345")
        })



    }


      class rcdAdapter( var recycleList: ArrayList<RcdModel>,val itemClickLisner: ()->Unit ): RecyclerView.Adapter<RcdViewHolder>() {


          override fun getItemCount(): Int =  recycleList.size


          override fun onBindViewHolder(holder: RcdViewHolder?, position: Int) {


              holder?.model = recycleList[position]
          }

          override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RcdViewHolder {

                val v = LayoutInflater.from(parent?.context).inflate(R.layout.layout,parent!!,false)
              return RcdViewHolder(v, itemClickLisner)

          }


//        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//
//            var v: View
//            var holder: RcdViewHolder
//            if (convertView == null) {
//
//                v = View.inflate(context,R.layout.layout,null)
//                holder = RcdViewHolder(v)
//                v.tag =  holder
//            } else {
//                v = convertView
//                holder = v.tag as RcdViewHolder
//
//            }
//
//            holder.model = recycleList[position]
//            return  v
//        }
//
//        override fun getItem(position: Int): Any {
//
//                return 1
//        }
//
//        override fun getItemId(position: Int): Long {
//
//            return position.toLong()
//        }

//          class  RcdViewHolder(val )
     }

}
