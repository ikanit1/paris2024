package com.example.paris2200;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация DrawerLayout
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);

        // Настройка ActionBarDrawerToggle
        toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Отображение кнопки меню в ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Установка слушателя для элементов меню
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Обработка нажатий на элементы меню
                int itemId = item.getItemId();

                if (itemId == R.id.nav_news) {
                    // Логика для "Новости"
                } else if (itemId == R.id.nav_schedule) {
                    // Логика для "Расписание"
                } else if (itemId == R.id.nav_store) {
                    // Логика для "Магазин"
                } else if (itemId == R.id.nav_tickets) {
                    // Логика для "Билеты"
                } else if (itemId == R.id.nav_venues) {
                    // Логика для "Места"
                } else if (itemId == R.id.nav_qualifiers) {
                    // Логика для "Квалификация"
                } else if (itemId == R.id.nav_torch) {
                    // Логика для "Факел"
                } else if (itemId == R.id.nav_celebration) {
                    // Логика для "Празднование"
                }
                // Закрытие Drawer после выбора элемента
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Обработка нажатий на элементы меню
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
