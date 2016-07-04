package com.feyond.mynews.adater;

import android.content.Context;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.feyond.mynews.R;
import com.feyond.mynews.model.Adds;
import com.feyond.mynews.model.NewsBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/28.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private List<NewsBean> list;
    private Context context;
    private LayoutInflater inflater;
    private static int ITEM_VIEW_CONTENT = 1;
    private static int ITEM_VIEW_ADDS = 2;
    private static int ITEM_VIEW_IMGEXTRA = 3;

    public RecyclerAdapter(List<NewsBean> list, Context context){
        this.list = list;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        RecyclerView.ViewHolder viewHolder;
        View view;
        if(viewType == ITEM_VIEW_ADDS){
            view = inflater.inflate(R.layout.recycler_adds_layout, parent, false);
        }else if(viewType == ITEM_VIEW_CONTENT){
            view = inflater.inflate(R.layout.recycler_content_layout, parent, false);
        }else{
            view = inflater.inflate(R.layout.recycler_imgextra_layout, parent, false);
        }
        viewHolder=new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position){
        NewsBean newBean = list.get(position);
        if(getItemViewType(position) == ITEM_VIEW_ADDS){
            addsBindData((RecyclerViewHolder) holder, newBean);
        }else if(getItemViewType(position) == ITEM_VIEW_CONTENT){
            contentBindData((RecyclerViewHolder) holder, newBean);
        }else{
            extraBindData((RecyclerViewHolder) holder, newBean);
        }
    }

    private void extraBindData(RecyclerViewHolder holder, NewsBean newBean){

        ((TextView)holder.getView(R.id.extra_textView_title)).setText(newBean.getTitle());
        ((TextView) holder.getView(R.id.extra_textView_source)).setText(newBean.getSource());
        ((SimpleDraweeView) holder.getView(R.id.extra_imageView_one)).setImageURI(Uri.parse(newBean.getImgsrc()));
        ((SimpleDraweeView) holder.getView(R.id.extra_imageView_two)).setImageURI(Uri.parse(newBean.getImgextra().get(0).getImgsrc()));
        ((SimpleDraweeView) holder.getView(R.id.extra_imageView_three)).setImageURI(Uri.parse(newBean.getImgextra().get(1).getImgsrc()));
    }

    private void contentBindData(RecyclerViewHolder holder, NewsBean newBean){
        Uri uri = Uri.parse(newBean.getImgsrc());
        ((SimpleDraweeView)holder.getView(R.id.cf_imageView)).setImageURI(uri);
        ((TextView) holder.getView(R.id.cf_textView_title)).setText(newBean.getTitle());
        ((TextView) holder.getView(R.id.cf_textView_digest)).setText(newBean.getDigest());
        ((TextView) holder.getView(R.id.cf_textView_source)).setText(newBean.getSource());
        ((TextView) holder.getView(R.id.cf_textView_time)).setText(newBean.getPtime());
    }

    private void addsBindData(final RecyclerViewHolder holder, NewsBean newBean){
        List<NewsBean.Ads> ads = newBean.getAds();
        List<SimpleDraweeView> list = new ArrayList<>();
        final List<String> titles = new ArrayList<>();
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setImageURI(Uri.parse(newBean.getImgsrc()));
        Adds add=new Adds();
        add.setCorver(newBean.getImgsrc());
        add.setPhotoSet(newBean.getSkipID());
        simpleDraweeView.setTag(add);
        list.add(simpleDraweeView);
        titles.add(newBean.getTitle());
        for(int i = 0; i < ads.size(); i++){
            simpleDraweeView = new SimpleDraweeView(context);
            simpleDraweeView.setImageURI(Uri.parse(ads.get(i).getImgsrc()));
            add=new Adds();
            add.setCorver(ads.get(i).getImgsrc());
            add.setPhotoSet(ads.get(i).getUrl());
            simpleDraweeView.setTag(add);
            list.add(simpleDraweeView);
            titles.add(ads.get(i).getTitle());
        }
        AddsAdapter adapter = new AddsAdapter(list);
        ((ViewPager) holder.getView(R.id.cf_viewPager_adds)).setAdapter(adapter);
        ((TextView) holder.getView(R.id.adds_title)).setText(newBean.getTitle());
        ((ViewPager) holder.getView(R.id.cf_viewPager_adds)).addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels){

            }

            @Override
            public void onPageSelected(int position){
                ((TextView) holder.getView(R.id.adds_title)).setText(titles.get(position));
            }

            @Override
            public void onPageScrollStateChanged(int state){

            }
        });
    }

    @Override
    public int getItemCount(){

        return list.size();
    }

    @Override
    public int getItemViewType(int position){
        if(list.get(position).getAds() != null){
            return ITEM_VIEW_ADDS;
        }else if(list.get(position).getImgextra() != null){
            return ITEM_VIEW_IMGEXTRA;
        }else{
            return ITEM_VIEW_CONTENT;
        }
    }

}
