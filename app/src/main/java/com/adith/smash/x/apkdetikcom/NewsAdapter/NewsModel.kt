package com.adith.smash.x.apkdetikcom.NewsAdapter

import com.adith.smash.x.apkdetikcom.R

data class news (var title: String, var desc: String, var detail: String, var photo: Int)

object NewsModel {
    var newlist = listOf<news>(
        news("contoh 1",
            "Detikcom | 1 jam yang lalu",
            "ini adalah hasil detail",
            R.drawable.img_news1),
        news("contoh",
        "Detikcom | 1 jam yang lalu",
        "ini adalah hasil detail 2",
            R.drawable.img_news2),
        news("contoh",
        "Detikcom | 1 jam yang lalu",
        "ini adalah hasil detail 3",
            R.drawable.img_news3),
        news("contoh 4",
        "Detikcom | 1 jam yang lalu",
        "ini adalah contoh 4",
        R.drawable.img_news4)

    )
}