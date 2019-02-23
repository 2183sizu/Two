package accpa.dao.Impl;

import accpa.dao.BaseDao;
import accpa.dao.TopicDao;
import accpa.extity.Topic;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-08.
 */
public class TopicDaoImpl extends BaseDao implements TopicDao {

    @Override
    public List<Topic> selectAll() {
        List<Topic> list=new ArrayList<>();
        conn=getConn();
        String sql="select tid,tname from topic";
        try {
            pata=conn.prepareStatement(sql);
            rs=pata.executeQuery();
            while (rs.next()){
                Topic t=new Topic();
                t.setTid(rs.getInt("tid"));
                t.setTname(rs.getString("tname"));
                list.add(t);
            }
         } catch (Exception e) {
            e.printStackTrace();
        }finally {
            close();
        }


        return list;
    }

    @Override
    public int add(Topic topic) {
        String sql="insert into topic (tname)values(?)";
        Object [] objs={
                topic.getTname()
        };
         return executeUpdate(sql,objs);
    }

    @Override
    public Topic selectid(Integer id) {
        Topic topic=new Topic();
        conn=getConn();
        String sql="select * from topic where tid=?";
        try {
           pata= conn.prepareStatement(sql);
            pata.setInt(1,id);
            rs=pata.executeQuery();
            if(rs.next()){
                topic.setTid(rs.getInt("tid"));
                topic.setTname(rs.getString("tname"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close();
        }


        return topic;
    }

    @Override
    public int update(Topic topic) {
        conn=getConn();
        String sql="update topic set tname=? where tid=?";
        Object[] objs={
                topic.getTname(),
                topic.getTid()
        };
        return executeUpdate(sql,objs);
    }

    @Override
    public int delete(Integer id) {
        conn=getConn();
        String sql="delete from topic where tid=?";
        Object[] objs={id};
        return executeUpdate(sql,objs);
    }

    @Override
    public int count() {
        int c=0;
        conn=getConn();
        String sql="select count(0) as r from topic";
        try {
            pata=conn.prepareStatement(sql);
            rs=pata.executeQuery();
            if(rs.next()){
                c=rs.getInt("r");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return c;
    }

    @Override
    public List<Topic> getPageTopic(int pageNO, int pageSize) {
        List<Topic> list=new ArrayList<>();
        conn=getConn();
        String sql="select tid,tname from topic limit ?,?";
        try {
            pata=conn.prepareStatement(sql);
            pata.setInt(1,(pageNO-1)*pageSize);
            pata.setInt(2,pageSize);
            rs=pata.executeQuery();
            while (rs.next()){
                Topic t=new Topic();
                t.setTid(rs.getInt("tid"));
                t.setTname(rs.getString("tname"));
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
