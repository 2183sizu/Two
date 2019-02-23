package accpa.service.Impl;

import accpa.dao.Impl.UserInfoDaoImpl;
import accpa.dao.UserInfoDao;
import accpa.extity.UserInfo;
import accpa.service.UserInfoServic;

/**
 * Created by 钟家龙 on 2018-12-15.
 */
public class UserInfoServiceImpl implements UserInfoServic {
    UserInfoDao userInfoDao=new UserInfoDaoImpl();


    @Override
    public boolean login(UserInfo u) {
        if(userInfoDao.login(u)==0){
            return false;
        }
        return true;
    }
}
