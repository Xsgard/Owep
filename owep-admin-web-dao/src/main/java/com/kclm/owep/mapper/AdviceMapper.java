package com.kclm.owep.mapper;

import com.kclm.owep.entity.Advice;
import org.apache.ibatis.annotations.Mapper;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface AdviceMapper{

    /**
     * 根据所选项删除
     * @mbg.generated
     */
    int deleteSelect(List<Integer> idList);

    /**
     * 根据id删除
     * @mbg.generated
     */
    int deleteById(Serializable id);

    /**
     * 新增新闻纪录
     * @mbg.generated
     */
    int save(Advice advice);

    /**
     * 根据名字查询
     * 前端已有bookstrap自带的查询共=功能，但是只能查询页面上显示的记录，无法查询后端的数据
     * @mbg.generated
     */
    List<Advice> selectAll();

    /**
     * 根据id查询
     * @mbg.generated
     */
    Advice selectById(Serializable id);

    /**
     * 更新新闻纪录
     * @mbg.generated
     */
    int update(Advice advice);
}