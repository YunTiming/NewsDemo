package com.example.administrator.newsdemo.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.example.administrator.newsdemo.app.App;
import com.example.administrator.newsdemo.presenter.RxPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by Administrator on 2016/12/27.
 */

public abstract class BaseActivity<T extends RxPresenter> extends SupportActivity implements BaseView {
//    @Inject
    protected T mPresenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
//        initInject();
        mPresenter = getPresenter();
        mPresenter.attachView(this);
//        App.getInstance().addActivity(this);
    }

    protected abstract int getLayout();

    protected abstract T getPresenter();

//    protected abstract void initInject();
}
