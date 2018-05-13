package com.werockstar.dagger212.di.module

import com.werockstar.dagger212.di.scope.PerFragment
import com.werockstar.dagger212.view.fragment.MainFragment
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