package com.huynhngan.storeraumaapp.adapters;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.huynhngan.storeraumaapp.R;
import com.huynhngan.storeraumaapp.models.FeaturedModel;

import java.util.List;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.ViewHolder> {

    List<FeaturedModel> list;
    public FeaturedAdapter(List<FeaturedModel> list)
    {
        this.list=list;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_hor_item,parent,false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.image.setImageResource(list.get(position).getImage());
    holder.name.setText(list.get(position).getName());
    holder.desc.setText(list.get(position).getDes());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name,desc;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.feature_img);
            name=itemView.findViewById(R.id.feature_name);
            desc=itemView.findViewById(R.id.feature_des);

        }
    }
}
