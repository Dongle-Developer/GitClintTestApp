package com.devleop.dongle.gitclinttestapp.module

import com.devleop.dongle.gitclinttestapp.utile.SchedulerProvider
import org.koin.core.module.Module
import org.koin.dsl.module

val appModule : Module  = module {

    //app
    single { AppSchedulerProvider() as SchedulerProvider }


}