package com.xxds.GNHelper.GNHTTP.Req

import com.xxds.GNHelper.GNHTTP.Manager.GNHTTPInterface
import okhttp3.RequestBody
import org.jetbrains.anko.db.NULL
import kotlin.reflect.full.memberProperties

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

    override fun parameters(): Map<String,String> {

        val props = this::class.memberProperties
        val map = mutableMapOf<String,String>()
        props.forEach {

            val value = it.call(this)
            map[it.name] = value!!.toString()
        }
        return map
    }

}