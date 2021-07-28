package com.example.businessideas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AllIdeasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_ideas);

        CardView multaniMitti = findViewById(R.id.multani_mitti);
        CardView moneyFromCamera = findViewById(R.id.money_from_camera);
        CardView moneyFromBike = findViewById(R.id.money_from_bike);
        CardView udemyCourses = findViewById(R.id.udemy_courses);
        CardView mobileMart = findViewById(R.id.mobile_mart);
        CardView airbndWithoutHome = findViewById(R.id.air_bnb_without_home);
        CardView atmMachine = findViewById(R.id.atm_machine);
        CardView laundryBusiness = findViewById(R.id.laundary_business);
        CardView vendingMachine = findViewById(R.id.vanding_machine);
        CardView millionAirBnb = findViewById(R.id.million_air_bnb);
        CardView millionCar = findViewById(R.id.million_car);
        CardView millionSilentPartener = findViewById(R.id.million_silent_partener);
        CardView millionBakkery = findViewById(R.id.million_bakkery);
        CardView freelancing = findViewById(R.id.onlineIdeasOne);
        CardView ebook = findViewById(R.id.onlineIdeasTwo);
        CardView youtube = findViewById(R.id.onlineIdeasThree);
        CardView dropshipping = findViewById(R.id.onlineIdeasFour);
        CardView affliate_marketing = findViewById(R.id.onlineIdeasFive);
        CardView blogging = findViewById(R.id.onlineIdeasSix);


        multaniMitti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, MultaniMitti.class);
                startActivity(intent);

            }
        });

        moneyFromCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, MoneyFromCamera.class);
                startActivity(intent);

            }
        });

        moneyFromBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, MoneyWithBike.class);
                startActivity(intent);

            }
        });

        udemyCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, UdemyCourses.class);
                startActivity(intent);

            }
        });

        mobileMart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, MobileMart.class);
                startActivity(intent);

            }
        });

        airbndWithoutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, AirbndWithoutHome.class);
                startActivity(intent);
            }
        });

        atmMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, AtmMachine.class);
                startActivity(intent);

            }
        });

        laundryBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, LaundryBusiness.class);
                startActivity(intent);
            }
        });

        vendingMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, VendingMachines.class);
                startActivity(intent);

            }
        });

        millionAirBnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, MillionAirbnb.class);
                startActivity(intent);
            }
        });

        millionCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, MillionCar.class);
                startActivity(intent);
            }
        });

        millionSilentPartener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, MillionSilentPartener.class);
                startActivity(intent);
            }
        });

        millionBakkery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, MillionBakkery.class);
                startActivity(intent);
            }
        });

        freelancing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, OnlineFreelancing.class);
                startActivity(intent);
            }
        });

        ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, OnlineEbook.class);
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, OnlineYoutube.class);
                startActivity(intent);
            }
        });

        dropshipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, OnlineDropshipping.class);
                startActivity(intent);
            }
        });

        affliate_marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, OnlineAffiliateMarketing.class);
                startActivity(intent);
            }
        });

        blogging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AllIdeasActivity.this, OnlineBlogging.class);
                startActivity(intent);
            }
        });

    }
}
