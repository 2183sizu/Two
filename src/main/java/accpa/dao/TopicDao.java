package accpa.dao;

import accpa.extity.Topic;

import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-08.
 */
public interface TopicDao {
    /**
     * 查询全部
     * @return List<Topic>
     */
    List<Topic> selectAll();

    /**
     * 增加类别
     * @param topic
     * @return
     */
    int add(Topic topic);
    /**
     * 根据编号查询
     * @param id
     * @return
     */
    Topic selectid(Integer id);

    /**
     * 修改
     * @param topic
     * @return
     */
    int update(Topic topic);

    /**
     * 删除
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 查询条数
     * @return
     */
    int count();

    /**
     *
     * @param pageNO 页码
     * @param pageSize 每页显示的条数
     * @return
     */
    List<Topic> getPageTopic(int pageNO,int pageSize);

}
