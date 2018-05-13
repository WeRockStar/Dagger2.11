package com.werockstar.dagger211.di.module

import com.werockstar.dagger211.di.module.submodule.MainActivityModule
import com.werockstar.dagger211.di.scope.PerActivity
import com.werockstar.dagger211.view.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityContributorModule {

    /**
     * Binds with dagger.android
     */
    @PerActivity
    @ContributesAndroidInjector(modules = [MainActivityModule::class, FragmentContributorModule::class])
    abstract fun contributeMainActivity(): MainActivity
}