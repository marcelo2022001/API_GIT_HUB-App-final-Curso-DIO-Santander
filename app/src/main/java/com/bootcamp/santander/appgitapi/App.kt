package com.bootcamp.santander.appgitapi

import android.app.Application
import com.bootcamp.santander.appgitapi.data.di.DataModule
import com.bootcamp.santander.appgitapi.domain.di.DomainModule
import com.bootcamp.santander.appgitapi.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}