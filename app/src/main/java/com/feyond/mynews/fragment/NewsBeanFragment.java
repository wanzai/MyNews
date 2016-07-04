package com.feyond.mynews.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feyond.mynews.R;
import com.feyond.mynews.adater.RecyclerAdapter;
import com.feyond.mynews.constant.AppUrl;
import com.feyond.mynews.http.GetJsonArrayCallbackImpl;
import com.feyond.mynews.http.OkHttpUtils;
import com.feyond.mynews.model.NewsBean;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewsBeanFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NewsBeanFragment extends Fragment{

    private static final String ARG_PARAM1 = "param1";
    private String mParam1;
    private View view;
    private int page=0;
    private List<NewsBean> beans;
    private RecyclerAdapter adapter;
    private RecyclerView recyclerView;

    public NewsBeanFragment(){

    }
    public static NewsBeanFragment newInstance(String param1){
        NewsBeanFragment fragment = new NewsBeanFragment();
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
        if(view==null){
            view = inflater.inflate(R.layout.fragment_newsbean,container,false);
            initView();
        }
        return view;
    }

    private void initView(){
        LinearLayoutManager manager=new LinearLayoutManager(getContext());
        recyclerView = (RecyclerView) view.findViewById(R.id.fg_newsBean_recyclerView);
        recyclerView.setLayoutManager(manager);
        beans = new ArrayList<>();
        adapter = new RecyclerAdapter(beans,getContext());
        recyclerView.setAdapter(adapter);
        initData(page);
    }

    private void initData(int page){
        String url= AppUrl.TopUrl + mParam1 + "/" + page + AppUrl.endUrl;
        OkHttpUtils.initOkHttpClient(url,NewsBean.class,mParam1);
        OkHttpUtils.addJsonArrayCallback(url,new GetJsonArrayCallbackImpl(){
            @Override
            public void getJsonArray(List list){
                beans.addAll(list);
                adapter.notifyDataSetChanged();
            }
        });
    }
}
