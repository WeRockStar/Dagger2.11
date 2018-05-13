package com.werockstar.dagger211.di.module

import android.app.Application
import com.werockstar.dagger211.App
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class ApplicationModule {

    @Binds
    @Singleton
    abstract fun provideApplication(app: App): Application

}