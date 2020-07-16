package com.kclm.owep.mapper;

import com.kclm.owep.entity.News;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface NewsMapper {

    /**
     * 删除所选删除新闻纪录
     * @mbg.generated
     */
    int deleteSelect(List<Integer> idList);

    /**
     * 根据id删除新闻纪录
     * @mbg.generated
     */
    int deleteById(Serializable id);

    /**
     * 新增新闻纪录
     * @mbg.generated
     */
    int save(News news);

    /**
     * 根据id查询
     * 前端已有bookstrap自带的查询共=功能，但是只能查询页面上显示的记录，无法查询后端的数据
     * @mbg.generated
     */
    News selectById(Serializable id);

    /**
     * 根据名字查询
     * @mbg.generated
     */
    List<News> selectAll();

    /**
     * 更新编辑新闻
     * @mbg.generated
     */
    int update(News news);
}