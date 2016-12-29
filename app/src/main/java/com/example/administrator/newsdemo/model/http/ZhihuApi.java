package com.example.administrator.newsdemo.model.http;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Administrator on 2016/12/29.
 */

public interface ZhihuApi {
    String HOST = "http://news-at.zhihu.com/api/4/";

    /**
     * 最新日报
     */
    @GET("news/latest")
    Call<String> getDailyList();
}
