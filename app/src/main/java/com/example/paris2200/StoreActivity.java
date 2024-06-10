package com.example.paris2200;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class StoreActivity extends AppCompatActivity {
    private RecyclerView recyclerViewStore;
    private StoreAdapter storeAdapter;
    private List<StoreItem> storeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        recyclerViewStore = findViewById(R.id.recyclerViewStore);
        recyclerViewStore.setLayoutManager(new LinearLayoutManager(this));

        storeList = new ArrayList<>();
        // Добавление реальных данных о магазинах
        storeList.add(new StoreItem("Олимпийский магазин в центре Парижа", "La Cure Gourmande", R.drawable.store_paris_center));
        storeList.add(new StoreItem("Олимпийский магазин у Эйфелевой башни", "5 Av. Anatole France", R.drawable.store_eiffel_tower));
        storeList.add(new StoreItem("Олимпийский магазин на Елисейских Полях", "31-33 Av. des Champs-Élysées", R.drawable.store_champs_elysees));
        // Добавьте больше магазинов по мере необходимости

        storeAdapter = new StoreAdapter(storeList, this);
        recyclerViewStore.setAdapter(storeAdapter);
    }
}
