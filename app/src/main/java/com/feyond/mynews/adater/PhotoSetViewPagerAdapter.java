package com.feyond.mynews.adater;

import android.content.Context;
import android.net.Uri;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.view.SimpleDraweeView;
import com.feyond.mynews.model.PhotoSetBean;

import java.util.List;

/**
 * Created by Administrator on 2016/7/2.
 */
public class PhotoSetViewPagerAdapter extends PagerAdapter{
    private List<PhotoSetBean.Photos> list;
    private Context context;

    public PhotoSetViewPagerAdapter(Context context,List<PhotoSetBean.Photos> list){
        this.list = list;
        this.context=context;
    }

    @Override
    public int getCount(){
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return view==object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((View) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        SimpleDraweeView simpleDraweeView=new SimpleDraweeView(context);
        simpleDraweeView.getHierarchy().setActualImageScaleType(ScalingUtils.ScaleType.CENTER_INSIDE);
        simpleDraweeView.setImageURI(Uri.parse(list.get(position).getImgurl()));
        container.addView(simpleDraweeView);
        return simpleDraweeView;
    }
}
