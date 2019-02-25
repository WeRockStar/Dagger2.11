package com.werockstar.dagger211

import android.app.Activity
import android.app.Application
import com.werockstar.dagger211.di.component.AppComponent
import com.werockstar.dagger211.di.component.DaggerAppComponent
import com.werockstar.dagger211.di.module.HttpModule
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

open class App : Application(), HasActivityInjector {

    open fun getBaseUrl() = "https://api.github.com/"

    @Inject lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = activityInjector

    override fun onCreate() {
        super.onCreate()

        val component: AppComponent = DaggerAppComponent.builder()
                .application(this)
                .httpModule(HttpModule(getBaseUrl()))
                .build()
        component.inject(this)
    }
}