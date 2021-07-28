package com.example.businessideas.ui.online;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.businessideas.LaktoOneMillion;
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

public class OnlineFragment extends Fragment {

    private OnlineViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(OnlineViewModel.class);
        View root = inflater.inflate(R.layout.fragment_online, container, false);
        CardView freelancing = root.findViewById(R.id.onlineIdeasOne);
        CardView ebook = root.findViewById(R.id.onlineIdeasTwo);
        CardView youtube = root.findViewById(R.id.onlineIdeasThree);
        CardView dropshipping = root.findViewById(R.id.onlineIdeasFour);
        CardView affliate_marketing = root.findViewById(R.id.onlineIdeasFive);
        CardView blogging = root.findViewById(R.id.onlineIdeasSix);

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
