package com.example.administrator.newsdemo.model.http;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2016/12/27.
 */

public interface TestApi {
    @GET("users/{user}/repos")
    Call<ResponseBody> listRepos(@Path("user") String user);
}
