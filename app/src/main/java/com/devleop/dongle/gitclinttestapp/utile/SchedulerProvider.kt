package com.devleop.dongle.gitclinttestapp.utile

import rx.Scheduler

interface SchedulerProvider {
    fun io() : Scheduler
    fun ui() : Scheduler
}