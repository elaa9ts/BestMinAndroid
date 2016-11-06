package com.hari.bestmin.mvvm.viewmodel;

import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ELAA on 06-11-2016.
 */

public class ViewModel {

    private ResponseListener responseListener;

    public ViewModel() {
    }

    public ViewModel(ResponseListener listener) {
        this();
        responseListener = listener;
    }

    public interface ResponseListener <T> {
        void onResponse(T response);

        void onError();
    }

    protected <T> void downloadData(Call<T> call){
        call.enqueue(new Callback<T>() {
            @Override
            public void onResponse(Call<T> call, Response<T> response) {
                if(response.isSuccessful()){
                    Log.e("Success", "onResponse: "+response );
                    responseListener.onResponse(response);
                }else {
                    Log.e("Error", "isSuccessFullError: " );
                    responseListener.onError();
                }
            }

            @Override
            public void onFailure(Call<T> call, Throwable t) {
                Log.e("Error", "onFailure: "+t.getMessage() );
                responseListener.onError();
            }
        });
    }

}
