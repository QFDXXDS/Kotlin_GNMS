package com.xxds.Rcd.ViewModel

import android.arch.lifecycle.MutableLiveData
import android.databinding.ObservableArrayList
import com.xxds.GNHelper.GNHTTP.Manager.GNHTTPManager
import com.xxds.Rcd.Model.RcdModel
import com.xxds.Rcd.Req.RcdReq
import org.jetbrains.anko.db.NULL
import java.util.*

/**
 * Created by xxds on 2018/10/24.
 */

class RcdViewModel {

    var data = MutableLiveData<ArrayList<String>>()

    var password = ObservableArrayList<String>()

    var list: ArrayList<RcdModel>? = null


    fun loadData(page: Int, size: Int){

//        val req = RcdReq(page, size)



//        GNHTTPManager.req(req,{ _,_ ->
//
//
//        },{ _,_ ->
//
//
//        })
    }

}