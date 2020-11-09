package com.sudipacharya.nebclass11physics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {

    private String url1 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit1.html";
    private String url2 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit2.html";
    private String url3 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit3.html";
    private String url4 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit4.html";
    private String url5 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit5.html";
    private String url6 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit6.html";
    private String url7 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit7.html";
    private String url8 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit8.html";
    private String url9 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit9.html";
    private String url10 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit10.html";
    private String url11 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit11.html";
    private String url12 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit12.html";
    private String url13 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit13.html";
    private String url14 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit14.html";
    private String url15 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit15.html";
    private String url16 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit16.html";
    private String url17 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit17.html";
    private String url18 = "https://ge1hfzjb6npdizmd9zewja-on.drv.tw/NEB/NEB%20Class%2011%20Physics/Unit18.html";



    private String title1 = "Measurement";
    private String title2 = "Vectors";
    private String title3 = "Motion in a Straight Line";
    private String title4 = "Projectile Motion and Circular Motion";
    private String title5 = "LAWS OF MOTION";
    private String title6 = "WORK,ENERGY AND POWER";
    private String title7 = "SYSTEM OF PARTICLES AND ROTATIONAL MOTION";
    private String title8 = "GRAVITATION";
    private String title9 = "MECHANICAL PROPERTIES OF SOLIDS";
    private String title10 = "MECHANICAL PROPERTIES OF FLUIDS";
    private String title11 = "Hydrodynamics";
    private String title12 = "Surface tension";
    private String title13 = "Thermometry and Calorimetry";
    private String title14 = "Kinetic Theory of Gases";
    private String title15 = "Thermodynamics";
    private String title16 = "Methods of Heat Transmission";
    private String title17 = "Periodic Motion";
    private String title18 = "Wave";


    private InterstitialAd interstitialAd,interstitialAd1,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("NEB Class 11 Physics");



        AudienceNetworkAds.initialize(this);
        interstitialAd1 = new InterstitialAd(this, "644457569507808_644458536174378");
        interstitialAd1.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd2 = new InterstitialAd(this, "644457569507808_644458612841037");
        interstitialAd2.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd3 = new InterstitialAd(this, "644457569507808_644458722841026");
        interstitialAd3.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd4 = new InterstitialAd(this, "644457569507808_644458896174342");
        interstitialAd4.loadAd();


        AudienceNetworkAds.initialize(this);
        interstitialAd5 = new InterstitialAd(this, "644457569507808_644459029507662");
        interstitialAd5.loadAd();

        AudienceNetworkAds.initialize(this);
        interstitialAd = new InterstitialAd(this, "644457569507808_644458092841089");
        interstitialAd.loadAd();




        TextView btntxt1 = (TextView)findViewById(R.id.btntxt1);
        TextView btntxt2 = (TextView)findViewById(R.id.btntxt2);
        TextView btntxt3 = (TextView)findViewById(R.id.btntxt3);
        TextView btntxt4 = (TextView)findViewById(R.id.btntxt4);
        TextView btntxt5 = (TextView)findViewById(R.id.btntxt5);
        TextView btntxt6 = (TextView)findViewById(R.id.btntxt6);
        TextView btntxt7 = (TextView)findViewById(R.id.btntxt7);
        TextView btntxt8 = (TextView)findViewById(R.id.btntxt8);
        TextView btntxt9 = (TextView)findViewById(R.id.btntxt9);
        TextView btntxt10 = (TextView)findViewById(R.id.btntxt10);
        TextView btntxt11 = (TextView)findViewById(R.id.btntxt11);
        TextView btntxt12 = (TextView)findViewById(R.id.btntxt12);
        TextView btntxt13 = (TextView)findViewById(R.id.btntxt13);
        TextView btntxt14 = (TextView)findViewById(R.id.btntxt14);
        TextView btntxt15 = (TextView)findViewById(R.id.btntxt15);
        TextView btntxt16 = (TextView)findViewById(R.id.btntxt16);
        TextView btntxt17 = (TextView)findViewById(R.id.btntxt17);
        TextView btntxt18 = (TextView)findViewById(R.id.btntxt18);


        btntxt1.setText(title1);
        btntxt2.setText(title2);
        btntxt3.setText(title3);
        btntxt4.setText(title4);
        btntxt5.setText(title5);
        btntxt6.setText(title6);
        btntxt7.setText(title7);
        btntxt8.setText(title8);
        btntxt9.setText(title9);
        btntxt10.setText(title10);
        btntxt11.setText(title11);
        btntxt12.setText(title12);
        btntxt13.setText(title13);
        btntxt14.setText(title14);
        btntxt15.setText(title15);
        btntxt16.setText(title16);
        btntxt17.setText(title17);
        btntxt18.setText(title18);

        CardView card1 = (CardView)findViewById(R.id.card1);
        CardView card2 = (CardView)findViewById(R.id.card2);
        CardView card3 = (CardView)findViewById(R.id.card3);
        CardView card4 = (CardView)findViewById(R.id.card4);
        CardView card5 = (CardView)findViewById(R.id.card5);
        CardView card6 = (CardView)findViewById(R.id.card6);
        CardView card7 = (CardView)findViewById(R.id.card7);
        CardView card8 = (CardView)findViewById(R.id.card8);
        CardView card9 = (CardView)findViewById(R.id.card9);
        CardView card10 = (CardView)findViewById(R.id.card10);
        CardView card11 = (CardView)findViewById(R.id.card11);
        CardView card12 = (CardView)findViewById(R.id.card12);
        CardView card13 = (CardView)findViewById(R.id.card13);
        CardView card14 = (CardView)findViewById(R.id.card14);
        CardView card15 = (CardView)findViewById(R.id.card15);
        CardView card16 = (CardView)findViewById(R.id.card16);
        CardView card17 = (CardView)findViewById(R.id.card17);
        CardView card18 = (CardView)findViewById(R.id.card18);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd1.isAdLoaded())
                {
                    interstitialAd1.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url1);
                    i.putExtra("title",title1);
                    startActivity(i);
                }
            }
        });


        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd2.isAdLoaded())
                {
                    interstitialAd2.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url2);
                    i.putExtra("title",title2);
                    startActivity(i);
                }
            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd3.isAdLoaded())
                {
                    interstitialAd3.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url3);
                    i.putExtra("title",title3);
                    startActivity(i);
                }
            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd4.isAdLoaded())
                {
                    interstitialAd4.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url4);
                    i.putExtra("title",title4);
                    startActivity(i);
                }
            }
        });


        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd5.isAdLoaded())
                {
                    interstitialAd5.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url5);
                    i.putExtra("title",title5);
                    startActivity(i);
                }
            }
        });

        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd1.isAdLoaded())
                {
                    interstitialAd1.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url6);
                    i.putExtra("title",title6);
                    startActivity(i);
                }
            }
        });


        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd2.isAdLoaded())
                {
                    interstitialAd2.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url7);
                    i.putExtra("title",title7);
                    startActivity(i);
                }
            }
        });


        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd3.isAdLoaded())
                {
                    interstitialAd3.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url8);
                    i.putExtra("title",title8);
                    startActivity(i);
                }
            }
        });


        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd4.isAdLoaded())
                {
                    interstitialAd4.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url9);
                    i.putExtra("title",title9);
                    startActivity(i);
                }
            }
        });


        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd5.isAdLoaded())
                {
                    interstitialAd5.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url10);
                    i.putExtra("title",title10);
                    startActivity(i);
                }
            }
        });


        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd1.isAdLoaded())
                {
                    interstitialAd1.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url11);
                    i.putExtra("title",title11);
                    startActivity(i);
                }
            }
        });


        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd2.isAdLoaded())
                {
                    interstitialAd2.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url12);
                    i.putExtra("title",title12);
                    startActivity(i);
                }
            }
        });


        card13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd3.isAdLoaded())
                {
                    interstitialAd3.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url13);
                    i.putExtra("title",title13);
                    startActivity(i);
                }
            }
        });


        card14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd4.isAdLoaded())
                {
                    interstitialAd4.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url14);
                    i.putExtra("title",title14);
                    startActivity(i);
                }
            }
        });


        card15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd5.isAdLoaded())
                {
                    interstitialAd5.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url15);
                    i.putExtra("title",title15);
                    startActivity(i);
                }
            }
        });


        card16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd1.isAdLoaded())
                {
                    interstitialAd1.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url16);
                    i.putExtra("title",title16);
                    startActivity(i);
                }
            }
        });


        card17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd2.isAdLoaded())
                {
                    interstitialAd2.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url17);
                    i.putExtra("title",title17);
                    startActivity(i);
                }
            }
        });


        card18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (interstitialAd3.isAdLoaded())
                {
                    interstitialAd3.show();
                } else
                {
                    Intent i = new Intent(MainActivity.this, Webview.class);
                    i.putExtra("epuzzle", url18);
                    i.putExtra("title",title18);
                    startActivity(i);
                }
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