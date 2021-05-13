package com.example.hiltdatabindingdemo

import android.app.Application
import androidx.databinding.DataBindingUtil
import com.example.hiltdatabindingdemo.di.CustomBindingComponentBuilder
import com.example.hiltdatabindingdemo.di.CustomBindingEntryPoint
import dagger.hilt.EntryPoints
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import javax.inject.Provider

@HiltAndroidApp
class HiltDataBindingApp : Application() {

    @Inject
    lateinit var bindingComponentProvider: Provider<CustomBindingComponentBuilder>

    override fun onCreate() {
        super.onCreate()

        DataBindingUtil.setDefaultComponent(EntryPoints.get(bindingComponentProvider.get().build(), CustomBindingEntryPoint::class.java))
    }
}
