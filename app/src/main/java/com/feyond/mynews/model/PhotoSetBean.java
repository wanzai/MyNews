package com.feyond.mynews.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/7/3.
 */
public class PhotoSetBean implements Serializable{

    /**
     * postid : PHOT223O000100AN
     * series :
     * clientadurl :
     * desc : 2014年6月16日消息（具体拍摄时间不详），2年前，杨金娜的爸爸因胃癌过世。她放弃了在纽约的工作，制作了一个纸质的“爸爸”，带着“他”去看那些他生前梦想的地方。为了这次旅行，杨金娜变卖了大部分资产。
     * datatime : 2014-06-17 13:02:54
     * createdate : 2014-06-17 13:02:37
     * relatedids : []
     * scover : http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73U54GI0096.jpg
     * autoid :
     * url : http://news.163.com/photoview/00AN0001/67704.html#p=9UUC7P6A00AN0001
     * creator : huangh
     * reporter :
     * photos : [{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73K54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73K54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73K54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73K54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73K54GI0096.jpg","note":"图为在冰岛古福斯瀑布。","photoid":"9UUNK73K54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73K54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73L54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73L54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73L54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73L54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73L54GI0096.jpg","note":"图为在冰岛蓝潟湖。","photoid":"9UUNK73L54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73L54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73M54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73M54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73M54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73M54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73M54GI0096.jpg","note":"图为在冰岛盖歇尔间歇泉。","photoid":"9UUNK73M54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73M54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73N54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73N54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73N54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73N54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73N54GI0096.jpg","note":"图为在罗马斗兽场。","photoid":"9UUNK73N54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73N54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73O54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73O54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73O54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73O54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73O54GI0096.jpg","note":"图为在巴黎铁塔前。","photoid":"9UUNK73O54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73O54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73P54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73P54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73P54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73P54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73P54GI0096.jpg","note":"图为在巴黎卢浮宫。","photoid":"9UUNK73P54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73P54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73Q54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73Q54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73Q54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73Q54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73Q54GI0096.jpg","note":"图为在意大利比萨斜塔。","photoid":"9UUNK73Q54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73Q54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73R54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73R54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73R54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73R54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73R54GI0096.jpg","note":"图为史克卡瀑布。","photoid":"9UUNK73R54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73R54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73S54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73S54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73S54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73S54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73S54GI0096.jpg","note":"图为在伦敦圣保罗教堂。","photoid":"9UUNK73S54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73S54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73T54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73T54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73T54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73T54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73T54GI0096.jpg","note":"小时候的金娜和爸爸。","photoid":"9UUNK73T54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73T54GI0096.jpg"},{"timgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73U54GI0096.jpg","photohtml":"http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73U54GI0096","newsurl":"#","squareimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73U54GI0096.jpg","cimgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73U54GI0096.jpg","imgtitle":"","simgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73U54GI0096.jpg","note":"小时候的金娜和爸爸。金娜的爸爸17岁时移民美国，为了生计，他曾辛苦地打过零工、做过些小生意。金娜说，爸爸曾经经营一家干洗店，一周工作六天，每天12个小时。","photoid":"9UUNK73U54GI0096","imgurl":"http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73U54GI0096.jpg"}]
     * setname : 女孩携去世父亲画像环游世界
     * cover : http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73U54GI0096.jpg
     * commenturl : http://comment.help.3g.163.com/photoview_bbs/PHOT223O000100AN.html
     * source :
     * settag : 去世，父亲，环游世界
     * boardid : photoview_bbs
     * tcover : http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73U54GI0096.jpg
     * imgsum : 11
     */

    private String postid;
    private String series;
    private String clientadurl;
    private String desc;
    private String datatime;
    private String createdate;
    private String scover;
    private String autoid;
    private String url;
    private String creator;
    private String reporter;
    private String setname;
    private String cover;
    private String commenturl;
    private String source;
    private String settag;
    private String boardid;
    private String tcover;
    private String imgsum;
    private List<?> relatedids;
    /**
     * timgurl : http://img3.cache.netease.com/photo/0096/2014-06-17/t_9UUNK73K54GI0096.jpg
     * photohtml : http://help.3g.163.com/photoview/54GI0096/42357.html#p=9UUNK73K54GI0096
     * newsurl : #
     * squareimgurl : http://img3.cache.netease.com/photo/0096/2014-06-17/400x400_9UUNK73K54GI0096.jpg
     * cimgurl : http://img3.cache.netease.com/photo/0096/2014-06-17/c_9UUNK73K54GI0096.jpg
     * imgtitle :
     * simgurl : http://img3.cache.netease.com/photo/0096/2014-06-17/s_9UUNK73K54GI0096.jpg
     * note : 图为在冰岛古福斯瀑布。
     * photoid : 9UUNK73K54GI0096
     * imgurl : http://img3.cache.netease.com/photo/0096/2014-06-17/9UUNK73K54GI0096.jpg
     */

