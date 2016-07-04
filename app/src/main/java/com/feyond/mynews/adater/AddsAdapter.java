package com.feyond.mynews.adater;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.facebook.drawee.view.SimpleDraweeView;
import com.feyond.mynews.app.App;
import com.feyond.mynews.model.Adds;

import java.util.List;

/**
 * Created by Administrator on 2016/6/29.
 */
public class AddsAdapter extends PagerAdapter{
    List<SimpleDraweeView> list;

    public AddsAdapter(List<SimpleDraweeView> list){
        this.list = list;
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
    public Object instantiateItem(ViewGroup container,int position){

        final Adds adds= (Adds) list.get(position).getTag();

        list.get(position).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(App.getContext(), adds.getPhotoSet(), Toast.LENGTH_SHORT).show();

            }
        });
        container.addView(list.get(position));
        return list.get(position);
    }


}
