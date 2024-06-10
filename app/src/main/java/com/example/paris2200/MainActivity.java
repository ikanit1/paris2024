package com.example.paris2200;

import android.content.Intent;
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

        // Initialize DrawerLayout
        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.navigation_view);

        // Setup ActionBarDrawerToggle
        toggle = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Display menu button in ActionBar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set listener for menu items
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Handle menu item clicks
                int itemId = item.getItemId();

                if (itemId == R.id.nav_news) {
                    startActivity(new Intent(MainActivity.this, NewsActivity.class));
                } else if (itemId == R.id.nav_schedule) {
                    startActivity(new Intent(MainActivity.this, ScheduleActivity.class));
                } else if (itemId == R.id.nav_store) {
                    startActivity(new Intent(MainActivity.this, StoreActivity.class));
                } else if (itemId == R.id.nav_tickets) {
                    startActivity(new Intent(MainActivity.this, TicketsActivity.class));
                } else if (itemId == R.id.nav_venues) {
                    startActivity(new Intent(MainActivity.this, VenuesActivity.class));
                } else if (itemId == R.id.nav_qualifiers) {
                    startActivity(new Intent(MainActivity.this, QualifiersActivity.class));
                } else if (itemId == R.id.nav_torch) {
                    startActivity(new Intent(MainActivity.this, TorchActivity.class));
                } else if (itemId == R.id.nav_celebration) {
                    startActivity(new Intent(MainActivity.this, CelebrationActivity.class));
                }

                // Close the drawer after item selection
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Handle menu item clicks
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
