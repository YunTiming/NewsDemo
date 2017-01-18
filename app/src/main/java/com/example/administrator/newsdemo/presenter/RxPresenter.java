package com.example.administrator.newsdemo.presenter;

import com.example.administrator.newsdemo.base.BasePresenter;
import com.example.administrator.newsdemo.base.BaseView;

/**
 * Created by Administrator on 2017/1/18.
 * 基于Rx的Presenter封装,控制订阅的生命周期
 */

public class RxPresenter<T extends BaseView> implements BasePresenter<T> {
    T mView;


    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
    }
}
