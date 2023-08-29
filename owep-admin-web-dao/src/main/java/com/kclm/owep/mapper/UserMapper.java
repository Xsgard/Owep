package com.kclm.owep.mapper;

import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {

    /*************
     *
     * @param userName
     * @return
     */
    User selectByName(@Param("userName") String userName);

    List<User> selectByType(@Param("type") Integer type);

    List<Integer> getGroupId(Serializable id);

    int attachGroupToUser(Serializable uid, Serializable gid);

    int deleteUserGroupAllocation(Serializable id);

    @Override
    List<User> selectByCond(User user);

    @Override
    List<User> selectByLike(User user);

    @Override
    int save(User entity);

    @Override
    int update(User entity);

    @Override
    int deleteById(Serializable id);

    @Override
    int deleteSelect(List<Serializable> idList);

    @Override
    User selectById(Serializable id);

    @Override
    List<User> selectAll();
}
