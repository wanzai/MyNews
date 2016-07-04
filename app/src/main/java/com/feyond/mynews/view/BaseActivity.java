package com.feyond.mynews.view;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/7/1.
 */
public class BaseActivity extends AppCompatActivity{

    protected ActionBar actionBar;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState){
        super.onCreate(savedInstanceState, persistentState);
        actionBar = getSupportActionBar();
    }
}
