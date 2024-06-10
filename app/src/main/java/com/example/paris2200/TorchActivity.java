package com.example.paris2200;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.Arrays;
import java.util.List;

public class TorchActivity extends AppCompatActivity implements OnMapReadyCallback {

    private MapView mapView;
    private GoogleMap googleMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_torch);

        mapView = findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.onResume();
        mapView.getMapAsync(this);

        MapsInitializer.initialize(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap map) {
        googleMap = map;

        // Пример точек маршрута (координаты можно заменить на реальные)
        List<LatLng> relayPath = Arrays.asList(
                new LatLng(37.9838, 23.7275), // Афины, Греция
                new LatLng(41.9028, 12.4964), // Рим, Италия
                new LatLng(48.8566, 2.3522)   // Париж, Франция
        );

        // Добавление линий на карту
        PolylineOptions polylineOptions = new PolylineOptions()
                .addAll(relayPath)
                .color(0xFFFF0000) // Красный цвет
                .width(5); // Ширина линии
        googleMap.addPolyline(polylineOptions);

        // Перемещение камеры на первый пункт маршрута
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(relayPath.get(0), 5f));
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
}
