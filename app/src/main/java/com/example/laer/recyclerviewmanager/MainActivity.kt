package com.example.laer.recyclerviewmanager

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.helper.ItemTouchHelper
import com.example.laer.recyclerviewmanager.adaper.LAdapter
import com.example.laer.recyclerviewmanager.entity.User
import com.example.laer.recyclerviewmanager.manager.CardConfig
import com.example.laer.recyclerviewmanager.manager.LCallBack
import com.example.laer.recyclerviewmanager.manager.SwipeCardLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //初始化配置
        CardConfig.initConfig(this)
        //设置LayoutManager
        rv_main.layoutManager= SwipeCardLayoutManager()
        //获取数据
        val datas = User.init()
        //创建adapter
        var adapter=LAdapter(datas)
        rv_main.adapter= adapter
        //创建ItemTouchHelper
        var helper: ItemTouchHelper = ItemTouchHelper(LCallBack(adapter,datas))
        helper.attachToRecyclerView(rv_main)

    }
}


