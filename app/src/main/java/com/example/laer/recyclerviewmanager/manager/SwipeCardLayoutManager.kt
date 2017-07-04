package com.example.laer.recyclerviewmanager.manager

import android.support.v7.widget.RecyclerView

/**
 * Created by laer on 2017/7/3.
 */
class SwipeCardLayoutManager :RecyclerView.LayoutManager(){
    override fun generateDefaultLayoutParams(): RecyclerView.LayoutParams {
        return RecyclerView.LayoutParams(RecyclerView.LayoutParams.WRAP_CONTENT, RecyclerView.LayoutParams.WRAP_CONTENT)
    }

    override fun onLayoutChildren(recycler: RecyclerView.Recycler?, state: RecyclerView.State?) {
        //将view放到RecyclerView的回收站中
        detachAndScrapAttachedViews(recycler)
        //设置开始遍历的position
        var initPosition: Int

        if (CardConfig.MAX_SHOW_COUNT > itemCount) {
            initPosition = 0
        } else {
            initPosition = itemCount - CardConfig.MAX_SHOW_COUNT
        }

        //循环遍历，摆放子view
        for (position in initPosition..itemCount - 1 ) {
            //获取到回收站中的view
            val view = recycler!!.getViewForPosition(position)
            //将view添加到RecyclerView中
            addView(view)
            //测量view
            measureChild(view, 0, 0)
            //摆放控件（布局装饰）
            var decorateWidth = getDecoratedMeasuredWidth(view)
            var decorateHeight = getDecoratedMeasuredHeight(view)
            var left=(width- decorateWidth)/2
            var top=(height- decorateHeight)/2
            layoutDecorated(view, left, top, left + decorateWidth, top + decorateHeight)
            //动画处理（移动，缩放）
            val level = itemCount - position - 1
            if (level > 0) {
                view.scaleX = 1f - CardConfig.SCALE_GAP * level
                view.scaleY = 1f - CardConfig.SCALE_GAP * level
                if (level < CardConfig.MAX_SHOW_COUNT-1) {
                    view.translationY = CardConfig.TRANS_Y_GAP * level.toFloat()
                }else{
                    view.translationY=CardConfig.TRANS_Y_GAP * (level - 1).toFloat()
                }
            }
        }
    }
}