package com.xxds.GNHelper.GNHTTP.Manager

import com.xxds.GNHelper.GNHTTP.Object.GNHTTPObject
import okhttp3.*
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.QueryMap
import java.io.IOException

/**
 * Created by xxds on 2018/10/24.
 */
interface GNHTTPService {

    //  动态配置参数
    @GET("v1/restserver/ting")
    @Headers(
            "Accept-Encoding:application/json",
            "User-Agent:Mozilla/5.0 (Windows; U; Windows NT 5.1; en-US; rv:0.9.4)")
    fun commonRequest(@QueryMap option: Map<String,String>): retrofit2.Call<Any>
}

interface  GNHTTPInterface {


    fun method(): String {

        return "GET"
    }

    fun parameters(): Map<String,String>


    fun URL(): String
}




class GNHTTPManager {



    companion object {


        fun req(req: GNHTTPInterface, success: (Map<String,Any>) -> Unit, fail: (Call, IOException) -> Unit) {

            println(req.URL())
            println(req.parameters())

            val  retrofit: Retrofit = Retrofit.Builder()
                    .baseUrl(req.URL())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            val http = retrofit.create(GNHTTPService::class.java)

            print(retrofit.baseUrl())
            http.commonRequest(req.parameters()).enqueue(object: Callback<Any>{

                override fun onFailure(call: retrofit2.Call<Any>, t: Throwable) {


                }

                override fun onResponse(call: retrofit2.Call<Any>, response: retrofit2.Response<Any>) {

                    val body = response.body()
                    success(body as Map<String,Any>)
                    println(response.body())
                }
//                Response{protocol=http/1.1, code=403, message=Forbidden, url=http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&limits=50&method=baidu.ting.billboard.billList&order=1&page=10&page_no=1&size=20&type=2}
            })



//            val request = GNHTTPObject.createRequest(req)
//
//            GNHTTPObject.HTTP.newCall(request).enqueue(object: Callback {
//
//                override fun onFailure(call: Call?, e: IOException?) {
//
//
//                }
//
//                override fun onResponse(call: Call?, response: Response?) {
//
//                    success(call!!, response as Any)
//                }
//
//            })

        }
    }

}