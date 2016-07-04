package com.feyond.mynews.http;

import java.util.List;

/**
 * Created by Administrator on 2016/6/29.
 */
public class ResponseResult{

    private String url;
    private List list;
    private Object object;
    public ResponseResult(String url, List list){
        this.url = url;
        this.list = list;
    }

    public ResponseResult(){
    }

    public List getList(){
        return list;
    }

    public void setList(List list){
        this.list = list;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public Object getObject(){
        return object;
    }

    public void setObject(Object object){
        this.object = object;
    }
}
