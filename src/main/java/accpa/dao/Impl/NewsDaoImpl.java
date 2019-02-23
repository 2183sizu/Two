package accpa.dao.Impl;

import accpa.dao.BaseDao;
import accpa.dao.NewsDao;
import accpa.extity.News;
import accpa.extity.Topic;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-10.
 */
public class NewsDaoImpl extends BaseDao implements NewsDao {
/*
    @Override
    public List<News> selectAll() {
        List<News> list=new ArrayList<>();
       conn=getConn();
       String sql="select nid,ntid,ntitle,nauthor,ncontent,nsummary from news";
        try {
            pata=conn.prepareStatement(sql);
            rs=pata.executeQuery();
            while (rs.next()){
                News ns=new News();
                ns.setNid(rs.getInt("nid"));
                ns.setNtid(rs.getInt("ntid"));
                ns.setNtitle(rs.getString("ntitle"));
                ns.setNauthor(rs.getString("nauthor"));
                ns.setNcontent(rs.getString("ncontent"));
                ns.setNsummary(rs.getString("nsummary"));
                list.add(ns);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close();
        }


        return list;
    }*/

    @Override
    public List<News> selectNewsAll() {
        List<News> list=new ArrayList<>();
        conn=getConn();
        String sql="select nid,tid,tname,ntitle,nauthor,ncontent,nsummary from news inner join topic on topic.tid=news.ntid";
        try {
            pata=conn.prepareStatement(sql);
            rs=pata.executeQuery();
            while (rs.next()){
                News ns=new News();
                Topic topic=new Topic();
                ns.setNid(rs.getInt("nid"));
                topic.setTid(rs.getInt("tid"));
                topic.setTname(rs.getString("tname"));
                ns.setTopic(topic);
                ns.setNtitle(rs.getString("ntitle"));
                ns.setNauthor(rs.getString("nauthor"));
                ns.setNcontent(rs.getString("ncontent"));
                ns.setNsummary(rs.getString("nsummary"));
                list.add(ns);
 }
        } catch (Exception e) {
            e.printStackTrace();
        }
     return list ;
    }

    @Override
    public List<News> selectNewsByTid(Integer id) {
        List<News> list=new ArrayList<>();
        conn=getConn();
        String sql="select nid,tid,tname,ntitle,nauthor,ncontent,nsummary from news inner join topic on topic.tid=news.ntid where tid=?";

        try {
            pata=conn.prepareStatement(sql);
            pata.setInt(1,id);
            rs=pata.executeQuery();
            while (rs.next()){
                News ns=new News();
                Topic topic=new Topic();
                ns.setNid(rs.getInt("nid"));
                topic.setTid(rs.getInt("tid"));
                topic.setTname(rs.getString("tname"));
                ns.setTopic(topic);
                ns.setNtitle(rs.getString("ntitle"));
                ns.setNauthor(rs.getString("nauthor"));
                ns.setNcontent(rs.getString("ncontent"));
                ns.setNsummary(rs.getString("nsummary"));
                list.add(ns);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list ;
    }

    @Override
    public int delete(Integer id) {
        conn=getConn();
        String sql="delete from news where nid=?";
        Object[] objs={id};

        return executeUpdate(sql,objs);
    }
}
