package com.xxds.Rcd.Req

import com.xxds.GNHelper.GNHTTP.Req.GNHTTPReq
import okhttp3.RequestBody
import kotlin.reflect.full.memberProperties

/**
 * Created by xxds on 2018/10/24.
 */

private val MS_LIST_URL = "http://tingapi.ting.baidu.com/"


class RcdReq(mpage: Int, msize: Int): GNHTTPReq() {

    var method = "baidu.ting.billboard.billList"
    var type = "2"
    var format = "json"

    var limits = "50"
    var order = "1"
    var page_no = "1"
    var page: String = mpage.toString()
    var size: String = msize.toString()

//init {
//    page = mpage
//    size = size
//
//}

    override fun URL(): String {

        return MS_LIST_URL
    }


}