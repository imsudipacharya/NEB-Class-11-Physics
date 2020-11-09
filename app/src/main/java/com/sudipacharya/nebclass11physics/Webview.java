package com.sudipacharya.nebclass11physics;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.ArrayList;

public class Webview extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    ArrayList arrayList;
    ArrayAdapter arrayAdapter;
    WebView webview;
private InterstitialAd interstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "644457569507808_644477762839122");
        interstitialAd.loadAd();


        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("epuzzle");
String titleweb = intent.getExtras().getString("title");


        getSupportActionBar().setTitle(titleweb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        databaseHelper = new DatabaseHelper(Webview.this);
        arrayList = databaseHelper.getAllText();


        webview = (WebView)this.findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setLoadWithOverviewMode(true);
        webview.getSettings().setBuiltInZoomControls(true);
        // final TextView txtview = findViewById(R.id.txtxx);


        Ion.with(getApplicationContext()).load(easyPuzzle).asString().setCallback(new FutureCallback<String>() {
            @Override
            public void onCompleted(Exception e, String result) {

                arrayList.clear();
                arrayList.add(databaseHelper.getAllText());
                WebSettings webSettings = webview.getSettings();
                webSettings.setDefaultTextEncodingName("utf-8");
                webview.loadDataWithBaseURL("", result, "text/html", "utf-8", "");



            }
        });


    }
    @Override
    public void onBackPressed() {
        if (interstitialAd.isAdLoaded()){
            interstitialAd.show();
        }
        super.onBackPressed();
    }

}