package com.huynhngan.storeraumaapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.huynhngan.storeraumaapp.R;
import com.huynhngan.storeraumaapp.adapters.HomeHorAdapter;
import com.huynhngan.storeraumaapp.adapters.HomeVerAdapter;
import com.huynhngan.storeraumaapp.adapters.UpdateVerticalRec;
import com.huynhngan.storeraumaapp.models.HomeHorModel;
import com.huynhngan.storeraumaapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec {

RecyclerView homeHorizontalRec,homeVerticalRec;
ArrayList<HomeHorModel> homeHorModelList;
HomeHorAdapter homeHorAdapter;

//vertical
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home,container,false);
        homeHorizontalRec=root.findViewById(R.id.home_hor_rec);
        homeVerticalRec=root.findViewById(R.id.home_ver_rec);

        //Home Horizontal
        homeHorModelList=new ArrayList<>();

        homeHorModelList.add(new HomeHorModel(R.drawable.rmdxmachiato11,"Rau má Mix Mớì"));
        homeHorModelList.add(new HomeHorModel(R.drawable.dauxanh_sua_dua,"Rau má + Sữa đậu"));
        homeHorModelList.add(new HomeHorModel(R.drawable.suongsao_hatchia51,"Topping căng thẳng"));
        homeHorModelList.add(new HomeHorModel(R.drawable.rau_ma_dau_xanh_sd,"Combo Ngon Bá cháy"));
        homeHorModelList.add(new HomeHorModel(R.drawable.banhtrangmix_kho_galachanh94,"Bánh tráng mix"));
        homeHorModelList.add(new HomeHorModel(R.drawable.cavienchien,"Ăn Vặt"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hinh101,"Review"));



        homeHorAdapter=new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalRec.setAdapter(homeHorAdapter);
        homeHorizontalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));

        //Home Vertical
        homeVerModelList=new ArrayList<>();

        homeVerAdapter=new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalRec.setAdapter(homeVerAdapter);
        homeVerticalRec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        homeVerticalRec.setHasFixedSize(true);
        homeVerticalRec.setNestedScrollingEnabled(false);
        return root;
    }


    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list) {

        homeVerAdapter=new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalRec.setAdapter(homeVerAdapter);

    }
}