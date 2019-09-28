package com.example.baitap1_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Activity_layout2 extends Fragment {
    private TextView txt1;
    private ImageView img1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = layoutInflater.inflate(R.layout.layout2, viewGroup, false);
        txt1 = (TextView)view.findViewById(R.id.txt1);
        img1= (ImageView) view.findViewById(R.id.img1);
        return view;
    }
    public void ShowView(String x){
        txt1.setText(x);
        img1.setImageResource(R.drawable.ic_launcher_foreground);

    }
}
