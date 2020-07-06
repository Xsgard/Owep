package com.kclm.owep.mapper;

import com.kclm.owep.entity.SystLog;
import com.kclm.owep.entity.SystLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    long countByExample(SystLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    int deleteByExample(SystLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    int insert(SystLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    int insertSelective(SystLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    List<SystLog> selectByExample(SystLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    SystLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SystLog record, @Param("example") SystLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SystLog record, @Param("example") SystLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SystLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_syslog
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SystLog record);
}