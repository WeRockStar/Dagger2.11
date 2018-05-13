package com.werockstar.dagger211.di.module.submodule

import android.support.v7.app.AppCompatActivity
import com.werockstar.dagger211.di.module.ActivityModule
import com.werockstar.dagger211.di.scope.PerActivity
import com.werockstar.dagger211.view.activity.MainActivity
import dagger.Binds
import dagger.Module

@Module(includes = [ActivityModule::class])
abstract class MainActivityModule {

    @Binds
    @PerActivity
    abstract fun mainActivityInjector(activity: MainActivity): AppCompatActivity
}