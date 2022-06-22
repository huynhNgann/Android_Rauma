package com.huynhngan.storeraumaapp.ui.dailymeal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huynhngan.storeraumaapp.R;
import com.huynhngan.storeraumaapp.adapters.DailyMealAdapter;
import com.huynhngan.storeraumaapp.models.DailyMealModel;
import java.util.ArrayList;
import java.util.List;

public class DailyMealFragment extends Fragment {

    RecyclerView recyclerView;
    List<DailyMealModel> dailyMealModelList;
    DailyMealAdapter dailyMealAdapter;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {
        View root = inflater.inflate(R.layout.daily_meal_fragment,container,false);
        recyclerView=root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModelList=new ArrayList<>();

        dailyMealModelList.add(new DailyMealModel(R.drawable.set_nham_nhi,"Nhâm nhi","Giảm 30%","Mô tả","Nhâm nhi"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.set_lai_rai,"Lai rai","Giảm 30%","Mô tả","Lai rai"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.set_phu_phe,"Phủ phê","Giảm 30%","Mô tả","Phủ phê"));
        dailyMealModelList.add(new DailyMealModel(R.drawable.set_ngap_mat,"Ngập mặt","Giảm 30%","Mô tả","Ngập mặt"));

        dailyMealAdapter=new DailyMealAdapter(getContext(),dailyMealModelList);
        recyclerView.setAdapter(dailyMealAdapter);
        dailyMealAdapter.notifyDataSetChanged();
        return root;
    }


}