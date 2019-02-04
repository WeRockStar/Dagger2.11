package com.werockstar.dagger211.view.activity

import android.os.Bundle
import com.werockstar.dagger212.R
import com.werockstar.dagger211.view.BaseActivity
import com.werockstar.dagger211.view.fragment.MainFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, MainFragment())
                .commit()
    }
}
