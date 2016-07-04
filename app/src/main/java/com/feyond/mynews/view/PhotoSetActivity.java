package com.feyond.mynews.view;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.TextView;

import com.feyond.mynews.R;
import com.feyond.mynews.adater.PhotoSetViewPagerAdapter;
import com.feyond.mynews.constant.AppUrl;
import com.feyond.mynews.http.GetJsonObjectCallbackImpl;
import com.feyond.mynews.http.OkHttpUtils;
import com.feyond.mynews.model.PhotoSetBean;
import com.feyond.mynews.utils.RotateDownTransformer;

import java.util.List;

public class PhotoSetActivity extends BaseActivity{

    private TextView mContent;
    private TextView mTotal;
    private TextView mPosition;
    private TextView mTitle;
    private ViewPager mViewPager;
    private PhotoSetBean photoSet;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_set);
        getSupportActionBar().setTitle("图集");
        initView();
        initData();
    }

    private void initView(){
        mViewPager = (ViewPager) findViewById(R.id.pa_viewPager);
        mTitle = (TextView) findViewById(R.id.pa_textView_title);
        mPosition = (TextView) findViewById(R.id.pa_textView_position);
        mTotal = (TextView) findViewById(R.id.pa_textView_total);
        mContent = (TextView) findViewById(R.id.pa_textView_content);
    }

    private void initData(){
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String setID= bundle.getString("setID");
        String url = String.format(AppUrl.PHOTOSET, setID);
                OkHttpUtils.getJsonObject(url, PhotoSetBean.class);
                OkHttpUtils.addJsonObjectCallback(url, new GetJsonObjectCallbackImpl(){
                    @Override
                    public void getJsonObject(Object object){
                        photoSet = (PhotoSetBean) object;
                        setViewPager(photoSet.getPhotos());
                    }
                });
    }
    private void setViewPager(final List<PhotoSetBean.Photos> list){
        PhotoSetViewPagerAdapter adapter=new PhotoSetViewPagerAdapter(this,list);
        mViewPager.setAdapter(adapter);
        mPosition.setText(1+"");
        mTotal.setText("/"+list.size());
        mTitle.setText(photoSet.getSetname());
        mContent.setText(photoSet.getDesc());
        mViewPager.setPageTransformer(true,new RotateDownTransformer());
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels){
            }

            @Override
            public void onPageSelected(int position){
                mPosition.setText(position+1+"");
                mContent.setText(list.get(position).getNote());
            }

            @Override
            public void onPageScrollStateChanged(int state){
            }
        });
    }
}
