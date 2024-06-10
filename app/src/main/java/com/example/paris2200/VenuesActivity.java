package com.example.paris2200;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class VenuesActivity extends AppCompatActivity {
    private RecyclerView recyclerViewVenues;
    private VenueAdapter venueAdapter;
    private List<VenueItem> venueList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venues);

        recyclerViewVenues = findViewById(R.id.recyclerViewVenues);
        recyclerViewVenues.setLayoutManager(new LinearLayoutManager(this));

        venueList = new ArrayList<>();
        // Добавление данных о местах проведения
        venueList.add(new VenueItem("Футбол", "Стадион Парижа", "2024-07-24", "15:00 - 17:00", R.drawable.football_image));
        venueList.add(new VenueItem("Регби", "Стадион Ла Дефанс", "2024-07-24", "09:00 - 12:00", R.drawable.rugby_image));
        venueList.add(new VenueItem("Гандбол", "Стадион Берси", "2024-07-25", "10:00 - 12:00", R.drawable.gandbol_image));
        venueList.add(new VenueItem("Церемония открытия", "Стадион Сен-Дени", "2024-07-26", "20:00 - 22:00", R.drawable.opening_image));
        // Добавьте больше мероприятий по мере необходимости

        venueAdapter = new VenueAdapter(venueList);
        recyclerViewVenues.setAdapter(venueAdapter);
    }

}
