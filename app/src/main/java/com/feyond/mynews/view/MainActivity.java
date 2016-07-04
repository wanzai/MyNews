package com.feyond.mynews.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.feyond.mynews.R;
import com.feyond.mynews.adater.MainViewPagerAdapter;
import com.feyond.mynews.fragment.MeFragment;
import com.feyond.mynews.fragment.NewsFragment;
import com.feyond.mynews.fragment.PhotoFragment;
import com.feyond.mynews.fragment.VideoFragment;
import com.feyond.mynews.utils.DepthPageTransformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity{
    private List<Fragment> list=new ArrayList<>();
    private RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        final ViewPager viewPager = (ViewPager) findViewById(R.id.main_vp);
        group = (RadioGroup) findViewById(R.id.main_rg);
        final ActionBar actionBar = getSupportActionBar();
        list.add(NewsFragment.newInstance());
        list.add(PhotoFragment.newInstance());
        list.add(VideoFragment.newInstance());
        list.add(MeFragment.newInstance());
        MainViewPagerAdapter adapter=new MainViewPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);
        RadioButton button = (RadioButton) findViewById(R.id.main_rb_news);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                if(checkedId==R.id.main_rb_news){
                    actionBar.setTitle("新闻");
                    viewPager.setCurrentItem(0);
                }else if(checkedId==R.id.main_rb_photo){
                    actionBar.setTitle("图片");
                    viewPager.setCurrentItem(1);
                }else if(checkedId==R.id.main_rb_video){
                    actionBar.setTitle("视频");
                    viewPager.setCurrentItem(2);
                }else{
                    actionBar.setTitle("我");
                    viewPager.setCurrentItem(3);
                }
            }
        });
        viewPager.setPageTransformer(true,new DepthPageTransformer());
        button.setChecked(true);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels){
            }

            @Override
            public void onPageSelected(int position){
                RadioButton radioButton = (RadioButton) group.getChildAt(position);
                radioButton.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state){
            }
        });
    }
}
