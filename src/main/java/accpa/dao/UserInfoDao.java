package accpa.dao;

import accpa.extity.UserInfo;

/**
 * Created by 钟家龙 on 2018-12-15.
 */
public interface UserInfoDao {
    /**
     * 查询用户是否存在
     * @param userInfo
     * @return
     */
    int login(UserInfo userInfo);
}
