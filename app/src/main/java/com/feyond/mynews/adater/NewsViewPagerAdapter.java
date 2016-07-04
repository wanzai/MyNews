package com.feyond.mynews.adater;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.feyond.mynews.constant.Config;
import com.feyond.mynews.fragment.NewsBeanFragment;

import java.util.List;

/**
 * Created by Administrator on 2016/7/1.
 */
public class NewsViewPagerAdapter extends FragmentPagerAdapter{
    private List<NewsBeanFragment> list;
    public NewsViewPagerAdapter(FragmentManager fm, List<NewsBeanFragment> list){
        super(fm);
        this.list=list;
    }

    @Override
    public  NewsBeanFragment  getItem(int position){

        return list.get(position);
    }

    @Override
    public int getCount(){
        return list==null?0:list.size();
    }

    @Override
    public CharSequence getPageTitle(int position){
        return Config.NEWS_DEFAULT_TITLES[position];
    }
}
