package com.example.muyabbaj.myproject;

import android.os.Bundle;

import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class GoogleMaps_Activity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_maps_);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng neub = new LatLng(24.890164, 91.860966);
        mMap.addMarker(new MarkerOptions().position(neub).title("North East University Bangladesh"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(neub,9.2f));

        LatLng shj = new LatLng(24.902460, 91.865965);
        mMap.addMarker(new MarkerOptions().position(shj).title("Hazrat Shah Jalal Mazar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(shj,9.2f));

        LatLng shp = new LatLng(24.906845, 91.934783);
        mMap.addMarker(new MarkerOptions().position(shp).title("Hazrat Shah Paran Mazar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(shp,9.2f));

        LatLng jfl = new LatLng(25.163865, 92.017567);
        mMap.addMarker(new MarkerOptions().position(jfl).title("জাফলং"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(jfl,9.2f));

        LatLng  lalkhal= new LatLng(25.109422, 92.179735);
        mMap.addMarker(new MarkerOptions().position(lalkhal).title("লালখাল"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lalkhal,9.2f));

        LatLng  সাতছড়ি= new LatLng(24.125909, 91.446048);
        mMap.addMarker(new MarkerOptions().position(সাতছড়ি).title("সাতছড়ি জাতীয় উদ্যান"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(সাতছড়ি,9.2f));

        LatLng   rema=new LatLng(24.117581, 91.632361);
        mMap.addMarker(new MarkerOptions().position(rema).title("েমা-ক্যালেঙ্গা বন্যপ্রানী অভয়ারণ্য"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(rema,9.2f));

        LatLng   malnichora=new LatLng(24.937210, 91.869349);
        mMap.addMarker(new MarkerOptions().position(malnichora).title("মালনি ছড়া চা বাগান"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(malnichora,9.2f));

        LatLng   মাধবকুন্ড=new LatLng(24.640584, 92.228191);
        mMap.addMarker(new MarkerOptions().position(মাধবকুন্ড).title(" মাধবকুন্ড জলপ্রপাত"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(মাধবকুন্ড,9.2f));

        LatLng   হাম =new LatLng(24.167366, 91.911599);
        mMap.addMarker(new MarkerOptions().position(হাম).title(" হাম হাম জলপ্রপাত"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(হাম,9.2f));


        LatLng   হাকালুকি =new LatLng(24.681784, 92.048067);
        mMap.addMarker(new MarkerOptions().position(হাকালুকি).title(" হাকালুকি হাওড়"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(হাকালুকি,9.2f));

        LatLng   টাঙ্গুয়ার =new LatLng(25.126706, 91.097543);
        mMap.addMarker(new MarkerOptions().position(টাঙ্গুয়ার).title(" টাঙ্গুয়ার হাওর"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(টাঙ্গুয়ার,9.2f));

        LatLng   হাসন =new LatLng(25.072113, 91.392394);
        mMap.addMarker(new MarkerOptions().position(হাসন).title(" হাসন রাজার বাড়ি"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(হাসন,9.2f));

        LatLng   বাঁশতলা =new LatLng(25.172840, 91.609167);
        mMap.addMarker(new MarkerOptions().position(বাঁশতলা).title("বাঁশতলা শহীদ স্মৃতিসৌধ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(বাঁশতলা,9.2f));


        LatLng   হাইল =new LatLng(24.404374, 91.676326);
        mMap.addMarker(new MarkerOptions().position(হাইল).title("হাইল হাওর - শ্রীমঙ্গল"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(হাইল,9.2f));

        LatLng   শ্রীমঙ্গল =new LatLng(24.377418, 91.637638);
        mMap.addMarker(new MarkerOptions().position(শ্রীমঙ্গল).title("শ্রীমঙ্গল চা বাগান"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(শ্রীমঙ্গল,9.2f));


        LatLng   খোজার =new LatLng(24.461304, 91.744469);
        mMap.addMarker(new MarkerOptions().position(খোজার).title("খোজার মসজিদ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(খোজার,9.2f));

        LatLng   লোভাছড়া =new LatLng(25.071499, 92.337279);
        mMap.addMarker(new MarkerOptions().position(লোভাছড়া).title("লোভাছড়া"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(লোভাছড়া,9.2f));

        LatLng   পার্ক =new LatLng(24.893033, 91.875389);
        mMap.addMarker(new MarkerOptions().position(পার্ক).title("ওসমানী শিশু পার্ক"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(পার্ক,9.2f));

        LatLng   চুনাপাথর =new LatLng(25.193614, 91.170860);
        mMap.addMarker(new MarkerOptions().position(চুনাপাথর).title("টেকেরঘাট চুনাপাথর খনি প্রকল্প"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(চুনাপাথর,9.2f));

        LatLng   শংকরপাশা  =new LatLng(24.302435, 91.358635);
        mMap.addMarker(new MarkerOptions().position(শংকরপাশা ).title("শংকরপাশা শাহী মসজিদ"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(শংকরপাশা ,9.2f));


        LatLng   পাইলগাও   =new LatLng(24.697211, 91.554921);
        mMap.addMarker(new MarkerOptions().position(পাইলগাও  ).title("পাইলগাও জমিদার বাড়ি"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(পাইলগাও  ,9.2f));


    }
}
