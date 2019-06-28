package com.devleop.dongle.gitclinttestapp.module

import com.devleop.dongle.gitclinttestapp.utile.SchedulerProvider
import rx.Scheduler
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

class AppSchedulerProvider : SchedulerProvider {
    override fun ui(): Scheduler = AndroidSchedulers.mainThread()
    override fun io(): Scheduler = Schedulers.io()
}