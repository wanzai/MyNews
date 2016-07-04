package com.feyond.mynews.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feyond.mynews.R;
import com.feyond.mynews.adater.VideoViewPagerAdapter;
import com.feyond.mynews.constant.Config;
import com.feyond.mynews.utils.ScaleInOutTransformer;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideoFragment extends Fragment{
    private View view;
    private TabLayout tab;
    private ViewPager viewPager;

    public VideoFragment(){

    }

    public static VideoFragment newInstance(){
        VideoFragment fragment = new VideoFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if(view==null){
            view = inflater.inflate(R.layout.fragment_video,container,false);
            intView();
        }
        return view;
    }
    private void intView(){
        tab = (TabLayout) view.findViewById(R.id.fg_video_tab);
        viewPager = (ViewPager)  view.findViewById(R.id.fg_video_viewPager);
        viewPager.setPageTransformer(true,new ScaleInOutTransformer());
        List<VideoBeanFragment> list = new ArrayList<>();
        for(int i = 0; i < Config.VIDEO_DEFAULT_URLID.length; i++){
            VideoBeanFragment vf=VideoBeanFragment.newInstance(Config.VIDEO_DEFAULT_URLID[i]);
            list.add(vf);
        }
        VideoViewPagerAdapter adapter=new VideoViewPagerAdapter(getActivity().getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);
        tab.setupWithViewPager(viewPager);
    }

}
