package com.classwork.randomqotes.interfaces;

import com.classwork.randomqotes.response.ApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("random")
    Call<ApiResponse> getQuotes();


}
