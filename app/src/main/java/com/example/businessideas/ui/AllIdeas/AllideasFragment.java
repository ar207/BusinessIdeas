package com.example.businessideas.ui.AllIdeas;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.businessideas.AirbndWithoutHome;
import com.example.businessideas.AtmMachine;
import com.example.businessideas.LaktoOneMillion;
import com.example.businessideas.LaundryBusiness;
import com.example.businessideas.MillionAirbnb;
import com.example.businessideas.MillionBakkery;
import com.example.businessideas.MillionCar;
import com.example.businessideas.MillionSilentPartener;
import com.example.businessideas.MobileMart;
import com.example.businessideas.MoneyFromCamera;
import com.example.businessideas.MoneyWithBike;
import com.example.businessideas.MultaniMitti;
import com.example.businessideas.OfflineIdeasPortal;
import com.example.businessideas.OneMilliontoOnward;
import com.example.businessideas.OnlineAffiliateMarketing;
import com.example.businessideas.OnlineBlogging;
import com.example.businessideas.OnlineDropshipping;
import com.example.businessideas.OnlineEbook;
import com.example.businessideas.OnlineFreelancing;
import com.example.businessideas.OnlineIdeasPortal;
import com.example.businessideas.OnlineYoutube;
import com.example.businessideas.R;
import com.example.businessideas.TenktoOneLak;
import com.example.businessideas.UdemyCourses;
import com.example.businessideas.VendingMachines;

public class AllideasFragment extends Fragment {

    private AllideasViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(AllideasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_all_ideas, container, false);

        CardView multaniMitti = root.findViewById(R.id.multani_mitti);
        CardView moneyFromCamera = root.findViewById(R.id.money_from_camera);
        CardView moneyFromBike = root.findViewById(R.id.money_from_bike);
        CardView udemyCourses = root.findViewById(R.id.udemy_courses);
        CardView mobileMart = root.findViewById(R.id.mobile_mart);
        CardView airbndWithoutHome = root.findViewById(R.id.air_bnb_without_home);
        CardView atmMachine = root.findViewById(R.id.atm_machine);
        CardView laundryBusiness = root.findViewById(R.id.laundary_business);
        CardView vendingMachine = root.findViewById(R.id.vanding_machine);
        CardView millionAirBnb = root.findViewById(R.id.million_air_bnb);
        CardView millionCar = root.findViewById(R.id.million_car);
        CardView millionSilentPartener = root.findViewById(R.id.million_silent_partener);
        CardView millionBakkery = root.findViewById(R.id.million_bakkery);
        CardView freelancing = root.findViewById(R.id.onlineIdeasOne);
        CardView ebook = root.findViewById(R.id.onlineIdeasTwo);
        CardView youtube = root.findViewById(R.id.onlineIdeasThree);
        CardView dropshipping = root.findViewById(R.id.onlineIdeasFour);
        CardView affliate_marketing = root.findViewById(R.id.onlineIdeasFive);
        CardView blogging = root.findViewById(R.id.onlineIdeasSix);


        multaniMitti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MultaniMitti.class);
                startActivity(intent);

            }
        });

        moneyFromCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MoneyFromCamera.class);
                startActivity(intent);

            }
        });

        moneyFromBike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MoneyWithBike.class);
                startActivity(intent);

            }
        });

        udemyCourses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), UdemyCourses.class);
                startActivity(intent);

            }
        });

        mobileMart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MobileMart.class);
                startActivity(intent);

            }
        });

        airbndWithoutHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AirbndWithoutHome.class);
                startActivity(intent);
            }
        });

        atmMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), AtmMachine.class);
                startActivity(intent);

            }
        });

        laundryBusiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LaundryBusiness.class);
                startActivity(intent);
            }
        });

        vendingMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), VendingMachines.class);
                startActivity(intent);

            }
        });

        millionAirBnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MillionAirbnb.class);
                startActivity(intent);
            }
        });

        millionCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MillionCar.class);
                startActivity(intent);
            }
        });

        millionSilentPartener.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MillionSilentPartener.class);
                startActivity(intent);
            }
        });

        millionBakkery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), MillionBakkery.class);
                startActivity(intent);
            }
        });

        freelancing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OnlineFreelancing.class);
                startActivity(intent);
            }
        });

        ebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OnlineEbook.class);
                startActivity(intent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OnlineYoutube.class);
                startActivity(intent);
            }
        });

        dropshipping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OnlineDropshipping.class);
                startActivity(intent);
            }
        });

        affliate_marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OnlineAffiliateMarketing.class);
                startActivity(intent);
            }
        });

        blogging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OnlineBlogging.class);
                startActivity(intent);
            }
        });

        return root;
    }
}
