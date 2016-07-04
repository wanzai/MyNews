package com.feyond.mynews.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.feyond.mynews.R;
import com.feyond.mynews.adater.NewsViewPagerAdapter;
import com.feyond.mynews.constant.Config;
import com.feyond.mynews.utils.DepthPageTransformer;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewsFragment extends Fragment{
    private View view;
    private TabLayout tab;
    private ViewPager viewPager;

    public NewsFragment(){

    }

    public static NewsFragment newInstance(){
        NewsFragment fragment = new NewsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if(view==null){
            view = inflater.inflate(R.layout.fragment_news,container,false);
            intView();
        }
        return view;
    }

    private void intView(){
        tab = (TabLayout) view.findViewById(R.id.fg_news_tab);
        viewPager = (ViewPager)  view.findViewById(R.id.fg_news_viewPager);
        initData();
    }

    private void initData(){
        List<NewsBeanFragment> list = new ArrayList<>();
        for(int i=0;i< Config.NEWS_DEFAULT_URLID.length;i++){
            NewsBeanFragment nf= NewsBeanFragment.newInstance(Config.NEWS_DEFAULT_URLID[i]);
            list.add(nf);
        }
        NewsViewPagerAdapter adapter = new NewsViewPagerAdapter(getActivity().getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(true,new DepthPageTransformer());
        viewPager.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event){
                v.getParent().requestDisallowInterceptTouchEvent(true);
                return false;
            }
        });
        tab.setupWithViewPager(viewPager);
    }

}
