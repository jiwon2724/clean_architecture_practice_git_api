package com.jiwondev.mvvm.custom

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.view.View

class MyView(context: Context, attrsSet: AttributeSet) : View(context, attrsSet) {
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val widthMode = MeasureSpec.getMode(widthMeasureSpec)
        val widthSize = MeasureSpec.getSize(widthMeasureSpec)
        val heightMode = MeasureSpec.getMode(heightMeasureSpec)
        val heightSize = MeasureSpec.getSize(heightMeasureSpec)

        Log.d("width : ", widthMode.toString())
        Log.d("height : ", heightMode.toString())
        Log.d("widthSize : ", widthSize.toString())
        Log.d("heightSize : ", heightSize.toString())

        val density = resources.displayMetrics.density
        val dp = (widthSize / density).toInt()
        Log.d("result! : ", dp.toString())
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    }
}