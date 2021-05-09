package com.example.tugasgis21;

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

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng agung = new LatLng(-0.8939158369909967, 119.85243746784523);
        mMap.addMarker(new MarkerOptions().position(agung).title("MASJID AGUNG DARUSALLAM PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(agung));

        LatLng amanah = new LatLng(-0.890028423930133, 119.88187410037291);
        mMap.addMarker(new MarkerOptions().position(amanah).title("MASJID AL-AMANAH PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(amanah));

        LatLng baiturahim = new LatLng(-0.9012009093576249, 119.87478116454089);
        mMap.addMarker(new MarkerOptions().position(baiturahim).title("MASJID RAYA BAITURRAHIM PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(baiturahim,13));

        LatLng bayan = new LatLng(-0.9021605347866943, 119.89022154313786);
        mMap.addMarker(new MarkerOptions().position(bayan).title("MASJID AL-BAYAN PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(bayan));

        LatLng annur = new LatLng(-0.9253992780293132, 119.86112415435093);
        mMap.addMarker(new MarkerOptions().position(annur).title("MASJID AN-NUR PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(annur));

        LatLng mujahidin = new LatLng(-0.8785077618490981, 119.83721873978931);
        mMap.addMarker(new MarkerOptions().position(mujahidin).title("MASJID AL-MUJAHIDIN PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mujahidin));

        LatLng ghaizan = new LatLng(-0.8563206626217638, 119.88187853844605);
        mMap.addMarker(new MarkerOptions().position(ghaizan).title("MASJID GHAIZAN AL-GHAZALI PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(ghaizan));

        LatLng home = new LatLng(-0.9289708632494389, 119.86161055742933);
        mMap.addMarker(new MarkerOptions().position(home).title("RUMAH ISMAIL F55118073"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(home));

        //PolyLine ke Alfamidi R.E Martadinata 2
        mMap.addPolyline(new PolylineOptions().add(
                home,
                new LatLng(-0.9289708632494389, 119.86161055742933),
                new LatLng(-0.9268090608073928, 119.8614737662745),
                new LatLng(-0.9255551889361942, 119.86128430765459),
                new LatLng(-0.9253992780293132, 119.86112415435093),
                annur
                ).width(10)
                        .color(Color.BLUE)
        );











    }
}