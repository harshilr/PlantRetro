package com.example.plantretro;

import android.content.Context;
import android.widget.PopupWindow;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitClient {

    private static Retrofit retrofit;
    private static String Base_Url ="";
    //private static Context context = null;

//    public RetroFitClient(Context applicationContext) {
//
//        Base_Url = context.getResources().getString(R.string.Base_Url);
//    }

    public static Retrofit getRetrofit(Context context){

        Base_Url = context.getResources().getString(R.string.Base_Url);

        if (retrofit==null){
            retrofit =new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;

    }
}
