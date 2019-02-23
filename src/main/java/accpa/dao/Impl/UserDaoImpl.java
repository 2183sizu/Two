package accpa.dao.Impl;

import accpa.dao.BaseDao;
import accpa.dao.UserDao;
import accpa.extity.News_users;

import java.sql.SQLException;

/**
 * Created by 钟家龙 on 2018-12-08.
 */
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public News_users login(News_users news_users) {
        conn=getConn();
        String sql= "select * from news_users where uname=? and upwd=?";
        try {
            pata=conn.prepareStatement(sql);
            pata.setString(1, news_users.getUname());
            pata.setString(2, news_users.getUpwd());
            rs=pata.executeQuery();
            while(rs.next()){
                news_users.setUid(rs.getInt("uid"));
                news_users.setUname(rs.getString("uname"));
                news_users.setUpwd(rs.getString("upwd"));
             }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            close();
        }
            return news_users;





    }
}
