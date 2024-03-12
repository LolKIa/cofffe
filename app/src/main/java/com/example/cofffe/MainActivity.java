package com.example.cofffe;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.cofffe.ui.main.SectionsPagerAdapter;
import com.example.cofffe.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //ViewPager viewPager = findViewById(R.id.viewPager);
        //TabLayout tabs = findViewById(R.id.tabs);
        ViewPager viewPager = binding.viewPager;
        TabLayout tabs = binding.tabs;

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs.setupWithViewPager(viewPager);

        tabs.getSelectedTabPosition();
        tabs.getTabAt(0).setIcon(R.drawable.img_10);
        tabs.getTabAt(1).setIcon(R.drawable.img_11);
        tabs.getTabAt(2).setIcon(R.drawable.img_12);
        tabs.getTabAt(3).setIcon(R.drawable.img_13);

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition()==0){
                    tab.setIcon(R.drawable.img_10);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_11);
                }else if (tab.getPosition()==2){
                    tab.setIcon(R.drawable.img_12);
                }else if (tab.getPosition()==3){
                    tab.setIcon(R.drawable.img_13);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                if (tab.getPosition()==0){
                    tab.setIcon(R.drawable.img_10);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_11);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_12);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_13);
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
                if (tab.getPosition()==0){
                    tab.setIcon(R.drawable.img_13);
                }else if (tab.getPosition()==1){
                    tab.setIcon(R.drawable.img_12);
                }else if (tab.getPosition()==2){
                    tab.setIcon(R.drawable.img_11);
                }else if (tab.getPosition()==3){
                    tab.setIcon(R.drawable.img_10);
                }
            }
        });

    }
}



