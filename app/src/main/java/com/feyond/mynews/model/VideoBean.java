package com.feyond.mynews.model;

/**
 * Created by Administrator on 2016/7/3.
 */
public class VideoBean{

    /**
     * topicImg : http://vimg2.ws.126.net/image/snapshot/2016/3/A/2/VBH9EOBA2.jpg
     * replyCount : 0
     * videosource : 新媒体
     * mp4Hd_url : null
     * topicDesc : 关注大师有惊喜哦！
     * topicSid : VBH9EOB9V
     * cover : http://vimg2.ws.126.net/image/snapshot/2016/7/V/7/VBQ4F5IV7.jpg
     * title : 想想当年追《高达SEED》时候如痴如醉
     * playCount : 14203
     * replyBoard : video_bbs
     * videoTopic : {"alias":"关注大师有惊喜哦！","tname":"动漫大师","ename":"T1460515713403","tid":"T1460515713403"}
     * sectiontitle :
     * replyid : BQ454OTD008535RB
     * description : 想想当年追《高达SEED》时候如痴如醉
     * mp4_url : http://flv2.bn.netease.com/tvmrepo/2016/7/J/L/EBQ454BJL/SD/EBQ454BJL-mobile.mp4
     * length : 304
     * playersize : 0
     * m3u8Hd_url : null
     * vid : VBQ454OTD
     * m3u8_url : http://flv2.bn.netease.com/tvmrepo/2016/7/J/L/EBQ454BJL/SD/movie_index.m3u8
     * ptime : 2016-07-03 10:46:53
     * topicName : 动漫大师
     */

    private String topicImg;
    private int replyCount;
    private String videosource;
    private Object mp4Hd_url;
    private String topicDesc;
    private String topicSid;
    private String cover;
    private String title;
    private int playCount;
    private String replyBoard;
    /**
     * alias : 关注大师有惊喜哦！
     * tname : 动漫大师
     * ename : T1460515713403
     * tid : T1460515713403
     */

    private VideoTopic videoTopic;
    private String sectiontitle;
    private String replyid;
    private String description;
    private String mp4_url;
    private int length;
    private int playersize;
    private Object m3u8Hd_url;
    private String vid;
    private String m3u8_url;
    private String ptime;
    private String topicName;

    public String getTopicImg(){
        return topicImg;
    }

    public void setTopicImg(String topicImg){
        this.topicImg = topicImg;
    }

    public int getReplyCount(){
        return replyCount;
    }

    public void setReplyCount(int replyCount){
        this.replyCount = replyCount;
    }

    public String getVideosource(){
        return videosource;
    }

    public void setVideosource(String videosource){
        this.videosource = videosource;
    }

    public Object getMp4Hd_url(){
        return mp4Hd_url;
    }

    public void setMp4Hd_url(Object mp4Hd_url){
        this.mp4Hd_url = mp4Hd_url;
    }

    public String getTopicDesc(){
        return topicDesc;
    }

    public void setTopicDesc(String topicDesc){
        this.topicDesc = topicDesc;
    }

    public String getTopicSid(){
        return topicSid;
    }

    public void setTopicSid(String topicSid){
        this.topicSid = topicSid;
    }

    public String getCover(){
        return cover;
    }

    public void setCover(String cover){
        this.cover = cover;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getPlayCount(){
        return playCount;
    }

    public void setPlayCount(int playCount){
        this.playCount = playCount;
    }

    public String getReplyBoard(){
        return replyBoard;
    }

    public void setReplyBoard(String replyBoard){
        this.replyBoard = replyBoard;
    }

    public VideoTopic getVideoTopic(){
        return videoTopic;
    }

    public void setVideoTopic(VideoTopic videoTopic){
        this.videoTopic = videoTopic;
    }

    public String getSectiontitle(){
        return sectiontitle;
    }

    public void setSectiontitle(String sectiontitle){
        this.sectiontitle = sectiontitle;
    }

    public String getReplyid(){
        return replyid;
    }

    public void setReplyid(String replyid){
        this.replyid = replyid;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getMp4_url(){
        return mp4_url;
    }

    public void setMp4_url(String mp4_url){
        this.mp4_url = mp4_url;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public int getPlayersize(){
        return playersize;
    }

    public void setPlayersize(int playersize){
        this.playersize = playersize;
    }

    public Object getM3u8Hd_url(){
        return m3u8Hd_url;
    }

    public void setM3u8Hd_url(Object m3u8Hd_url){
        this.m3u8Hd_url = m3u8Hd_url;
    }

    public String getVid(){
        return vid;
    }

    public void setVid(String vid){
        this.vid = vid;
    }

    public String getM3u8_url(){
        return m3u8_url;
    }

    public void setM3u8_url(String m3u8_url){
        this.m3u8_url = m3u8_url;
    }

    public String getPtime(){
        return ptime;
    }

    public void setPtime(String ptime){
        this.ptime = ptime;
    }

    public String getTopicName(){
        return topicName;
    }

    public void setTopicName(String topicName){
        this.topicName = topicName;
    }

    public static class VideoTopic{
        private String alias;
        private String tname;
        private String ename;
        private String tid;

        public String getAlias(){
            return alias;
        }

        public void setAlias(String alias){
            this.alias = alias;
        }

        public String getTname(){
            return tname;
        }

        public void setTname(String tname){
            this.tname = tname;
        }

        public String getEname(){
            return ename;
        }

        public void setEname(String ename){
            this.ename = ename;
        }

        public String getTid(){
            return tid;
        }

        public void setTid(String tid){
            this.tid = tid;
        }
    }
}
