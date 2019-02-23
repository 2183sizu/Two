package accpa.service;

import accpa.extity.Topic;
import accpa.util.Page;

import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-10.
 */
public interface TopicService {
    /**
     * 查询类别
     * @return
     */
    List<Topic> selecrAll();

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

    void findPageTopic(Page page);
}
