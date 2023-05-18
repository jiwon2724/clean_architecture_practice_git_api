package com.jiwondev.mvvm

import android.app.Application
import android.media.Image
import coil.ImageLoader
import coil.ImageLoaderFactory

class App : Application(), ImageLoaderFactory {
    override fun newImageLoader(): ImageLoader {
        return ImageLoader.Builder(this)
            .crossfade(true)
            .crossfade(5000)
            .build()
    }
}