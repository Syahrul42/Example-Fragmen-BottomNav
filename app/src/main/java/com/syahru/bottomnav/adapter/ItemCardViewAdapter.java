package com.syahru.bottomnav.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.syahru.bottomnav.R;
import com.syahru.bottomnav.activities.DetailActivity;
import com.syahru.bottomnav.models.Dunia;

import java.util.ArrayList;

public class ItemCardViewAdapter extends RecyclerView.Adapter<ItemCardViewAdapter.CardViewHolder> {

    private Context context;
    private ArrayList<Dunia> listDunia;

    public ItemCardViewAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Dunia> getListDunia(){
        return listDunia;
    }

    public void setListDunia(ArrayList<Dunia> listDunia) {
        this.listDunia = listDunia;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment2_fragment, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, final int position) {
        holder.tvName.setText(getListDunia().get(position).getName());
        holder.tvDescription.setText(getListDunia().get(position).getDescription());
        Glide.with(context).load(getListDunia().get(position).getPhoto()).into(holder.imgPhoto);

        holder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent detailActivity = new Intent(context, DetailActivity.class);
                Intent intent = detailActivity.putExtra(DetailActivity.EXTRA_DUNIA, listDunia.get(position));
                context.startActivity(detailActivity);
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListDunia().size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDescription;
        Button button;


        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_card);
            tvName = itemView.findViewById(R.id.text_name_card);
            tvDescription = itemView.findViewById(R.id.tv_desc_card);
            button = itemView.findViewById(R.id.button);

        }
    }
}
