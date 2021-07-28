package com.example.businessideas.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;


import com.example.businessideas.LaktoOneMillion;
import com.example.businessideas.MobileMart;
import com.example.businessideas.MoneyFromCamera;
import com.example.businessideas.MoneyWithBike;
import com.example.businessideas.MultaniMitti;
import com.example.businessideas.NotFoundIdea;
import com.example.businessideas.OfflineIdeasPortal;
import com.example.businessideas.OneMilliontoOnward;
import com.example.businessideas.OnlineDropshipping;
import com.example.businessideas.OnlineIdeasPortal;
import com.example.businessideas.R;
import com.example.businessideas.TenktoOneLak;
import com.example.businessideas.UdemyCourses;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        EditText get_business_amount = root.findViewById(R.id.amount);
        Button search = root.findViewById(R.id.search_business);
        Button offline = root.findViewById(R.id.offline_ideas);
        Button online = root.findViewById(R.id.online);

        offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OfflineIdeasPortal.class);
                startActivity(intent);
            }
        });

        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OnlineIdeasPortal.class);
                startActivity(intent);
            }
        });


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!get_business_amount.getText().toString().isEmpty()) {
                    int amount = Integer.parseInt(get_business_amount.getText().toString());
                    if (amount >= 10000 && amount < 100000) {
                        Intent intent = new Intent(getActivity(), TenktoOneLak.class);
                        startActivity(intent);
                    } else if (amount >= 100000 && amount < 1000000) {
                        Intent intent = new Intent(getActivity(), LaktoOneMillion.class);
                        startActivity(intent);
                    } else if (amount > 1000000) {
                        Intent intent = new Intent(getActivity(), OneMilliontoOnward.class);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(getActivity(), NotFoundIdea.class);
                        startActivity(intent);
                    }
                } else {
                    Intent intent = new Intent(getActivity(), NotFoundIdea.class);
                    startActivity(intent);
                }
            }

        });
        return root;
    }
}
