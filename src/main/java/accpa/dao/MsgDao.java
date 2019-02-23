package accpa.dao;

import accpa.extity.Msg;

import java.util.List;
import java.util.Map;

/**
 * Created by 钟家龙 on 2018-12-15.
 */
public interface MsgDao {
    public List<Msg> getMsg(Map<String,Object> map);
}
