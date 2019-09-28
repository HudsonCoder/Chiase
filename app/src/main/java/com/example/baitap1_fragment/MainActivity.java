package com.example.baitap1_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void ShowText(String center){
        Activity_layout2 layout2= (Activity_layout2)this.getSupportFragmentManager().findFragmentById(R.id.layout2);
        layout2.ShowView(center);
    }
}
