package com.feyond.mynews.adater;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/**
 * Created by Administrator on 2016/7/1.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder{
    private View mItemView;

    public RecyclerViewHolder(View itemView){
        super(itemView);
        this.mItemView = itemView;
    }

    public View getView(int viewId){
        return mItemView.findViewById(viewId);
    }
}
