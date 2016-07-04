package com.feyond.mynews.http;

import android.os.Handler;
import android.os.Message;

import com.alibaba.fastjson.JSON;
import com.feyond.mynews.constant.Config;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by Administrator on 2016/6/29.
 */
public class OkHttpUtils{
    private static Map<String, GetJsonArrayCallbackImpl> jsonArrayCallbacks = new HashMap<>();
    private static Map<String, GetJsonObjectCallbackImpl> jsonObjectCallbacks = new HashMap<>();
    private static OkHttpClient client;
    private static Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg){
            int what = msg.what;
            if(what == Config.RESPONSE_JSON_ARRAY){
                ResponseResult result = (ResponseResult) msg.obj;
                GetJsonArrayCallbackImpl callback = jsonArrayCallbacks.get(result.getUrl());
                if(callback != null){
                    callback.getJsonArray(result.getList());
                    jsonArrayCallbacks.remove(result.getUrl());
                }
            }
            if(what == Config.RESPONSE_JSON_OBJECT){
                ResponseResult result = (ResponseResult) msg.obj;
                GetJsonObjectCallbackImpl callback = jsonObjectCallbacks.get(result.getUrl());
                if(callback != null){
                    callback.getJsonObject(result.getObject());
                    jsonObjectCallbacks.remove(result.getUrl());
                }
            }
        }
    };

    private static OkHttpClient getClientInstance(){
        if(client == null){
            synchronized(OkHttpUtils.class){
                if(client == null){
                    client = new OkHttpClient.Builder().connectTimeout(5000, TimeUnit.MILLISECONDS).readTimeout(5000, TimeUnit.MILLISECONDS).build();
                }
            }
        }
        return client;
    }

    public static void initOkHttpClient(final String url, final Class<? extends Object> clazz, final String id){
        client = getClientInstance();
        Request request = new Request.Builder().url(url).build();
        okhttp3.Call call = client.newCall(request);
        call.enqueue(new Callback(){
            @Override
            public void onFailure(Call call, IOException e){
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException{
                try{
                    JSONObject object = new JSONObject(response.body().string());
                    JSONArray array = object.getJSONArray(id);
                    List<?> list = JSON.parseArray(array.toString(), clazz);
                    ResponseResult result = new ResponseResult(url, list);
                    Message msg = mHandler.obtainMessage();
                    msg.obj = result;
                    msg.what = Config.RESPONSE_JSON_ARRAY;
                    mHandler.sendMessage(msg);
                }catch(JSONException e){
                    e.printStackTrace();
                }
            }
        });
    }

    public static void initOkHttpClient(final String url, final Class<? extends Object> clazz){
        client = getClientInstance();
        Request request = new Request.Builder().url(url).build();
        okhttp3.Call call = client.newCall(request);
        call.enqueue(new Callback(){
            @Override
            public void onFailure(Call call, IOException e){
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException{
                List<?> list = JSON.parseArray(response.body().string(), clazz);
                ResponseResult result = new ResponseResult(url, list);
                Message msg = mHandler.obtainMessage();
                msg.obj = result;
                msg.what = Config.RESPONSE_JSON_ARRAY;
                mHandler.sendMessage(msg);
            }
        });
    }

    public static void getJsonObject(final String url, final Class<? extends Object> clazz){
        client = getClientInstance();
        final Request request = new Request.Builder().url(url).build();
        okhttp3.Call call = client.newCall(request);
        call.enqueue(new Callback(){
            @Override
            public void onFailure(Call call, IOException e){
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException{
                Object object = JSON.parseObject(response.body().string(), clazz);
                ResponseResult result = new ResponseResult();
                result.setUrl(url);
                result.setObject(object);
                Message msg = mHandler.obtainMessage();
                msg.obj = result;
                msg.what = Config.RESPONSE_JSON_OBJECT;
                mHandler.sendMessage(msg);
            }
        });
    }

    public static void addJsonArrayCallback(String key, GetJsonArrayCallbackImpl callback){
        jsonArrayCallbacks.put(key, callback);
    }

    public static void addJsonObjectCallback(String key, GetJsonObjectCallbackImpl callback){
        jsonObjectCallbacks.put(key, callback);
    }
}
