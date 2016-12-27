package com.example.administrator.newsdemo.model.http;

import android.util.Log;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

/**
 * Created by Administrator on 2016/12/27.
 */

public class RetrofitHelp {
    Retrofit retrofit;
    TestApi service = retrofit.create(TestApi.class);
    Call<ResponseBody> repos = service.listRepos("octocat");

}
