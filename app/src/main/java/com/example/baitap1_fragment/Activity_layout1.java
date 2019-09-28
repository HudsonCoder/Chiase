package com.example.baitap1_fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Activity_layout1 extends Fragment {
    private EditText edt1;

    private Button bt1;

    //
    private MainActivity activity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view = layoutInflater.inflate(R.layout.layout1, viewGroup, false);

        edt1 = (EditText) view.findViewById(R.id.tx2);
        bt1 = (Button) view.findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XulyEditText();
            }
        });

        return view;
    }

    @Nullable
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof MainActivity) {
            this.activity = (MainActivity) context;
        }
    }

    private void XulyEditText() {
        String txt1 = this.edt1.getText().toString();

        this.activity.ShowText(txt1);

    }
}
