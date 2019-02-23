package accpa.util;

import accpa.extity.Topic;

import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-13.
 */
public class Page {
    //每页显示的条数,页面大小
    private int pageSize=5;
    //当前页面(第几页)
    private  int currPageNo=1;
    //总条数(查询来的)
    private  int totalCount;
    //总页数(总条数/每页显示的条数)
    private int totalPageCount=0;
    //集合(存储查询的信息)
    private List<Topic> topicList;

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrPageNo() {
        return currPageNo;
    }

    public void setCurrPageNo(int currPageNo) {
        this.currPageNo = currPageNo;
    }

    public int getTotalCount() {
        return totalCount;
    }
    //在给总条数赋值的时候，把总页数同时也计算出来
    public void setTotalCount(int totalCount) {
       this.totalCount = totalCount;
        //总条数大于0
        if(totalCount>0){
            //总条数/每页显示的条数
            this.totalPageCount=totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1;

        }
    }
}
