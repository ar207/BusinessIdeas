package com.example.businessideas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.businessideas.ui.AllIdeas.AllideasFragment;
import com.example.businessideas.ui.AllIdeas.AllideasViewModel;

public class NotFoundIdea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_found_idea);
        Button notFound = findViewById(R.id.back);

        notFound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotFoundIdea.this, AllIdeasActivity.class);
                startActivity(intent);
            }

        });

    }
}
