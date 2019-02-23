package accpa.dao;

import accpa.extity.News;

import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-10.
 */
public interface NewsDao {
    /**
     * 查看全部
     * @return
     */
    //List<News> selectAll();
    /**
     * 新查看全部
     * @return
     */
    List<News> selectNewsAll();

    /**
     * 按编号查询
     * @return
     */
    List<News> selectNewsByTid(Integer id);


    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Integer id);
}
