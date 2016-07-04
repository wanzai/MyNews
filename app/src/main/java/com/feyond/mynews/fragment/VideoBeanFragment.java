package com.feyond.mynews.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feyond.mynews.R;
import com.feyond.mynews.adater.VideoBeanRecyclerAdapter;
import com.feyond.mynews.constant.AppUrl;
import com.feyond.mynews.http.GetJsonArrayCallbackImpl;
import com.feyond.mynews.http.OkHttpUtils;
import com.feyond.mynews.model.VideoBean;
import com.feyond.mynews.view.VideoPlayActivity;

import java.util.ArrayList;
import java.util.List;

public class VideoBeanFragment extends Fragment{
    private static final String ARG_PARAM1 = "param1";
    private String mParam1;
    private View view;
    private RecyclerView recyclerView;
    private int page = 0;
    private List<VideoBean> beans;
    private VideoBeanRecyclerAdapter adapter;

    public VideoBeanFragment(){
    }

    public static VideoBeanFragment newInstance(String param1){
        VideoBeanFragment fragment = new VideoBeanFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            mParam1 = getArguments().getString(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if(view == null){
            view = inflater.inflate(R.layout.fragment_videobean, container, false);
            initView();
            addOnclickListener();
        }
        return view;
    }

    private void initView(){
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView = (RecyclerView) view.findViewById(R.id.fg_videoBean_recyclerView);
        recyclerView.setLayoutManager(manager);
        beans = new ArrayList<>();
        adapter = new VideoBeanRecyclerAdapter(beans,getContext());
        recyclerView.setAdapter(adapter);
        initData(page);
    }

    private void initData(int page){
        String url= AppUrl.VIDEO+mParam1+"/"+page+AppUrl.VIDEO_END;
        OkHttpUtils.initOkHttpClient(url,VideoBean.class,mParam1);
        OkHttpUtils.addJsonArrayCallback(url, new GetJsonArrayCallbackImpl(){
            @Override
            public void getJsonArray(List list){
                beans.addAll(list);
                adapter.notifyDataSetChanged();
            }
        });
    }
    private void addOnclickListener(){
        adapter.setOnClickListener(new VideoBeanRecyclerAdapter.OnClickListener(){
            @Override
            public void OnClick(View view, int position){
                Intent intent=new Intent(getActivity(), VideoPlayActivity.class);
                intent.putExtra("url",beans.get(position).getMp4_url());
                getContext().startActivity(intent);
            }
        });
    }
}
