package com.example.cofffe.ui.main;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.cofffe.FirstActivity;
import com.example.cofffe.FourActivity;
import com.example.cofffe.R;
import com.example.cofffe.SecondActivity;
import com.example.cofffe.ThirdActivity;
import com.google.android.material.tabs.TabLayout;

import org.jetbrains.annotations.NotNull;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};


    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }




    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                FirstActivity Tab1 = new FirstActivity();
                return Tab1;
            case 1:
                SecondActivity Tab2 = new SecondActivity();
                return Tab2;
            case 2:
                ThirdActivity Tab3 = new ThirdActivity();
                return Tab3;
            case 3:
                FourActivity Tab4 = new FourActivity();
                return Tab4;
        }
        return null;
    }


    @Override
    public int getCount() {
        return 4;
    }
}