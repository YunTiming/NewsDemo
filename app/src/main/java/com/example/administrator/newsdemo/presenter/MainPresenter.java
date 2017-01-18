package com.example.administrator.newsdemo.presenter;

import com.example.administrator.newsdemo.model.http.ZhihuApi;
import com.example.administrator.newsdemo.presenter.contract.MainContract;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by Administrator on 2016/12/27.
 */

public class MainPresenter extends RxPresenter<MainContract.View> implements MainContract.Presenter {

//    MainContract.View mView;

    public MainPresenter() {
//        OkHttpClient
        Retrofit retrofit = new Retrofit.Builder()  //01:获取Retrofit对象
                .baseUrl(ZhihuApi.HOST) //02采用链式结构绑定Base url
//                //增加返回值为String的支持
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();//03执行操作
        ZhihuApi service = retrofit.create(ZhihuApi.class);//04获取API
        Call<String> call = service.getDailyList();
        call.enqueue(new Callback<String>() {

            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                System.out.println(response.body().toString());
                mView.showText(response.body().toString());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });

    }

}
