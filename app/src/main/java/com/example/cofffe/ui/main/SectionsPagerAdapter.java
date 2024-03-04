package com.example.cofffe.ui.main;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.cofffe.FirstActivity;
import com.example.cofffe.FourActivity;
import com.example.cofffe.R;
import com.example.cofffe.SecondActivity;
import com.example.cofffe.ThirdActivity;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private static final int[] TAB_ICONS = new int[]{
            R.drawable.img_10,
            R.drawable.img_11,
            R.drawable.img_12,
            R.drawable.img_13
    };
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        Drawable icon = ContextCompat.getDrawable(mContext, TAB_ICONS[position]);
        icon.setBounds(0, 0, icon.getIntrinsicWidth(), icon.getIntrinsicHeight());

        SpannableString spannableString = new SpannableString("  " + mContext.getResources().getString(TAB_TITLES[position]));
        ImageSpan imageSpan = new ImageSpan(icon, ImageSpan.ALIGN_BOTTOM);
        spannableString.setSpan(imageSpan, 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        return spannableString;
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