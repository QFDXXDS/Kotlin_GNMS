package com.xxds.Rcd

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Message
import com.xxds.kotlin_gnms.R
import kotlinx.android.synthetic.main.activity_rcd.*
import java.util.*
import kotlin.concurrent.timer


class RcdActivity : AppCompatActivity() {

    val handel = object: Handler(){

        override fun dispatchMessage(msg: Message?) {

            if (swipRefresh.isRefreshing) {

                swipRefresh.isRefreshing = false
            } else {
                swipRefresh.isRefreshing = true

            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rcd)


//        swipRefresh.setOnRefreshListener {

        println("main thread is ${Thread.currentThread().name}")

        Timer().schedule(object: TimerTask(){

                override fun run() {

                    println("${Thread.currentThread().name}")

                    handel.sendEmptyMessage(0x123)
                }
            } , 5000,5000)

//        }
    }
}
