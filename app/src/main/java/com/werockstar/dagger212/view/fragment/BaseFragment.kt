package com.werockstar.dagger212.view.fragment

import android.content.Context
import android.support.v4.app.Fragment
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector

abstract class BaseFragment : Fragment(), HasSupportFragmentInjector {

    override fun onAttach(context: Context?) {
        super.onAttach(context)

        AndroidSupportInjection.inject(this)
    }
}