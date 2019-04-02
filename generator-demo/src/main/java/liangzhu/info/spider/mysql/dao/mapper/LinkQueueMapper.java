package liangzhu.info.spider.mysql.dao.mapper;

import java.util.List;
import liangzhu.info.spider.mysql.domain.LinkQueue;
import liangzhu.info.spider.mysql.domain.example.LinkQueueExample;
import org.apache.ibatis.annotations.Param;

 /** create by system from table link_queue(URL队列)  */
public interface LinkQueueMapper {
    long countByExample(LinkQueueExample example);

    int deleteByExample(LinkQueueExample example);

    int deleteByPrimaryKey(Long id);

    int insertSelective(LinkQueue record);

    List<LinkQueue> selectByExample(LinkQueueExample example);

    LinkQueue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LinkQueue record, @Param("example") LinkQueueExample example);

    int updateByPrimaryKeySelective(LinkQueue record);

    int batchInsertSelective(List<LinkQueue> records);
}