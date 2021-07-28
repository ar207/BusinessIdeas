package com.example.businessideas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnlineIdeasPortal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_ideas_portal);


        View imageView1 = findViewById(R.id.onlineIdeasOne);
        View imageView2 = findViewById(R.id.onlineIdeasTwo);
        View imageView3 = findViewById(R.id.onlineIdeasThree);
        View imageView4 = findViewById(R.id.onlineIdeasFour);
        View imageView5 = findViewById(R.id.onlineIdeasFive);
        View imageView6 = findViewById(R.id.onlineIdeasSix);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnlineIdeasPortal.this, OnlineFreelancing.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnlineIdeasPortal.this, OnlineEbook.class);
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnlineIdeasPortal.this, OnlineYoutube.class);
                startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnlineIdeasPortal.this, OnlineDropshipping.class);
                startActivity(intent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnlineIdeasPortal.this, OnlineAffiliateMarketing.class);
                startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OnlineIdeasPortal.this, OnlineBlogging.class);
                startActivity(intent);
            }
        });
    }
}
