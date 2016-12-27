package com.example.administrator.newsdemo.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by Administrator on 2016/12/27.
 */

public abstract class BaseActivity<T extends BasePresenter> extends SupportActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
    }

    protected abstract int getLayout();
}
