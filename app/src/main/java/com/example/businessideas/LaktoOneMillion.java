package com.example.businessideas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LaktoOneMillion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lakto_one_million);

        View airbndWithoutHome = findViewById(R.id.air_bnb_without_home);
        View atmMachine = findViewById(R.id.atm_machine);
        View laundryBusiness = findViewById(R.id.laundary_business);
        View vendingMachine = findViewById(R.id.vanding_machine);

        airbndWithoutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaktoOneMillion.this, AirbndWithoutHome.class);
                startActivity(intent);
            }
        });

        atmMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaktoOneMillion.this, AtmMachine.class);
                startActivity(intent);

            }
        });

        laundryBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaktoOneMillion.this, LaundryBusiness.class);
                startActivity(intent);
            }
        });

        vendingMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaktoOneMillion.this, VendingMachines.class);
                startActivity(intent);

            }
        });
    }
}
