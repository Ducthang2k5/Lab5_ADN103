package com.example.and103_lab5.services;

import com.example.and103_lab5.models.Distributor;
import com.example.and103_lab5.models.Response;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    String BASE_URL = "http://192.168.1.104:3000/";

    @GET("distributors/list")
    Call<Response<ArrayList<Distributor>>> getListDistributor();

    @POST("distributors/add")
    Call<Response<Distributor>> addDistributor(@Body Distributor distributor);

    @PATCH("distributors/edit/{id}")
    Call<Response<Distributor>> updateDistributor(@Path("id") String id, @Body Distributor distributor);

    @DELETE("distributors/delete/{id}")
    Call<Response<Distributor>> deleteDistributor(@Path("id") String id);

    @GET("distributors/search")
    Call<Response<ArrayList<Distributor>>> searchDistributor(@Query("key") String key);
}
