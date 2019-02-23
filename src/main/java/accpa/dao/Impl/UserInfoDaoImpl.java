package accpa.dao.Impl;

import accpa.dao.BaseDao;
import accpa.dao.UserInfoDao;
import accpa.extity.UserInfo;

import java.sql.SQLException;

/**
 * Created by 钟家龙 on 2018-12-15.
 */
public class    UserInfoDaoImpl extends BaseDao implements UserInfoDao {
    @Override
    public int login(UserInfo userInfo) {
        conn=getConn();
        int count=0;
        String sql="select count(0) as r from msg_userinfo where username=? and password=?";
       try {

            pata=conn.prepareStatement(sql);
            pata.setString(1,userInfo.getUsername());
            pata.setString(2,userInfo.getPassword());
            rs=pata.executeQuery();
            while(rs.next()){
                count=rs.getInt("r");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close();
        }
        return count;
    }
}
