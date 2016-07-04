package com.feyond.mynews.adater;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.feyond.mynews.constant.Config;
import com.feyond.mynews.fragment.PhotoBeanFragment;

import java.util.List;

/**
 * Created by Administrator on 2016/7/1.
 */
public class PhotoViewPagerAdapter extends FragmentPagerAdapter{
    private List<PhotoBeanFragment> list;
    public PhotoViewPagerAdapter(FragmentManager fm, List<PhotoBeanFragment> list){
        super(fm);
        this.list=list;
    }

    @Override
    public PhotoBeanFragment getItem(int position){

        return list.get(position);
    }

    @Override
    public int getCount(){
        return list==null?0:list.size();
    }

    @Override
    public CharSequence getPageTitle(int position){

        return Config.PHOTO_DEFAULT_TITLES[position];
    }
}
