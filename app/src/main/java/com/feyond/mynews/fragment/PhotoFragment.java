package com.feyond.mynews.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feyond.mynews.R;
import com.feyond.mynews.adater.PhotoViewPagerAdapter;
import com.feyond.mynews.constant.Config;
import com.feyond.mynews.utils.ScaleInOutTransformer;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PhotoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PhotoFragment extends Fragment{
    private View view;
    private TabLayout tab;
    private ViewPager viewPager;

    public PhotoFragment(){

    }
    public static PhotoFragment newInstance(){
        PhotoFragment fragment = new PhotoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if(view==null){
            view = inflater.inflate(R.layout.fragment_photo,container,false);
            intView();
        }
        return view;
    }

    private void intView(){
        tab = (TabLayout) view.findViewById(R.id.fg_photo_tab);
        viewPager = (ViewPager)  view.findViewById(R.id.fg_photo_viewPager);
        viewPager.setPageTransformer(true,new ScaleInOutTransformer());
        List<PhotoBeanFragment> list=new ArrayList<>();
        for(int i = 0; i< Config.PHOTO_DEFAULT_TITLES.length; i++){
            PhotoBeanFragment pf= PhotoBeanFragment.newInstance(Config.PHOTO_DEFAULT_URLID[i]);
            list.add(pf);
        }
        PhotoViewPagerAdapter adapter=new PhotoViewPagerAdapter(getActivity().getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
    }
}
