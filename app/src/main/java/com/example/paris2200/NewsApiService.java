package com.example.paris2200;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface NewsApiService {
    @GET("v2/everything")
    Call<NewsResponse> getOlympicNews(
            @Query("q") String query,
            @Query("apiKey") String apiKey,
            @Query("language") String language
    );
}
