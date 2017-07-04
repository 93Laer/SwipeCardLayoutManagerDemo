package com.example.laer.recyclerviewmanager.manager

import android.content.Context
import android.util.TypedValue

/**
 * Created by laer on 2017/7/3.
 */
object CardConfig {
    //最大显示的卡片数
    var MAX_SHOW_COUNT: Int = 0

    //每一级Scale相差0.05f，translationY相差7dp左右
    var SCALE_GAP: Float = 0.toFloat()
    var TRANS_Y_GAP: Int = 0

    fun initConfig(context: Context) {
        MAX_SHOW_COUNT = 4
        SCALE_GAP = 0.05f
        TRANS_Y_GAP = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 15f, context.resources.displayMetrics).toInt()
    }
}