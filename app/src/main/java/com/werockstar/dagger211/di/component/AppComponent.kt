package com.werockstar.dagger211.di.component

import android.app.Application
import com.werockstar.dagger211.App
import com.werockstar.dagger211.di.module.ActivityContributorModule
import com.werockstar.dagger211.di.module.ApplicationModule
import com.werockstar.dagger211.di.module.HttpModule
import com.werockstar.dagger211.di.module.RxThreadModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class,
    AndroidSupportInjectionModule::class,
    ActivityContributorModule::class,
    HttpModule::class,
    RxThreadModule::class
])
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun httpModule(httpModule: HttpModule): Builder

        fun build(): AppComponent
    }
}