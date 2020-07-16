/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.mapper;

import com.kclm.owep.entity.ReleaseLog;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/******************
 * @Author yejf
 * @Version v1.0
 * @Create 2020-07-07 23:22
 * @Description 版本发布 日志信息数据的操作接口
 */
@Mapper
public interface ReleaseLogMapper extends BaseMapper<ReleaseLog> {

    //nothing! 父接口的方法已满足要求
}
