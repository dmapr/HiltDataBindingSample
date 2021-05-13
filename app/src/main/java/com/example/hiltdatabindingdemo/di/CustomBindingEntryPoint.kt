package com.example.hiltdatabindingdemo.di

import androidx.databinding.DataBindingComponent
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn

@EntryPoint
@BindingScoped
@InstallIn(CustomBindingComponent::class)
interface CustomBindingEntryPoint: DataBindingComponent
