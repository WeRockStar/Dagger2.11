package com.werockstar.dagger212.di.module

import com.werockstar.dagger212.di.module.submodule.MainActivityModule
import com.werockstar.dagger212.di.scope.PerActivity
import com.werockstar.dagger212.view.activity.MainActivity
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