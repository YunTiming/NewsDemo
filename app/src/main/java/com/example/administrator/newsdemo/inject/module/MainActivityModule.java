package com.example.administrator.newsdemo.inject.module;

import android.app.Activity;

import com.example.administrator.newsdemo.base.BasePresenter;
import com.example.administrator.newsdemo.presenter.MainPresenter;
import com.example.administrator.newsdemo.ui.activity.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2016/12/30.
 */
@Module
public class MainActivityModule {
    private MainActivity activity;

    public MainActivityModule(MainActivity activity) {
        this.activity = activity;
    }

    @Provides
    MainPresenter getBasePresenter() {
        return new MainPresenter();
    }
}
