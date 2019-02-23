package accpa.extity;

import java.util.Date;

/**
 * Created by 钟家龙 on 2018-12-15.
 */
public class Msg {
    private int msgid;
    private String username;
    private String title;
    private String msgcontent;
    private int state;
    private String sendto;
    private Date msgcreatedate;

    public int getMsgid() {
        return msgid;
    }

    public void setMsgid(int msgid) {
        this.msgid = msgid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getSendto() {
        return sendto;
    }

    public void setSendto(String sendto) {
        this.sendto = sendto;
    }

    public Date getMsgcreatedate() {
        return msgcreatedate;
    }

    public void setMsgcreatedate(Date msgcreatedate) {
        this.msgcreatedate = msgcreatedate;
    }

    public Msg(int msgid, String username, String title, String msgcontent, int state, String sendto, Date msgcreatedate) {
        this.msgid = msgid;
        this.username = username;
        this.title = title;
        this.msgcontent = msgcontent;
        this.state = state;
        this.sendto = sendto;
        this.msgcreatedate = msgcreatedate;
    }

    public Msg() {

    }
}
