package accpa.dao.Impl;

import accpa.dao.BaseDao;
import accpa.dao.MsgDao;
import accpa.extity.Msg;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by 钟家龙 on 2018-12-15.
 */
public class MsgDaoImpl extends BaseDao implements MsgDao {
    @Override
    public List<Msg> getMsg(Map<String, Object> map) {
        List<Msg> list=new ArrayList<>();
        conn=getConn();
        Integer page_no=(Integer) map.get("page_no");//page_no第几页
        Integer pagesize=(Integer) map.get("pagesize");//每页显示的条数
        Integer msgid=(Integer) map.get("msgid");//编号
        String uname=(String) map.get("msgname");
        String title=(String) map.get("title");
        String  sendto=(String) map.get("sendto");


        String sql="select msgid,username,title,msgcontent,state,sendto,msg_create_date from msg where 1=1 ";
        try {
            pata=conn.prepareStatement(sql);
            rs=pata.executeQuery();
            while(rs.next()){
                int id=rs.getInt("msgid");
                String username=rs.getString("username");
                String titlea=rs.getString("title");
                String content=rs.getString("msgcontent");
                int state=rs.getInt("state");
                String sendtoa=rs.getString("sendto");
                 Date time=rs.getTime("msgcreatedate");
                 Msg msg=new Msg(id,username,title,content,state,sendto,time);
                 list.add(msg);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
