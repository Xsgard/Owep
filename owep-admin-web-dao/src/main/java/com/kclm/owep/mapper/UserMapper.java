package com.kclm.owep.mapper;

import com.kclm.owep.entity.Group;
import com.kclm.owep.entity.Role;
import com.kclm.owep.entity.User;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

    @Select("select user_name,user_phone,real_name,user_email,card_num,status," +
            "gender,effective_date,title,last_access_time,description,is_delete,user_type from t_user " +
            "where is_delete=1 or is_delete=0;")
    List<User> getExportUserInfo();

    @Select("select r.id, r.role_name roleName  from" +
            " t_group_role gr left join t_role r " +
            "on gr.role_id = r.id where gr.group_id= #{groupId};")
    List<Role> selectGroupRole(Integer groupId);
}
