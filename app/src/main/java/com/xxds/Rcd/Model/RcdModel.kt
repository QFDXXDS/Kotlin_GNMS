package com.xxds.Rcd.Model

/**
 * Created by xxds on 2018/10/22.
 */

//data class  RcdModel(val title: String,
//                     val song_id: Int,
//                     val artist_name: String = "",
//                     var pic_big: String = "",
//                     var hot: String = "",
//                     var file_duration: String = "") {
//
//}

data class  RcdModel(val title: String = "",
                     val song_id: Int = 0,
                     val artist_name: String = "",
                     var pic_big: String = "",
                     var hot: String = "",
                     var file_duration: String = "",
                     var displayName:String = "",
                     var phone:String = "") {


}
