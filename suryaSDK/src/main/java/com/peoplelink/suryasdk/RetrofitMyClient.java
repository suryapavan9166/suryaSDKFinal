package com.peoplelink.suryasdk;

import com.peoplelink.suryasdk.myinterface.MyApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitMyClient {


    private static RetrofitMyClient instance = null;
    private MyApi myApi;

    private RetrofitMyClient() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(MyApi.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        myApi = retrofit.create(MyApi.class);
    }

    public static synchronized RetrofitMyClient getInstance() {
        if (instance == null) {
            instance = new RetrofitMyClient();
        }
        return instance;
    }

    public MyApi getMyApi() {
        return myApi;
    }
}
