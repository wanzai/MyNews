package com.feyond.mynews.adater;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/7/1.
 */
public class MainViewPagerAdapter extends FragmentPagerAdapter{
    private List<Fragment> list;
    public MainViewPagerAdapter(FragmentManager fm, List<Fragment> list){
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int position){
        return list.get(position);
    }

    @Override
    public int getCount(){
        return list==null?0:list.size();
    }
}
