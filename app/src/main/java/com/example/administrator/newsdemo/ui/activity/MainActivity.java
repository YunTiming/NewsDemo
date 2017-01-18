package com.example.administrator.newsdemo.ui.activity;


import android.widget.TextView;

import com.example.administrator.newsdemo.R;
import com.example.administrator.newsdemo.base.BaseActivity;
import com.example.administrator.newsdemo.base.BasePresenter;
import com.example.administrator.newsdemo.inject.module.MainActivityModule;
import com.example.administrator.newsdemo.presenter.MainPresenter;
import com.example.administrator.newsdemo.presenter.contract.MainContract;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainPresenter> implements MainContract.View{
    @BindView(R.id.textview)
    TextView textView;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter getPresenter() {
        MainPresenter mainPresenter=new MainPresenter();
//        mainPresenter.attachView(this);
        return mainPresenter;
    }

//    @Override
//    protected void initInject() {
//        DaggerActivityComponent.builder().mainActivityModule(new MainActivityModule(this)).build().inject(this);
//    }


    @Override
    public void showError(String msg) {

    }

    @Override
    public void useNightMode(boolean isNight) {

    }

    @Override
    public void showText(String string) {
        textView.setText(string);
    }
}
