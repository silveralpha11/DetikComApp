package com.adith.smash.x.apkdetikcom

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.adith.smash.x.apkdetikcom.NewsAdapter.MyViewHolder
import com.adith.smash.x.apkdetikcom.NewsAdapter.news
import kotlinx.android.synthetic.main.lay_berita.view.*

class NewsAdapter (val context: Context, listnews: List<news>) :
        RecyclerView.Adapter<NewsAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentnews: news? = null
        var currentPosition: Int = 0

        fun setData(currnews: news, pos: Int){
            itemView.tvw_title.text = currnews!!.title
            itemView.tvw_Desc.text = currnews!!.desc
            itemView.img_news.setImageResource(currnews!!.photo)

            this.currentnews
            this.currentPosition
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType
        parent: ViewGroup,
        viewType: Int
    ): com.adith.smash.x.apkdetikcom.NewsAdapter.MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: com.adith.smash.x.apkdetikcom.NewsAdapter.MyViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

}