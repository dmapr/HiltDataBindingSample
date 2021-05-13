package com.example.hiltdatabindingdemo.di

import androidx.databinding.DataBindingComponent
import com.example.hiltdatabindingdemo.binding.DeviceInfoBindingAdapter
import com.example.hiltdatabindingdemo.binding.ImageBindingAdapter
import dagger.Subcomponent

@BindingScoped
@Subcomponent
interface CustomBindingComponent : DataBindingComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): CustomBindingComponent
    }

    override fun getImageBindingAdapter(): ImageBindingAdapter
    override fun getDeviceInfoBindingAdapter(): DeviceInfoBindingAdapter
}
