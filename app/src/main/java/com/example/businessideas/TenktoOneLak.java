package com.example.businessideas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TenktoOneLak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenkto_one_lak);

        View multaniMitti = findViewById(R.id.multani_mitti);
        View moneyFromCamera = findViewById(R.id.money_from_camera);
        View moneyFromBike = findViewById(R.id.money_from_bike);
        View udemyCourses = findViewById(R.id.udemy_courses);
        View mobileMart = findViewById(R.id.mobile_mart);

        multaniMitti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TenktoOneLak.this, MultaniMitti.class);
                startActivity(intent);

            }
        });

        moneyFromCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TenktoOneLak.this, MoneyFromCamera.class);
                startActivity(intent);

            }
        });

        moneyFromBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TenktoOneLak.this, MoneyWithBike.class);
                startActivity(intent);

            }
        });

        udemyCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TenktoOneLak.this, UdemyCourses.class);
                startActivity(intent);

            }
        });

        mobileMart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TenktoOneLak.this, MobileMart.class);
                startActivity(intent);

            }
        });

    }
}
