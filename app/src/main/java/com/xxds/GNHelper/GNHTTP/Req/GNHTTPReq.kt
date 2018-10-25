package com.xxds.GNHelper.GNHTTP.Req

import com.xxds.GNHelper.GNHTTP.Manager.GNHTTPInterface
import okhttp3.RequestBody
import org.jetbrains.anko.db.NULL

/**
 * Created by xxds on 2018/10/24.
 */

// 类默认是finnal的
open class GNHTTPReq: GNHTTPInterface {

    override fun URL(): String {

        return ""
    }

//    override fun method(): String {
//
//        return "GET"
//    }

    override fun parameters(): RequestBody? {

        return null
    }

}