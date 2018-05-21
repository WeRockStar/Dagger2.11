package com.werockstar.dagger211

import android.app.Activity
import android.app.Application
import com.werockstar.dagger211.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.builder().create(this).inject(this)
    }

    companion object {
        var BASE_URL = ""
    }
}