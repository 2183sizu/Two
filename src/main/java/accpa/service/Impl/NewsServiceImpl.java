package accpa.service.Impl;

import accpa.extity.News;
import accpa.dao.Impl.NewsDaoImpl;
import accpa.dao.NewsDao;
import accpa.service.NewsService;

import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-10.
 */
public class NewsServiceImpl implements NewsService {
    NewsDao nd=new NewsDaoImpl();
    @Override
    public List<News> selectAll() {
        return nd.selectNewsAll();
    }

    @Override
    public int delete(Integer id) {
        return nd.delete(id);
    }
    @Override
    public List<News> selectNewsbytid(Integer id){
        return nd.selectNewsByTid(id);
    }

}
