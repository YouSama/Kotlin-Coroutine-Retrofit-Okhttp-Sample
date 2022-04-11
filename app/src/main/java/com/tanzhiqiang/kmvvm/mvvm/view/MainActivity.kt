package com.tanzhiqiang.kmvvm.mvvm.view

import android.util.Log
import android.view.View
import androidx.appcompat.widget.Toolbar
import com.tanzhiqiang.kmvvm.R
import com.tanzhiqiang.kmvvm.databinding.ActivityMainBinding
import com.tanzhiqiang.kmvvm.mvvm.view.base.BaseActivity
import com.tanzhiqiang.kmvvm.mvvm.viewmodel.WeatherViewModel

class MainActivity : BaseActivity<WeatherViewModel, ActivityMainBinding>() {
    override fun layoutId(): Int = R.layout.activity_main
    override fun providerVMClass(): Class<WeatherViewModel> = WeatherViewModel::class.java
    override fun providerToolBar(): Toolbar = binding.toolbar
    override fun initView() {
        with(binding) {
            with(fab) {
                setOnClickListener {
                    with(content) {
                        mViewModel?.getWeather(
                            {
                                progressBar.visibility = View.VISIBLE
                            },
                            {
                                tvHello.visibility = View.VISIBLE
                                progressBar.visibility = View.GONE
                            })
                    }
                }
            }
        }
    }

    override fun startObserve() {
        mViewModel?.apply {
            mWeather.observe(this@MainActivity) {
                binding.content.tvHello.text = "${it.data}"
            }
        }
    }

    override fun onDestroy() {
        Log.i("tt", "MainActivity onDestroy")
        super.onDestroy()
    }
}
