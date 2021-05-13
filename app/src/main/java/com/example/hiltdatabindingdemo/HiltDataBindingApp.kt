package com.example.hiltdatabindingdemo

import android.app.Application
import androidx.databinding.DataBindingUtil
import com.example.hiltdatabindingdemo.di.CustomBindingComponent
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class HiltDataBindingApp : Application() {

    @Inject
    lateinit var bindingComponentProviderFactory: CustomBindingComponent.Factory

    override fun onCreate() {
        super.onCreate()

        DataBindingUtil.setDefaultComponent(bindingComponentProviderFactory.create())
    }
}
