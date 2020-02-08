package com.example.plantretro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ConnectivityManager connectivityManager;
    boolean isConnected;
    ArrayList<Plant> arrayList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       // RetroFitClient retroFitClient = new RetroFitClient();
        DataService dataService = RetroFitClient.getRetrofit(getApplicationContext()).create(DataService.class);


        connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();

        isConnected = activeNetwork != null && activeNetwork.isConnectedOrConnecting();

        if (!isConnected){
            Toast.makeText(getApplicationContext(),"Check Internet Connection!",Toast.LENGTH_LONG).show();
        }
        else{

            Call<List<Plant>> call = dataService.getAllPlants(getResources().getString(R.string.token));

            call.enqueue(new Callback<List<Plant>>() {
                @Override
                public void onResponse(Call<List<Plant>> call, Response<List<Plant>> response) {

                    arrayList = new ArrayList<>(response.body());
                    Log.i("Plants :",arrayList.get(0).getCommonName());
                }

                @Override
                public void onFailure(Call<List<Plant>> call, Throwable t) {

                }
            });
        }
    }
}
