package com.werockstar.dagger212.di.module

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.werockstar.dagger212.di.scope.PerActivity
import dagger.Binds
import dagger.Module

@Module
abstract class ActivityModule {

    @Binds
    @PerActivity
    abstract fun provideActivityContext(activity: AppCompatActivity): Context
}