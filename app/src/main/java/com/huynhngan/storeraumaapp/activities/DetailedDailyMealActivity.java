package com.huynhngan.storeraumaapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.huynhngan.storeraumaapp.R;
import com.huynhngan.storeraumaapp.adapters.DetailedDailyAdapter;
import com.huynhngan.storeraumaapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type=getIntent().getStringExtra("type");

        recyclerView=findViewById(R.id.detailed_rec);
        imageView=findViewById(R.id.image_1);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList=new ArrayList<>();
        dailyAdapter=new DetailedDailyAdapter(detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);

        if(type!=null && type.equalsIgnoreCase("Nhâm nhi"))
        {
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.banhtrang_mix_pho_mai93,"Nhâm nhi","Nhâm Nhi khi buồn","4.9","60.000đ","13:00-23:00")) ;
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rauma_saurieng_suadua,"Nhâm nhi","Ăn no phủ phê","4.9","60.000đ","13:00-23:00")) ;
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.tranchau_ladua61,"Nhâm nhi","Lai rai khi buồn","4.9","60.000đ","13:00-23:00")) ;
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rau_ma_nguyen_chat,"Nhâm nhi","Ăn no ngập mặt","4.9","60.000đ","13:00-23:00")) ;
            dailyAdapter.notifyDataSetChanged();

        }
        if(type!=null && type.equalsIgnoreCase("Phủ phê"))
        {
            imageView.setImageResource(R.drawable.set_phu_phe);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.banhtrang_mix_pho_mai93,"Phủ phê","Nhâm Nhi khi buồn","4.9","60.000đ","13:00-23:00")) ;
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rauma_saurieng_suadua,"Phủ phê","Ăn no phủ phê","4.9","60.000đ","13:00-23:00")) ;
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.tranchau_ladua61,"Phủ phê","Lai rai khi buồn","4.9","60.000đ","13:00-23:00")) ;
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rau_ma_nguyen_chat,"Phủ phê","Ăn no ngập mặt","4.9","60.000đ","13:00-23:00")) ;
            dailyAdapter.notifyDataSetChanged();

        }
//        if(type!=null && type.equalsIgnoreCase("Lai rai"))
//        {
//            imageView.setImageResource(R.drawable.set_lai_rai);
//            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.banhtrang_mix_pho_mai93,"Lai rai","Nhâm Nhi khi buồn","4.9","60.000đ","13:00-23:00")) ;
//            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rauma_saurieng_suadua,"Lai rai","Ăn no phủ phê","4.9","60.000đ","13:00-23:00")) ;
//            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.tranchau_ladua61,"Lai rai","Lai rai khi buồn","4.9","60.000đ","13:00-23:00")) ;
//            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rau_ma_nguyen_chat,"Lai rai","Ăn no ngập mặt","4.9","60.000đ","13:00-23:00")) ;
//            dailyAdapter.notifyDataSetChanged();
//
//        }
//        if(type!=null && type.equalsIgnoreCase("Ngập mặt"))
//        {
//            imageView.setImageResource(R.drawable.set_ngap_mat);
//            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.banhtrang_mix_pho_mai93,"Ngập mặt","Nhâm Nhi khi buồn","4.9","60.000đ","13:00-23:00")) ;
//            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rauma_saurieng_suadua,"Ngập mặt","Ăn no phủ phê","4.9","60.000đ","13:00-23:00")) ;
//            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.tranchau_ladua61,"Ngập mặt","Lai rai khi buồn","4.9","60.000đ","13:00-23:00")) ;
//            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.rau_ma_nguyen_chat,"Ngập mặt","Ăn no ngập mặt","4.9","60.000đ","13:00-23:00")) ;
//            dailyAdapter.notifyDataSetChanged();
//
//        }

    }
}