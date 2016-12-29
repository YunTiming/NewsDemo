package com.example.administrator.newsdemo.presenter.contract;

import com.example.administrator.newsdemo.base.BasePresenter;
import com.example.administrator.newsdemo.base.BaseView;

/**
 * Created by Administrator on 2016/12/28.
 */

public interface MainContract {

    interface View extends BaseView {
        void showText(String string);
    }

    interface Presenter extends BasePresenter<View> {

    }
}
