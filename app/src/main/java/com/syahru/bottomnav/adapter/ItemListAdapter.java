package com.syahru.bottomnav.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.syahru.bottomnav.R;
import com.syahru.bottomnav.models.Dunia;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ListViewHolder> {
    private Context context;
    private ArrayList<Dunia> listDunia;

    public ItemListAdapter (Context context){
        this.context = context;
    }

    public ArrayList<Dunia> getListDunia() {
        return listDunia;
    }

    public void setListDunia(ArrayList<Dunia> listDunia) {
        this.listDunia = listDunia;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemList = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_fragment, parent, false);
        return new ListViewHolder(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        holder.tvName.setText(getListDunia().get(position).getName());
        holder.tvTempat.setText(getListDunia().get(position).getTempat());

        Glide.with(context).load(getListDunia().get(position).getPhoto()).into(holder.imgList);
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, getListDunia().get(position).getName() + "clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return getListDunia().size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvTempat;
        ImageView imgList;
        RelativeLayout relativeLayout;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name_list);
            tvTempat = itemView.findViewById(R.id.tv_tempat_list);
            imgList = itemView.findViewById(R.id.img_list);
            relativeLayout = itemView.findViewById(R.id.relative_layout);
        }
    }
}
