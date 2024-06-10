package com.example.paris2200;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity {

    private RecyclerView newsRecyclerView;
    private NewsAdapter newsAdapter;
    private List<NewsItem> newsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        newsRecyclerView = findViewById(R.id.news_recycler_view);
        newsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Пример новостей
        newsList = new ArrayList<>();
        newsList.add(new NewsItem(
                "Олимпиада 2024: Основные моменты открытия",
                "Церемония открытия Олимпиады в Париже 2024 была зрелищным шоу культуры и спорта.",
                "https://images.france.fr/zeaejvyq9bhj/YXXPgttUipgno3cnBSI0v/d709d58920fb13e274b418b01a8514ff/optimized-La_Seine_Olympique_-__Paris_2024__Florian_Hulleu.jpg?w=1200&h=630&q=70&fl=progressive&fit=fill",
                "https://olympics.com/ru/paris-2024/the-games/ceremonies/opening-ceremony"
        ));
        newsList.add(new NewsItem(
                "Легкая атлетика: Установлены новые мировые рекорды",
                "На Олимпиаде в Париже 2024 года установлено несколько новых мировых рекордов в легкой атлетике.",
                "https://img.olympics.com/images/image/private/t_s_pog_staticContent_hero_sm_2x/f_auto/primary/atx8gv55pasapmcvoc7e",
                "https://olympics.com/ru/paris-2024/schedule/athletics"
        ));
        newsList.add(new NewsItem(
                "Плавание: Лучшие выступления",
                "На Олимпиаде в Париже 2024 года спортсмены демонстрировали лучшие результаты в плавании.",
                "https://cdn.iz.ru/sites/default/files/styles/1065xh/public/photo_item-2023-02/DI1_9976.JPG.jpg?itok=KMTuR2zE",
                "https://olympics.com/ru/news/chempionat-mira-po-vodnym-vidam-sporta-2024-plavanie-itogi-dnya"
        ));
        newsList.add(new NewsItem(
                "Гимнастика: Выдающиеся выступления",
                "Гимнасты показали выдающиеся выступления, поразив зрителей своими навыками.",
                "https://olympic.kz/images/1716206209.jpg",
                "https://olympic.kz/ru/article/30547-takogo-eshche-nikogda-ne-bylo-na-olimpiade-v-parizhe-kazakhstan-budet-predstavlen-vo-vsekh-trekh-vidakh-gimnastiki"
        ));

        newsAdapter = new NewsAdapter(this, newsList);
        newsRecyclerView.setAdapter(newsAdapter);
    }
}
