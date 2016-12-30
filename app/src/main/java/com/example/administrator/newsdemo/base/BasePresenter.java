package com.example.administrator.newsdemo.base;

/**
 * Created by Administrator on 2016/12/27.
 * Presenter基类
 */

public interface BasePresenter<T extends BaseView> {
//    void attachView(T view);

    void detachView();
}
