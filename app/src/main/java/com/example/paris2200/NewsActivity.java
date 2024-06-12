package com.example.paris2200;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class NewsActivity extends AppCompatActivity {

    private static final String TAG = "NewsActivity";
    private RecyclerView recyclerViewNews;
    private NewsAdapter newsAdapter;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        recyclerViewNews = findViewById(R.id.recyclerViewNews);
        recyclerViewNews.setLayoutManager(new LinearLayoutManager(this));
        progressBar = findViewById(R.id.progressBar);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://newsapi.org/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NewsApiService newsApiService = retrofit.create(NewsApiService.class);

        showLoading();

        newsApiService.getOlympicNews("Olympics 2024 Paris", "a38ea7064979478885a22bdac69ff2de", "en").enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                hideLoading();
                if (response.isSuccessful() && response.body() != null) {
                    List<NewsItem> newsItems = response.body().getArticles();
                    if (newsItems != null && !newsItems.isEmpty()) {
                        for (NewsItem item : newsItems) {
                            Log.d(TAG, "News title: " + item.getTitle());
                            Log.d(TAG, "News description: " + item.getDescription());
                            Log.d(TAG, "News image URL: " + item.getUrlToImage());
                            Log.d(TAG, "News URL: " + item.getUrl());
                        }
                        newsAdapter = new NewsAdapter(newsItems, NewsActivity.this); // Передаем контекст здесь
                        recyclerViewNews.setAdapter(newsAdapter);
                        recyclerViewNews.setVisibility(View.VISIBLE);
                        Log.d(TAG, "Adapter is set with news items");
                    } else {
                        Log.e(TAG, "No news items found");
                        Toast.makeText(NewsActivity.this, "No news items found", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Log.e(TAG, "Response was not successful: " + response.message());
                    Log.e(TAG, "Response code: " + response.code());
                    try {
                        String errorBody = response.errorBody().string();
                        Log.e(TAG, "Response error body: " + errorBody);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    Toast.makeText(NewsActivity.this, "Failed to load news", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                hideLoading();
                Log.e(TAG, "Error fetching news: ", t);
                Toast.makeText(NewsActivity.this, "Error: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showLoading() {
        progressBar.setVisibility(View.VISIBLE);
        recyclerViewNews.setVisibility(View.GONE);
    }

    private void hideLoading() {
        progressBar.setVisibility(View.GONE);
        recyclerViewNews.setVisibility(View.VISIBLE);
    }
}
