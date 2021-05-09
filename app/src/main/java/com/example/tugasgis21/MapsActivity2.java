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

public class MapsActivity2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps2);
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
        LatLng GKST = new LatLng(-0.930947460610178, 119.88641302523426);
        mMap.addMarker(new MarkerOptions().position(GKST).title("GEREJA GKST EFFATHA PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(GKST));

        LatLng agung = new LatLng(-0.919035220475829, 119.8779363193531);
        mMap.addMarker(new MarkerOptions().position(agung).title("GEREJA GPID MANUNGGAL PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(agung,13));

        LatLng MARANATHA = new LatLng(-0.9313118720581832, 119.86311057287858);
        mMap.addMarker(new MarkerOptions().position(MARANATHA).title("GEREJA GPDI MARANATH APALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MARANATHA));

        LatLng IMANUEL = new LatLng(-0.8991250720818605, 119.87509434734599);
        mMap.addMarker(new MarkerOptions().position(IMANUEL).title("GEREJA GKST IMMANUEL PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(IMANUEL));

        LatLng KIBAID = new LatLng(-0.9088372257864076, 119.88560261038474);
        mMap.addMarker(new MarkerOptions().position(KIBAID).title("GEREJA KIBAID JEMAAT PALU"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KIBAID));

        LatLng home = new LatLng(-0.9289708632494389, 119.86161055742933);
        mMap.addMarker(new MarkerOptions().position(home).title("RUMAH ISMAIL F55118073"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(home));

        //PolyLine ke Alfamidi R.E Martadinata 2
        mMap.addPolyline(new PolylineOptions().add(
                home,
                new LatLng(-0.9289708632494389, 119.86161055742933),
                new LatLng(-0.9303249494122404, 119.86170509546984),
                new LatLng(-0.9303249494122404, 119.86238101208626),
                new LatLng(-0.9302176751949649, 119.86281016549351),
                new LatLng(-0.931676604270446, 119.86297646243885),
                new LatLng(-0.9315693300942886, 119.86318031030729),
                new LatLng(-0.9313118720581832, 119.86311057287858),
                MARANATHA
        ).width(10)
                .color(Color.BLUE)
        );


    }
}