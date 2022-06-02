package com.peoplelink.suryasdk.myinterface;

import com.peoplelink.suryasdk.model.Results;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyApi {
    String BASE_URL = "https://api.publicapis.org/";
    @GET("entries")
    Call<Results> getMyData();
}
