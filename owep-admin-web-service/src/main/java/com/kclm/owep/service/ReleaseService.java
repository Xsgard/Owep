/****************************************
 * 2018 - 2021 版权所有 CopyRight(c) 快程乐码信息科技有限公司所有, 未经授权，不得复制、转发
 */

package com.kclm.owep.service;

import com.kclm.owep.dto.ReleaseDTO;
import com.kclm.owep.entity.Release;

import java.util.List;

/******************
 * @Author yejf
 * @Version v1.0
 * @Create 2020-07-13 16:34
 * @Description ReleaseService 业务层接口
 */
public interface ReleaseService {

    /*************
     * 获取最新发布的版本信息，包含当前版本的基本信息以及此版本下的所有更新日志，要求持久层通过关联查询出此release下
     * 的所有ReleaseLog信息
     * @return
     */
    ReleaseDTO getLastestRelease();

    /**********
     * 获取所有的版本信息, 同样需要加载 ReleaseLog
     * @return
     */
    List<ReleaseDTO> getAllReleaseVersion();

}
