/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.mapper;

import com.kclm.owep.entity.Release;
import com.kclm.owep.mapper.common.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/******************
 * @Author yejf
 * @Version v1.0
 * @Create 2020-07-07 23:20
 * @Description 版本发布数据操作的接口
 */
@Mapper
public interface ReleaseMapper extends BaseMapper<Release> {

    //nothing! 父类方法已经可以满足要求
}
