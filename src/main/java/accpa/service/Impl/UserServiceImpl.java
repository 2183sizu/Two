package accpa.service.Impl;

import accpa.dao.Impl.UserDaoImpl;
import accpa.dao.UserDao;
import accpa.extity.News_users;
import accpa.service.UserService;

/**
 * Created by 钟家龙 on 2018-12-08.
 */
public class UserServiceImpl implements UserService {
    UserDao ud=new UserDaoImpl();
    @Override
    public News_users login(News_users news_users) {
        return ud.login(news_users);
    }
}
