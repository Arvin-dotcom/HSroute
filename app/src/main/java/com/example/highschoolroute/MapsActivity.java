package com.example.highschoolroute;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng Casanestebanan = new LatLng(-16.041271, 120.527683);
        mMap.addMarker(new MarkerOptions().position(Casanestebanan).title("Marker in Casanestebanan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Casanestebanan));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(-16.041271,120.527683),
                        new LatLng(-16.046774, 120.545792))
                .width(10)
                .color(Color.BLUE));



    } 
}