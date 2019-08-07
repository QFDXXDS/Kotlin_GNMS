package com.xxds.GNHelper.GNHTTP.Object

import com.xxds.GNHelper.GNHTTP.Manager.GNHTTPInterface
import okhttp3.*
import okhttp3.internal.http.HttpMethod
import java.io.IOException

/**
 * Created by xxds on 2018/10/24.
 */


class  GNHTTPObject {


    companion object {

        var HTTP = OkHttpClient()

        fun createRequest(req: GNHTTPInterface): Request {

            var url = this.URL(req)
            var requet = Request.Builder()
                    .url(req.URL())
                    .build()

            return requet
        }

        fun URL(req: GNHTTPInterface): String {

            var url = req.URL()
            if (HttpMethod.permitsRequestBody(req.method())) {


            }
            return  url
        }
    }
}