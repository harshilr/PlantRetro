package com.example.plantretro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataService {

    @GET("plants")
    Call<List<Plant>> getAllPlants(@Query("token")String token);
}
