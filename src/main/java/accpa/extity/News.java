package accpa.extity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 钟家龙 on 2018-12-10.
 */
public class News implements Serializable{
    private Topic topic;//实体对象
    private Integer nid;  //序号
    //private Integer ntid;   //新闻类型
    private String ntitle;  //新闻标题
    private String nauthor; //新闻作者
    private Date ncreatedate;//写作时间
    private String ncontent;//新闻网址
    private Date nmodifyDate;//发布时间
    private String nsummary;//新闻内容

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    public String getNauthor() {
        return nauthor;
    }

    public void setNauthor(String nauthor) {
        this.nauthor = nauthor;
    }

    public Date getNcreatedate() {
        return ncreatedate;
    }

    public void setNcreatedate(Date ncreatedate) {
        this.ncreatedate = ncreatedate;
    }

    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    public Date getNmodifyDate() {
        return nmodifyDate;
    }

    public void setNmodifyDate(Date nmodifyDate) {
        this.nmodifyDate = nmodifyDate;
    }

    public String getNsummary() {
        return nsummary;
    }

    public void setNsummary(String nsummary) {
        this.nsummary = nsummary;
    }

    public News() {

    }

    public News(Topic topic, Integer nid, String ntitle, String nauthor, Date ncreatedate, String ncontent, Date nmodifyDate, String nsummary) {
        this.topic = topic;
        this.nid = nid;
        this.ntitle = ntitle;
        this.nauthor = nauthor;
        this.ncreatedate = ncreatedate;
        this.ncontent = ncontent;
        this.nmodifyDate = nmodifyDate;
        this.nsummary = nsummary;
    }
}
