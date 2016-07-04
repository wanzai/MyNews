package com.feyond.mynews.constant;

/**
 * Created by Administrator on 2016/7/1.
 */
public class Config{
    public static int INDEX_NEWS=0;
    public static  int INDEX_PHOTO=1;
    public static int INDEX_VIDEO=2;
    public static int INDEX_ME=3;
    public static int RESPONSE_STRING=1;
    public static int RESPONSE_JSON_OBJECT=2;
    public static int RESPONSE_JSON_ARRAY=4;
    public static int RESPONSE_STREAM=3;
    public static String[] NEWS_DEFAULT_TITLES={"头条","娱乐","体育","电影","科技","汽车","时尚","教育","轻松一刻"};
    public static String[] NEWS_DEFAULT_URLID={AppUrl.HEADLINE_ID,AppUrl.ENTERTAINMENT_ID,
            AppUrl.SPORTS_ID,AppUrl.MOVIE_ID,
            AppUrl.TECH_ID,AppUrl.CAR_ID,AppUrl.FASHION_ID,
            AppUrl.EDUCATION_ID,AppUrl.JOKE_ID};
    public static String[]  PHOTO_DEFAULT_TITLES={"精选","热点","独家","明星","美图"};
    public  static String[] PHOTO_DEFAULT_URLID={AppUrl.PHOTO_SELECTION,AppUrl.PHOTO_HOT,AppUrl.PHOTO_EXCLUSIVE,AppUrl.PHOTO_STAR,AppUrl.PHOTO_PRETTY};
    public static String[]  VIDEO_DEFAULT_TITLES={"新闻现场","体育视频","音乐视频","搞笑视频","美女帅哥"};
    public  static String[] VIDEO_DEFAULT_URLID={AppUrl.VIDEO_NEWS,AppUrl.VIDEO_SPORT,AppUrl.VIDEO_MUSIC,AppUrl.VIDEO_FUN,AppUrl.VIDEO_BEAUTY};

}
