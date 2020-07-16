/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.StudentNote;
import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/*****
 * @Author ZhangShaowei
 * @Version v1.0
 * @Create 2020/7/7 16:02
 * @Description 学生笔记表接口
 */
@Mapper
public interface StudentNoteMapper extends BaseMapper<StudentNote> {

    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 14:04
     * @Description: 提交一条记录
     * @Param: [studentNote]
     * @Return: int
     */
    @Override
    int save(StudentNote studentNote);

    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 14:05
     * @Description: 更新一条记录
     * @Param: [studentNote]
     * @Return: int
     */
    @Override
    int update(StudentNote studentNote);

    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 14:05
     * @Description: 根据id删除一条记录
     * @Param: [id]
     * @Return: int
     */
    @Override
    int deleteById(@Param("id") Serializable id);

    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 14:06
     * @Description: 根据查询出来的id集合，删除多条记录
     * @Param: [idList]
     * @Return: int
     */
    @Override
    int deleteSelect(@Param("idList") List<Serializable> idList);

    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 12:38
     * @Description: 通过id查找一条记录
     * @Param: [id]
     * @Return: com.kclm.owep.entity.studentNote
     */
    @Override
    StudentNote selectById(@Param("id") Serializable id);

    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 12:37
     * @Description: 查找所有记录放入集合
     * @Param: []
     * @Return: java.util.List<com.kclm.owep.entity.studentNote
     */
    @Override
    List<StudentNote> selectAll();

}