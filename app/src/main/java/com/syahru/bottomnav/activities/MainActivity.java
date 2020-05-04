package com.syahru.bottomnav.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.syahru.bottomnav.R;
import com.syahru.bottomnav.adapter.ItemCardViewAdapter;
import com.syahru.bottomnav.adapter.ItemGridAdapter;
import com.syahru.bottomnav.adapter.ItemListAdapter;
import com.syahru.bottomnav.models.Dunia;
import com.syahru.bottomnav.models.DuniaData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Dunia> list;

    int mode;

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
       list.addAll(DuniaData.getListData());
            showRecyclerViewList();


        bottomNavigationView = findViewById(R.id.bottomnav);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,new HomeFragment()).commit();
        }

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                switch (menuItem.getItemId()){
                    case R.id.home:
                        showRecyclerViewList();
                        fragment = new HomeFragment();
                        break;
                    case R.id.fragment1:
                        showRecyclerViewGrid();
                        fragment = new Fragmen1Fragment();
                        break;
                    case R.id.fragment2:
                        fragment = new Fragment2Fragment();
                        showRecyclerCardView();
                        break;
                    case R.id.fragment3:
                        fragment = new Fragment3Fragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer,fragment).commit();
                return true;
            }
        });

    }

    private void showRecyclerCardView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemCardViewAdapter cardViewAdapter = new ItemCardViewAdapter(this);
        cardViewAdapter.setListDunia(list);
        recyclerView.setAdapter(cardViewAdapter);
    }

    private void showRecyclerViewGrid() {
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        ItemGridAdapter gridAdapter = new ItemGridAdapter(this);
        gridAdapter.setListDunia(list);
        recyclerView.setAdapter(gridAdapter);
    }
    private void showRecyclerViewList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemListAdapter listAdapter = new ItemListAdapter(this);
        listAdapter.setListDunia(list);
        recyclerView.setAdapter(listAdapter);
    }

}
