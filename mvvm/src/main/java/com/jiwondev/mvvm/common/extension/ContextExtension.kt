package com.jiwondev.mvvm.common.extension

import android.content.Context
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

fun Context.startAnimationWithShow(context: Context, view: View, id: Int) {
    view.visibility = View.VISIBLE
    view.startAnimation(AnimationUtils.loadAnimation(context, id))
}

fun Context.startAnimationWithHide(context: Context, view: View, id: Int) {
    val exitAnimation = AnimationUtils.loadAnimation(context, id)
    exitAnimation.setAnimationListener(object: Animation.AnimationListener{
        override fun onAnimationStart(p0: Animation?) {}
        override fun onAnimationEnd(p0: Animation?) { view.visibility = View.GONE }
        override fun onAnimationRepeat(p0: Animation?) {}
    })
    view.startAnimation(exitAnimation)
}