package com.werockstar.dagger211.di.component

import com.werockstar.dagger211.App
import com.werockstar.dagger211.di.module.ActivityContributorModule
import com.werockstar.dagger211.di.module.ApplicationModule
import com.werockstar.dagger211.di.module.HttpModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    ApplicationModule::class, AndroidSupportInjectionModule::class,
    ActivityContributorModule::class, HttpModule::class
])
interface ApplicationComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}
