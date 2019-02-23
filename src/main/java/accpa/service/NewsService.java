package accpa.service;

import accpa.extity.News;

import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-10.
 */
public interface NewsService {
    /**
     * 查看
     * @return
     */
    List<News> selectAll();
    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Integer id);
    public List<News> selectNewsbytid(Integer id);
}
