package com.feyond.mynews.adater;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.feyond.mynews.R;
import com.feyond.mynews.model.VideoBean;

import java.util.List;

/**
 * Created by Administrator on 2016/7/3.
 */
public class VideoBeanRecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{
    private List<VideoBean> list;
    private Context context;
    private LayoutInflater inflater;
    private OnClickListener onClickListener;
    public VideoBeanRecyclerAdapter(List<VideoBean> list, Context context){
        this.list = list;
        this.context = context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view=inflater.inflate(R.layout.videobean_recycler_adaper,parent,false);
        final RecyclerViewHolder holder=new RecyclerViewHolder(view);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(onClickListener!=null){
                    onClickListener.OnClick(v, holder.getLayoutPosition());
                }
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position){
        Uri url=Uri.parse(list.get(position).getCover());
        ((SimpleDraweeView) holder.getView(R.id.image_video_recycler)).setImageURI(url);
        ((TextView) holder.getView(R.id.title_video_textView)).setText(list.get(position).getTitle());
    }

    @Override
    public int getItemCount(){
        return list.size();
    }
    public interface OnClickListener{
        void OnClick(View view,int position);
    }
    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener=onClickListener;
    }
}
