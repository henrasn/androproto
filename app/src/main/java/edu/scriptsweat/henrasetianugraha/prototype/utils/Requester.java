package edu.scriptsweat.henrasetianugraha.prototype.utils;

import android.annotation.TargetApi;
import android.os.Build;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 * Created by Henra Setia Nugraha on 8/7/2016.
 */

public class Requester {
    OkHttpClient client;
    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public String run(String url) throws IOException {
        client = new OkHttpClient();
        Request getRequest = new Request.Builder().url(url).build();

        try (Response response = client.newCall(getRequest).execute()) {
            return response.body().string();
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public String post(String url, String request) throws IOException {
        client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        RequestBody requestBody = body(request);

        Request postRequest = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();

        try (Response response = client.newCall(postRequest).execute()) {
            return response.body().string();
        }
    }

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public String graphql(String url) throws IOException{
        client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .build();

        Request postRequest = new Request.Builder()
                .url(url)
                .post(new FormBody.Builder().add("a","a").build())
                .build();

        try (Response response = client.newCall(postRequest).execute()) {
            return response.body().string();
        }
    }

    protected RequestBody body(String data) throws IOException {
        RequestBody requestBody;

        if (data.equals("rating")) {
            requestBody = new FormBody.Builder()
                    .add("comment", "comment ")
                    .add("user", "user ")
                    .add("rate", "10")
                    .build();
            return requestBody;
        }

        if (data.equals("keranjang")) {
            requestBody = new FormBody.Builder()
                    .add("idProduk", "12345")
                    .add("jumlah", "9")
                    .build();
            return requestBody;
        }

        if (data.equals("wishlist")) {
            requestBody = new FormBody.Builder()
                    .add("idProduk", "09876")
                    .build();
            return requestBody;
        }

        return null;
    }
}
