package com.hamburger.sampleandroidlifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class SampleLifecycleObserver(private val key: String) : DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        logcat("onCreate")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        logcat("onStart")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        logcat("onResume")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        logcat("onPause")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        logcat("onStop")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        logcat("onDestroy")
    }

    fun logcat(message: String) {
        Log.d(key, message)
    }
}