package com.syahru.bottomnav.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.syahru.bottomnav.R;
import com.syahru.bottomnav.models.Dunia;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_DUNIA = "extra_dunia";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);
        TextView country = findViewById(R.id.tv_country_detail);


        Dunia dunia = getIntent().getParcelableExtra(EXTRA_DUNIA);

        Glide.with(this).load(dunia.getPhoto()).into(imageView);
        name.setText(dunia.getName());
        description.setText(dunia.getDescription());
        country.setText(dunia.getTempat());
    }
}
