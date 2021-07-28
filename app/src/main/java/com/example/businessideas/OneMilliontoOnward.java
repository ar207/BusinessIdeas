package com.example.businessideas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OneMilliontoOnward extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_millionto_onward);

        View millionAirBnb = findViewById(R.id.million_air_bnb);
        View millionCar = findViewById(R.id.million_car);
        View millionSilentPartener = findViewById(R.id.million_silent_partener);
        View millionBakkery = findViewById(R.id.million_bakkery);

        millionAirBnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OneMilliontoOnward.this, MillionAirbnb.class);
                startActivity(intent);
            }
        });

        millionCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OneMilliontoOnward.this, MillionCar.class);
                startActivity(intent);
            }
        });

        millionSilentPartener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OneMilliontoOnward.this, MillionSilentPartener.class);
                startActivity(intent);
            }
        });

        millionBakkery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OneMilliontoOnward.this, MillionBakkery.class);
                startActivity(intent);
            }
        });


    }
}
