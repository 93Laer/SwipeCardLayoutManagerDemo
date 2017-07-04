package com.example.laer.recyclerviewmanager.manager

import android.graphics.Canvas
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.helper.ItemTouchHelper
import com.example.laer.recyclerviewmanager.adaper.UniversalAdapter
import com.example.laer.recyclerviewmanager.entity.User
import android.support.v4.view.ViewCompat.setScaleY
import android.support.v4.view.ViewCompat.setScaleX
import android.support.v4.view.ViewCompat.setTranslationY
import android.R.fraction
import android.support.v4.view.ViewCompat.setScaleY
import android.support.v4.view.ViewCompat.setScaleX
import android.support.v4.view.ViewCompat.setTranslationY
import android.opengl.ETC1.getWidth
import com.example.laer.recyclerviewmanager.adaper.LAdapter


/**
 * Created by laer on 2017/7/3.
 */
class LCallBack(val mAdapter: LAdapter, var mDatas: ArrayList<User>)
    : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT or ItemTouchHelper.UP or ItemTouchHelper.DOWN) {

    override fun onMove(recyclerView: RecyclerView?, viewHolder: RecyclerView.ViewHolder?, target: RecyclerView.ViewHolder?): Boolean {
        return false
    }

    override fun onSwiped(viewHolder: RecyclerView.ViewHolder?, direction: Int) {
        //交换item的位置，并刷新适配器
        val user = mDatas.removeAt(viewHolder!!.layoutPosition)
        mDatas.add(0,user)
        mAdapter.notifyItemMoved(viewHolder!!.layoutPosition,0)
    }

    override fun onChildDraw(c: Canvas?, recyclerView: RecyclerView?, viewHolder: RecyclerView.ViewHolder?, dX: Float, dY: Float, actionState: Int, isCurrentlyActive: Boolean) {
//        //给一个反向的过渡动画
//
//        //这里模拟生成一个0-1的值
//        val maxDistance = recyclerView!!.width * 0.5f
//        val distance = Math.sqrt(dX * dX + dY * dY.toDouble())
//        var fraction:Double = distance / maxDistance.toDouble()
//        if (fraction > 1) {
//            fraction = 1.0
//        }
//
//        val itemCount = recyclerView.childCount
//        for (i in 0..itemCount - 1) {
//            val view = recyclerView.getChildAt(i)
//            val level = itemCount - i - 1
//
//            if (level >= 0) {
//                if (level < CardConfig.MAX_SHOW_COUNT - 1) {
//                    //当level是0到MAX_SHOW_COUNT-2
//                    view.translationY = (CardConfig.TRANS_Y_GAP * level - fraction * CardConfig.TRANS_Y_GAP).toFloat()
//                    view.scaleX = (1 - CardConfig.SCALE_GAP * level + fraction * CardConfig.SCALE_GAP).toFloat()
//                    view.scaleY = (1 - CardConfig.SCALE_GAP * level + fraction * CardConfig.SCALE_GAP).toFloat()
//                } else if (level == CardConfig.MAX_SHOW_COUNT - 1) {
//                    // level是MAX_SHOW_COUNT-1
//                    view.translationY = CardConfig.TRANS_Y_GAP * (level - 1).toFloat()
//                    view.scaleX = 1 - CardConfig.SCALE_GAP * (level - 1).toFloat()
//                    view.scaleY = 1 - CardConfig.SCALE_GAP * (level - 1).toFloat()
//                }
//            }
//        }

        super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive)
    }

    /**
     * 设置出发滑动的阀值
     */
    override fun getSwipeThreshold(viewHolder: RecyclerView.ViewHolder?): Float {
        return 0.4f
    }
}