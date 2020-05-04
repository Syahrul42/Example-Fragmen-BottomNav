package com.syahru.bottomnav.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.syahru.bottomnav.R;
import com.syahru.bottomnav.models.Dunia;

import java.util.ArrayList;

public class ItemGridAdapter extends RecyclerView.Adapter<ItemGridAdapter.GridViewHolder> {

    private Context context;
    private ArrayList<Dunia> listDunia;

    public ItemGridAdapter(Context context) {
        this.context =  context;
    }

    public ArrayList<Dunia> getListDunia(){
        return listDunia;
    }

    public void setListDunia(ArrayList<Dunia> listDunia) {
        this.listDunia = listDunia;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment1_fragment, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(context).load(getListDunia().get(position).getPhoto()).into(holder.imgGrid);

    }

    @Override
    public int getItemCount() {
        return getListDunia().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {

        ImageView imgGrid;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGrid = itemView.findViewById(R.id.img_grid);
        }
    }
}
