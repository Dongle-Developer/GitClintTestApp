package com.devleop.dongle.gitclinttestapp

import android.app.Application
import com.devleop.dongle.gitclinttestapp.module.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            listOf(
                this,
                appModule
            )
        }
    }

}
