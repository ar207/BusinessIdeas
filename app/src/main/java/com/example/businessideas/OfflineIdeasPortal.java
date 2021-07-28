package com.example.businessideas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OfflineIdeasPortal extends AppCompatActivity {
    CardView tenk, lakToMillion, millionToOnward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_ideas_portal);

        tenk  =findViewById(R.id.tenk);
        lakToMillion=findViewById(R.id.lak_to_million);
        millionToOnward=findViewById(R.id.million_to_onward);
        tenk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OfflineIdeasPortal.this,TenktoOneLak.class);
                startActivity(intent);
            }
        });
        lakToMillion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OfflineIdeasPortal.this,LaktoOneMillion.class);
                startActivity(intent);
            }
        });
        millionToOnward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(OfflineIdeasPortal.this,OneMilliontoOnward.class);
                startActivity(intent);
            }
        });


    }
}