    private List<Photos> photos;

    public String getPostid(){
        return postid;
    }

    public void setPostid(String postid){
        this.postid = postid;
    }

    public String getSeries(){
        return series;
    }

    public void setSeries(String series){
        this.series = series;
    }

    public String getClientadurl(){
        return clientadurl;
    }

    public void setClientadurl(String clientadurl){
        this.clientadurl = clientadurl;
    }

    public String getDesc(){
        return desc;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getDatatime(){
        return datatime;
    }

    public void setDatatime(String datatime){
        this.datatime = datatime;
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

    public String getAutoid(){
        return autoid;
    }

    public void setAutoid(String autoid){
        this.autoid = autoid;
    }

    public String getUrl(){
        return url;
    }

    public void setUrl(String url){
        this.url = url;
    }

    public String getCreator(){
        return creator;
    }

    public void setCreator(String creator){
        this.creator = creator;
    }

    public String getReporter(){
        return reporter;
    }

    public void setReporter(String reporter){
        this.reporter = reporter;
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

    public String getCommenturl(){
        return commenturl;
    }

    public void setCommenturl(String commenturl){
        this.commenturl = commenturl;
    }

    public String getSource(){
        return source;
    }

    public void setSource(String source){
        this.source = source;
    }

    public String getSettag(){
        return settag;
    }

    public void setSettag(String settag){
        this.settag = settag;
    }

    public String getBoardid(){
        return boardid;
    }

    public void setBoardid(String boardid){
        this.boardid = boardid;
    }

    public String getTcover(){
        return tcover;
    }

    public void setTcover(String tcover){
        this.tcover = tcover;
    }

    public String getImgsum(){
        return imgsum;
    }

    public void setImgsum(String imgsum){
        this.imgsum = imgsum;
    }

    public List<?> getRelatedids(){
        return relatedids;
    }

    public void setRelatedids(List<?> relatedids){
        this.relatedids = relatedids;
    }

    public List<Photos> getPhotos(){
        return photos;
    }

    public void setPhotos(List<Photos> photos){
        this.photos = photos;
    }

    public static class Photos implements  Serializable{
        private String timgurl;
        private String photohtml;
        private String newsurl;
        private String squareimgurl;
        private String cimgurl;
        private String imgtitle;
        private String simgurl;
        private String note;
        private String photoid;
        private String imgurl;

        public String getTimgurl(){
            return timgurl;
        }

        public void setTimgurl(String timgurl){
            this.timgurl = timgurl;
        }

        public String getPhotohtml(){
            return photohtml;
        }

        public void setPhotohtml(String photohtml){
            this.photohtml = photohtml;
        }

        public String getNewsurl(){
            return newsurl;
        }

        public void setNewsurl(String newsurl){
            this.newsurl = newsurl;
        }

        public String getSquareimgurl(){
            return squareimgurl;
        }

        public void setSquareimgurl(String squareimgurl){
            this.squareimgurl = squareimgurl;
        }

        public String getCimgurl(){
            return cimgurl;
        }

        public void setCimgurl(String cimgurl){
            this.cimgurl = cimgurl;
        }

        public String getImgtitle(){
            return imgtitle;
        }

        public void setImgtitle(String imgtitle){
            this.imgtitle = imgtitle;
        }

        public String getSimgurl(){
            return simgurl;
        }

        public void setSimgurl(String simgurl){
            this.simgurl = simgurl;
        }

        public String getNote(){
            return note;
        }

        public void setNote(String note){
            this.note = note;
        }

        public String getPhotoid(){
            return photoid;
        }

        public void setPhotoid(String photoid){
            this.photoid = photoid;
        }

        public String getImgurl(){
            return imgurl;
        }

        public void setImgurl(String imgurl){
            this.imgurl = imgurl;
        }
    }
}
