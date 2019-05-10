package com.example.cy.chenyu20190510.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
     public abstract int initlayout();
     public abstract void initfind();
     public abstract void initdata();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initlayout());
        initfind();
        initdata();
    }
}
