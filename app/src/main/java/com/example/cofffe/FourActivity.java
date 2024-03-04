package com.example.cofffe;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class FourActivity extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.four_tab, container, false);
    }

    public static Drawable tintIcon(Context context, @NotNull Drawable icon, int color) {
        icon = DrawableCompat.wrap(icon).mutate();
        DrawableCompat.setTintList(icon, ContextCompat.getColorStateList(context, color));
        DrawableCompat.setTintMode(icon, PorterDuff.Mode.SRC_IN);
        return icon;
    }

}
