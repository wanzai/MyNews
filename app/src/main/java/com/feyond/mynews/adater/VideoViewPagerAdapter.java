package com.feyond.mynews.adater;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.feyond.mynews.constant.Config;
import com.feyond.mynews.fragment.VideoBeanFragment;

import java.util.List;

/**
 * Created by Administrator on 2016/7/3.
 */
public class VideoViewPagerAdapter extends FragmentPagerAdapter{
    private List<VideoBeanFragment> list;
    public VideoViewPagerAdapter(FragmentManager fm,List<VideoBeanFragment> list){
        super(fm);
        this.list=list;
    }

    @Override
    public VideoBeanFragment getItem(int position){
        return list.get(position);
    }

    @Override
    public int getCount(){
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position){

        return Config.VIDEO_DEFAULT_TITLES[position];
    }
}
