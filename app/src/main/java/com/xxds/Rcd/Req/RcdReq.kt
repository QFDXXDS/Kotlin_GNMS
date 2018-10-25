package com.xxds.Rcd.Req

import com.xxds.GNHelper.GNHTTP.Req.GNHTTPReq
import okhttp3.RequestBody

/**
 * Created by xxds on 2018/10/24.
 */

private val MS_LIST_URL = "http://tingapi.ting.baidu.com/v1/restserver/ting?"


class RcdReq(page: String, size: String): GNHTTPReq() {

    var method = "baidu.ting.billboard.billList"
    var type = "2"
    var format = "json"

    var limits = "50"
    var order = "1"
    var page_no = "1"
    var mpage: String? =  null
    var msize: String? = null

init {
    mpage = page
    msize = size

}

    override fun URL(): String {

        return MS_LIST_URL
    }
    override fun parameters(): RequestBody? {

        return null
    }


}