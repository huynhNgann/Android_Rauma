package com.huynhngan.storeraumaapp.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.huynhngan.storeraumaapp.R;
import com.huynhngan.storeraumaapp.models.HomeHorModel;
import com.huynhngan.storeraumaapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder> {

    UpdateVerticalRec updateVerticalRec;
//    Context context;
    //    List<HomeHorModel> list;

    Activity activity;
    ArrayList<HomeHorModel> list;
    boolean check=true;
    boolean select=true;
    int row_index=-1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list) {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_horizontal_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if(check) {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();
            homeVerModels.add(new HomeVerModel(R.drawable.banhtrang_mix_pho_mai93, "Bánh tráng mix phô mai", "6:00-23:00", "4.0", "18.000đ"));
            homeVerModels.add(new HomeVerModel(R.drawable.tranchau_ladua61, "Trân châu tuyết trắng", "6:00-23:00", "4.0", "7.000đ"));
            homeVerModels.add(new HomeVerModel(R.drawable.rmsauriengsuadua21, "Rau Má Sầu Riêng", "6:00-23:00", "4.0", "22.000đ"));
            homeVerModels.add(new HomeVerModel(R.drawable.banh_trang_tron, "Bánh tráng trộn", "6:00-23:00", "4.0", "18.000đ"));
            homeVerModels.add(new HomeVerModel(R.drawable.combo81, "Combo 5", "6:00-23:00", "4.0", "30.000đ"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
             holder.cardView.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     row_index=position;
                     notifyDataSetChanged();
                     if(position==0)
                     {
                         ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                         homeVerModels.add(new HomeVerModel(R.drawable.mix_kem_sua_nam_tuyet,"Rau má Mix Kem sữa Nấm Tuyết","6:00-23:00","4.0","30.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.kemsua_hanhnhan,"Rau má Mix Kem sữa Hạnh Nhân","6:00-23:00","4.0","30.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.rmdxmachiato11,"Rau má đậu xanh Macchiato","6:00-23:00","4.0","28.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.rmmachiato12,"Rau má mix Macchiato","6:00-23:00","4.0","20.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.khoai_mon_sd,"Khoai môn Sữa dừa","6:00-23:00","4.0","20.000đ"));

                         updateVerticalRec.callBack(position,homeVerModels);

                     }
                     else if(position==1)
                     {

                         ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                         homeVerModels.add(new HomeVerModel(R.drawable.rau_ma_dau_xanh_sd,"Rau má mix đậu xanh sữa dừa","6:00-23:00","4.0","20.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.rauma_saurieng_suadua,"Rau Má Sầu Riêng Sữa dừa","6:00-23:00","4.6","22.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.rau_ma_nguyen_chat,"Rau má nguyên chất̀","6:00-23:00","4.0","18.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.rm_khoai_mon_sd,"Rau má khoai môn sữa Dừa","6:00-23:00","4.0","20.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.dauxanh_sua_dua,"Rau má đậu xanh sữa dừa","6:00-23:00","4.0","20.000đ"));
                         updateVerticalRec.callBack(position,homeVerModels);

                     }
                     else if(position==2)
                     {

                         ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                         homeVerModels.add(new HomeVerModel(R.drawable.suongsao_hatchia51,"Sương sáo hạt chia","6:00-23:00","4.5","7.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.thach_cunang52,"Thạch củ năng","6:00-23:00","4.5","7.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.thach_namtuyet,"Thạch nấm tuyết","6:00-23:00","4.5","7.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.thach_ladua53,"Thạch lá dứa","6:00-23:00","4.5","7.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.tranchau_tuyettrang62,"Trân châu tuyết trắng","6:00-23:00","4.5","7.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.tranchau_ladua61,"Trân châu lá dứa","6:00-23:00","4.5","7.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.thach_nha_dam,"Thạch nha đam","6:00-23:00","4.0","7.000đ"));

                         updateVerticalRec.callBack(position,homeVerModels);

                     }
                     else if(position==3)
                     {

                         ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                         homeVerModels.add(new HomeVerModel(R.drawable.combo2,"Combo 2","6:00-23:00","4.5","30.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.combo72,"Combo 7","6:00-23:00","4.5","32.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.combo73,"Combo 8","6:00-23:00","4.5","32.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.combo74,"Combo 6","6:00-23:00","4.0","30.000đ"));

                         homeVerModels.add(new HomeVerModel(R.drawable.combo81,"Combo 5","6:00-23:00","4.0","30.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.combo82,"Combo 4","6:00-23:00","4.0","29.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.combo83,"Combo 3","6:00-23:00","4.0","30.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.combo84,"Combo 1","6:00-23:00","4.0","30.000đ"));

                         updateVerticalRec.callBack(position,homeVerModels);

                     }
                     else if(position==4)
                     {

                         ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                         homeVerModels.add(new HomeVerModel(R.drawable.banhtrang_mixtomhanh91,"Bánh tráng mix tôm hành","6:00-23:00","4.5","18.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.banhtrang_mixkho_bo92,"Bánh tráng mix khô bò","6:00-23:00","4.0","18.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.banhtrang_mix_pho_mai93,"Bánh tráng mix phô mai","6:00-23:00","4.0","18.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.banhtrangmix_kho_galachanh94,"Bánh tráng mix khô gà lá chanh","6:00-23:00","4.0","18.000đ"));

                         updateVerticalRec.callBack(position,homeVerModels);

                     }
                     else if(position==5)
                     {

                         ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                         homeVerModels.add(new HomeVerModel(R.drawable.flan027,"Bánh Flan","6:00-23:00","4.6","10.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.banh_chien,"Bánh Bao Chiên","6:00-23:00","4.5","12.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.banh_trang_tron,"Bánh tráng trộn","6:00-23:00","4.0","20.000đ"));
                         homeVerModels.add(new HomeVerModel(R.drawable.tokpoki,"Tolpoki","6:00-23:00","4.2","20.000đ"));
                         updateVerticalRec.callBack(position,homeVerModels);

                     }
                     else if(position==6)
                     {

                         ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();
                         homeVerModels.add(new HomeVerModel(R.drawable.hinh101,"Buồn buồn vui vui","6:00-23:00","4.6",""));
                         homeVerModels.add(new HomeVerModel(R.drawable.hinh112,"Buồn buồn vui vui","6:00-23:00","4.5",""));
                         homeVerModels.add(new HomeVerModel(R.drawable.hinh122,"Buồn buồn vui vui","6:00-23:00","4.0",""));
                         homeVerModels.add(new HomeVerModel(R.drawable.hinh132,"Buồn buồn vui vui","6:00-23:00","4.2",""));
                         updateVerticalRec.callBack(position,homeVerModels);

                     }
                 }
             });
             if(select)
             {
                 if(position==0)
                 {
                     holder.cardView.setBackgroundResource(R.drawable.change_bg);
                     select=false;
                 }
             }
             else
             {
                 if(row_index==position)
                 {
                     holder.cardView.setBackgroundResource(R.drawable.change_bg);
                 }
                 else {
                     holder.cardView.setBackgroundResource(R.drawable.default_bg);
                 }
             }
        }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imghomehor_btr_mix_phomai);
            name=itemView.findViewById(R.id.txthomehor_btragmix);
            cardView=itemView.findViewById(R.id.cardView);
        }
    }
}

