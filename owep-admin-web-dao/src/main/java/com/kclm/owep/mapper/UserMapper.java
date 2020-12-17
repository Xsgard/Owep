/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.mapper;

import com.kclm.owep.entity.Group;
import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/*****
 * @Author ZhangShaowei
 * @Version v1.0
 * @Create 2020/7/7 16:02
 * @Description 用户表接口
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 14:04
     * @Description: 提交一条记录
     * @Param: [user]
     * @Return: int
     */
    @Override
    int save(User user);

    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 14:05
     * @Description: 更新一条记录
     * @Param: [user]
     * @Return: int
     */
    @Override
    int update(User user);

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


    /***
     * @By:Artherine
     * @Func:由用户名搜索用户信息
     * @Date:2020.10.24
     */
    User selectByName(@Param("userName")String userName );

    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 12:38
     * @Description: 通过id查找一条记录
     * @Param: [id]
     * @Return: com.kclm.owep.entity.user
     */
    @Override
    User selectById(@Param("id") Serializable id);

    List<User> selectByType(@Param("type") Integer type);

    List<User> selectByKeyword(  @Param("userName") String userName,@Param("realName") String realName);

    List<User> selectByKeywordAtAdvisor(  @Param("userName") String userName,@Param("realName") String realName);
    /******
     * @Author: ZhangShaowei
     * @Date: 2020/7/15 12:37
     * @Description: 查找所有记录放入集合
     * @Param: []
     * @Return: java.util.List<com.kclm.owep.entity.user>
     */
    @Override
    List<User> selectAll();


    List<Integer> getGroupId( Serializable id);

    List<Integer> getClassId(Serializable id);

    int deleteUserGroupAllocation( Serializable id);

    int attachGroupToUser( Serializable uid ,  Serializable gid);

    int deleteUserClassAllocation(Serializable id);

    int attachClassToUser(Serializable uid,Serializable cid);

}