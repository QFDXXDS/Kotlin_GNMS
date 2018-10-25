package com.xxds.Rcd.ViewModel

import com.xxds.GNHelper.GNHTTP.Manager.GNHTTPManager
import com.xxds.Rcd.Model.RcdModel
import com.xxds.Rcd.Req.RcdReq
import org.jetbrains.anko.db.NULL

/**
 * Created by xxds on 2018/10/24.
 */

class RcdViewModel {

    var list: ArrayList<RcdModel>? = null


    fun loadData(page: String, size: String){

        val req = RcdReq(page, size)

        GNHTTPManager.req(req,{ _,_ ->


        },{ _,_ ->


        })
    }

}