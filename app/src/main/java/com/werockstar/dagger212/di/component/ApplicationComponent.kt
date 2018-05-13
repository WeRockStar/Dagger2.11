package com.werockstar.dagger212.di.component

import com.werockstar.dagger212.App
import com.werockstar.dagger212.di.module.ApplicationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {
    fun inject(app: App)
}