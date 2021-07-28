package com.example.businessideas.ui.offline;

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
import com.example.businessideas.R;
import com.example.businessideas.TenktoOneLak;

public class OfflineFragment extends Fragment {
    CardView tenk, lakToMillion, millionToOnward;
    private OfflineViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(OfflineViewModel.class);
        View root = inflater.inflate(R.layout.fragment_offline, container, false);

        tenk = root.findViewById(R.id.tenk);
        lakToMillion = root.findViewById(R.id.lak_to_million);
        millionToOnward = root.findViewById(R.id.million_to_onward);
        tenk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), TenktoOneLak.class);
                startActivity(intent);
            }
        });
        lakToMillion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), LaktoOneMillion.class);
                startActivity(intent);
            }
        });
        millionToOnward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), OneMilliontoOnward.class);
                startActivity(intent);
            }
        });


        return root;
    }
}
