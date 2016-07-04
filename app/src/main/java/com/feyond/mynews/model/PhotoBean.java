package com.feyond.mynews.model;

import java.util.List;

/**
 * Created by Administrator on 2016/7/2.
 */
public class PhotoBean{

    /**
     * desc : 足球场上有很多流泪的理由，胜利了会流泪，失败了会流泪，缅怀亲人会流泪，告别球场会流泪，难以掩饰内心的激动也会流泪。5种足坛的不同泪水，总有一种会触动你的内心。
     * pvnum :
     * createdate : 2014-06-20 08:06:37
     * scover : http://img4.cache.netease.com/photo/0096/2014-06-20/s_9V5TSB1T55ON0096.jpg
     * setname : 5种英雄泪:郑大世经典 小贝告别
     * cover : http://img4.cache.netease.com/photo/0096/2014-06-20/9V5TSB1T55ON0096.jpg
     * pics : ["http://img4.cache.netease.com/photo/0096/2014-06-20/9V5TSB1Q55ON0096.jpg","http://img4.cache.netease.com/photo/0096/2014-06-20/9V5TSB1R55ON0096.jpg","http://img4.cache.netease.com/photo/0096/2014-06-20/9V5TSB1S55ON0096.jpg"]
     * clientcover1 : http://img4.cache.netease.com/photo/0096/2014-06-20/9V5TSB1T55ON0096.jpg
     * replynum : 2229
     * topicname :
     * setid : 42575
     * seturl : http://help.3g.163.com/photoview/55ON0096/42575.html
     * datetime : 2014-06-20 09:57:58
     * clientcover : http://img4.cache.netease.com/photo/0096/2014-06-20/400x400_9V5TTG1M55ON0096.jpg
     * imgsum : 33
     * tcover : http://img4.cache.netease.com/photo/0096/2014-06-20/t_9V5TSB1T55ON0096.jpg
     */

    private String desc;
    private String pvnum;
    private String createdate;
    private String scover;
    private String setname;
    private String cover;
    private String clientcover1;
    private String replynum;
    private String topicname;
    private String setid;
    private String seturl;
    private String datetime;
    private String clientcover;
    private String imgsum;
    private String tcover;
    private List<String> pics;

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getPvnum(){
        return pvnum;
    }

    public void setPvnum(String pvnum){
        this.pvnum = pvnum;
    }

    public String getCreatedate(){
        return createdate;
    }

    public void setCreatedate(String createdate){
        this.createdate = createdate;
    }

    public String getScover(){
        return scover;
    }

    public void setScover(String scover){
        this.scover = scover;
    }

    public String getSetname(){
        return setname;
    }

    public void setSetname(String setname){
        this.setname = setname;
    }

    public String getCover(){
        return cover;
    }

    public void setCover(String cover){
        this.cover = cover;
    }

    public String getClientcover1(){
        return clientcover1;
    }

    public void setClientcover1(String clientcover1){
        this.clientcover1 = clientcover1;
    }

    public String getReplynum(){
        return replynum;
    }

    public void setReplynum(String replynum){
        this.replynum = replynum;
    }

    public String getTopicname(){
        return topicname;
    }

    public void setTopicname(String topicname){
        this.topicname = topicname;
    }

    public String getSetid(){
        return setid;
    }

    public void setSetid(String setid){
        this.setid = setid;
    }

    public String getSeturl(){
        return seturl;
    }

    public void setSeturl(String seturl){
        this.seturl = seturl;
    }

    public String getDatetime(){
        return datetime;
    }

    public void setDatetime(String datetime){
        this.datetime = datetime;
    }

    public String getClientcover(){
        return clientcover;
    }

    public void setClientcover(String clientcover){
        this.clientcover = clientcover;
    }

    public String getImgsum(){
        return imgsum;
    }

    public void setImgsum(String imgsum){
        this.imgsum = imgsum;
    }

    public String getTcover(){
        return tcover;
    }

    public void setTcover(String tcover){
        this.tcover = tcover;
    }

    public List<String> getPics(){
        return pics;
    }

    public void setPics(List<String> pics){
        this.pics = pics;
    }
}
