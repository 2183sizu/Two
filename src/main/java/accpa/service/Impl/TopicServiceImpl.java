package accpa.service.Impl;

import accpa.dao.Impl.TopicDaoImpl;
import accpa.service.TopicService;
import accpa.dao.TopicDao;
import accpa.extity.Topic;
import accpa.util.Page;

import java.util.List;

/**
 * Created by 钟家龙 on 2018-12-10.
 */
public class TopicServiceImpl implements TopicService {
    TopicDao td=new TopicDaoImpl();
    @Override
    /**
     * 查看
     */
    public List<Topic> selecrAll() {
        return td.selectAll();
    }

    @Override
    public int add(Topic topic) {
        return td.add(topic);
    }

    @Override
    public Topic selectid(Integer id) {
        return td.selectid(id);
    }

    @Override
    public int update(Topic topic) {
        return td.update(topic);
    }

    @Override
    public int delete(Integer id) {
        return td.delete(id);
    }

    @Override
    public int count() {
        return td.count();
    }

    @Override
    public void findPageTopic(Page page) {
        //得到总条数
        int totalcount=td.count();
        //给Page页面赋值
        page.setTotalCount(totalcount);
        //调用查询方法，参数当前页码和每页显示的条数
       List<Topic> list= td.getPageTopic(page.getCurrPageNo(),page.getPageSize());
       //给Page对象中的集合属性赋值
        page.setTopicList(list);

    }

}
