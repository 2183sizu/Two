package accpa.extity;

import java.io.Serializable;

/**类别
 * Created by 钟家龙 on 2018-12-08.
 */
public class Topic implements Serializable {
    private Integer tid;
    private String tname;

    public Topic(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public Topic() {

    }

    public Integer getTid() {

        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
}
