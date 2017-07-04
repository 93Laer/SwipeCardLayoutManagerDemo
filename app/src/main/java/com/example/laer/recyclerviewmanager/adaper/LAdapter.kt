package com.example.laer.recyclerviewmanager.adaper

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.laer.recyclerviewmanager.R
import com.example.laer.recyclerviewmanager.entity.User
/**
 * Created by laer on 2017/7/4.
 */
class LAdapter(var mDatas: ArrayList<User>) : RecyclerView.Adapter<LAdapter.ViewHolder>() {
    var mContext:Context?=null
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.bindView(mDatas[position])
    }

    override fun getItemCount(): Int {
        return mDatas.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        mContext=parent!!.context.applicationContext
        return ViewHolder(LayoutInflater.from(parent!!.context).inflate(R.layout.item_swipe_card,parent,false))
    }

    inner  class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var iv=itemView!!.findViewById<ImageView>(R.id.iv)
        var tvName=itemView!!.findViewById<TextView>(R.id.tvName)
        var tvPrecent=itemView!!.findViewById<TextView>(R.id.tvPrecent)
        fun bindView(user: User){
            tvName.text = user.name
            tvPrecent.text = user.position.toString() + "/" + mDatas.size
            Glide.with(mContext).load(user.imagePath).into(iv)
        }
    }
}