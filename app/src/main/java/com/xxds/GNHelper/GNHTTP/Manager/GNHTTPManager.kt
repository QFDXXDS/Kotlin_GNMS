package com.xxds.GNHelper.GNHTTP.Manager

import com.xxds.GNHelper.GNHTTP.Object.GNHTTPObject
import okhttp3.*
import java.io.IOException

/**
 * Created by xxds on 2018/10/24.
 */

interface  GNHTTPInterface {

    fun method(): String {

        return "GET"
    }

    fun parameters(): RequestBody?

    fun URL(): String
}

class GNHTTPManager {


    companion object {

        fun req(req: GNHTTPInterface, success: (Call, Any)->Unit, fail: (Call, IOException)->Unit) {


            val request = GNHTTPObject.createRequest(req)

            GNHTTPObject.HTTP.newCall(request).enqueue(object: Callback {

                override fun onFailure(call: Call?, e: IOException?) {


                }

                override fun onResponse(call: Call?, response: Response?) {

                    success(call!!, response as Any)
                }

            })

        }
    }

}