package com.feyond.mynews.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.feyond.mynews.R;
import com.feyond.mynews.adater.PhotoBeanRecyclerAdapter;
import com.feyond.mynews.constant.AppUrl;
import com.feyond.mynews.http.GetJsonArrayCallbackImpl;
import com.feyond.mynews.http.OkHttpUtils;
import com.feyond.mynews.model.PhotoBean;
import com.feyond.mynews.view.PhotoSetActivity;

import java.util.ArrayList;
import java.util.List;

public class PhotoBeanFragment extends Fragment{

    private static final String ARG_PARAM1 = "param1";
    private String mParam1;
    private View view;
    private List<PhotoBean> data;
    private PhotoBeanRecyclerAdapter adapter;
    private RecyclerView recyclerView;

    public PhotoBeanFragment(){

    }

    public static PhotoBeanFragment newInstance(String param1){
        PhotoBeanFragment fragment = new PhotoBeanFragment();
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
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        if(view==null){
            view = inflater.inflate(R.layout.fragment_photobean,container,false);
            initView();
        }
        return view;
    }

    private void initView(){
        recyclerView = (RecyclerView) view.findViewById(R.id.fg_photoBean_rv);
        //LinearLayoutManager manager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        GridLayoutManager manager=new GridLayoutManager(getContext(),2);
        //StaggeredGridLayoutManager manager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(manager);
        data = new ArrayList<>();
        adapter = new PhotoBeanRecyclerAdapter(data,getContext());
        recyclerView.setAdapter(adapter);
        initData();
    }

    private void initData(){
        String url=String.format(AppUrl.PHOTO,mParam1);
        OkHttpUtils.initOkHttpClient(url,PhotoBean.class);
        OkHttpUtils.addJsonArrayCallback(url, new GetJsonArrayCallbackImpl(){
            @Override
            public void getJsonArray(List list){
                data.clear();
                data.addAll(list);
                adapter.notifyDataSetChanged();
            }
        });
        adapter.setOnClickListener(new PhotoBeanRecyclerAdapter.OnClickListener(){
            @Override
            public void OnClick(View view, int position){
                String setID = data.get(position).getSetid();
                Intent intent=new Intent(getActivity(), PhotoSetActivity.class);
                Bundle bundle=new Bundle();
                bundle.putString("setID",setID);
                intent.putExtra("bundle",bundle);
                getContext().startActivity(intent);
            }
        });
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.photo_menu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }
}
