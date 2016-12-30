package com.example.administrator.newsdemo.inject.component;

import com.example.administrator.newsdemo.inject.module.MainActivityModule;
import com.example.administrator.newsdemo.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by Administrator on 2016/12/30.
 */
@Component(modules = MainActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
}
