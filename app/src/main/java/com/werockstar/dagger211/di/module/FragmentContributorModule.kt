package com.werockstar.dagger211.di.module

import com.werockstar.dagger211.di.scope.PerFragment
import com.werockstar.dagger211.view.fragment.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentContributorModule {

    /**
     * Binds with dagger.android
     */
    @PerFragment
    @ContributesAndroidInjector
    abstract fun contributeMainFragment(): MainFragment
}