package com.huynhngan.storeraumaapp.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huynhngan.storeraumaapp.R;
import com.huynhngan.storeraumaapp.adapters.FeaturedAdapter;
import com.huynhngan.storeraumaapp.models.FeaturedModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {

    List<FeaturedModel> featureModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;
    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_first,container,false);

        recyclerView=view.findViewById(R.id.feature_hor_rec);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featureModelList=new ArrayList<>();

        featureModelList.add(new FeaturedModel(R.drawable.set_ngap_mat,"Feature 1","Description 1"));
        featureModelList.add(new FeaturedModel(R.drawable.set_nham_nhi,"Feature 2","Description 2"));
        featureModelList.add(new FeaturedModel(R.drawable.set_lai_rai,"Feature 3","Description 3"));

        featuredAdapter=new FeaturedAdapter(featureModelList);
        recyclerView.setAdapter(featuredAdapter);
//        recyclerView.setLayoutManager(featuredAdapter);

        return view;

    }
}