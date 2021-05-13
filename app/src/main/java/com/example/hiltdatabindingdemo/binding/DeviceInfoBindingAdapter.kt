package com.example.hiltdatabindingdemo.binding

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.hiltdatabindingdemo.di.DeviceInfo
import javax.inject.Inject

class DeviceInfoBindingAdapter @Inject constructor(@DeviceInfo private val deviceInfo: String) {

    @BindingAdapter("deviceInfo")
    fun TextView.deviceInfo(stringFormat: String) {
        text = String.format(stringFormat, deviceInfo)
    }
}