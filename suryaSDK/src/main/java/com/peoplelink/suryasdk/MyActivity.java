package com.peoplelink.suryasdk;

import com.peoplelink.suryasdk.model.Results;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyActivity {
    List<Results.Entry> finalList = new ArrayList<>();

    public int Add(int a, int b) {
        return a + b;
    }

    public int Multi(int a, int b) {
        return a * b;
    }

    public List<Results.Entry> getData() {
        Call<Results> call = RetrofitMyClient.getInstance().getMyApi().getMyData();
        call.enqueue(new Callback<Results>() {

            @Override
            public void onResponse(Call<Results> call, Response<Results> response) {
                assert response.body() != null;
                finalList = response.body().entries;
            }

            @Override
            public void onFailure(Call<Results> call, Throwable t) {

            }

        });

        return finalList;

    }
}
