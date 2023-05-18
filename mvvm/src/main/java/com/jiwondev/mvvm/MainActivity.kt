package com.jiwondev.mvvm

import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.fragment.app.DialogFragment
import com.jiwondev.mvvm.common.extension.startAnimationWithHide
import com.jiwondev.mvvm.common.extension.startAnimationWithShow
import com.jiwondev.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         installSplashScreen()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        startAnimationWithShow(this, binding.testView, R.anim.enter)
//
//        binding.testView.setOnClickListener {
//            startAnimationWithHide(this, binding.testView, R.anim.exit)
//        }
    }
}