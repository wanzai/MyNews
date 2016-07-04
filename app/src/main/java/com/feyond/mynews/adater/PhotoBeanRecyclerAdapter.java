package com.feyond.mynews.adater;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.facebook.drawee.view.SimpleDraweeView;
import com.feyond.mynews.R;
import com.feyond.mynews.model.PhotoBean;

import java.util.List;

/**
 * Created by Administrator on 2016/7/2.
 */
public class PhotoBeanRecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder>{
    private List<PhotoBean> list;
    private Context context;
    private LayoutInflater inflater;
    private OnClickListener onClickListener;
    public PhotoBeanRecyclerAdapter(List<PhotoBean> list, Context context){
        this.list = list;
        this.context = context;
        this.inflater =LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view=inflater.inflate(R.layout.photobean_recyler_adapter,parent,false);
        final RecyclerViewHolder holder = new RecyclerViewHolder(view);
        view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onClickListener.OnClick(v,holder.getLayoutPosition());
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position){
        Uri uri=Uri.parse(list.get(position).getCover());
        ((SimpleDraweeView) holder.getView(R.id.img_photoBean_recycler)).setImageURI(uri);
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
