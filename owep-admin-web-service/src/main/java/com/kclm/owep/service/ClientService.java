/********************************
 *版权所有 CopyRight(c) 快程乐码信息有限公司所有，未经授权，不得复制、转发
 */
package com.kclm.owep.service;

import com.kclm.owep.entity.Client;
import com.kclm.owep.entity.ClientNote;

import java.io.Serializable;
import java.util.List;

/************
 *@Author yejx
 *@version v1.0
 *@create 2020/7/13 11:21
 *@Description 客户业务层接口
 *
 */
public interface ClientService {

    /**
     * 通过客户属性查询客户
     * @param client
     * @return
     */
    List<Client> findClientByField(Client client);

    /**
     * 查询所有的客户
     * @return
     */
    List<Client> findAllClient();


    /**
     * 添加客户
     * @param client
     * @return
     */
    int addClient(Client client);

    /**
     * 分配客户
     * @param ids
     * @param counselorId
     * @return
     */
    int assigningClient(List<Serializable> ids, Serializable counselorId);

    /**
     * 通过ids,删除多个客户
     * @param ids
     * @return
     */
    int deleteClientByIds(List<Serializable> ids);

    /**
     * 通过id,删除客户
     */
    int deleteClientById(Serializable id);

    /**
     * 签约客户
     */
    int signClient(Client client);

    /**
     * 修改客户信息
     */
    int alterClient(Client client);

    /**
     * 发邮件给客户
     */
    int sendEmailClient(String clientEmail, String content);

    /**
     * 添加跟进记录
     */
    int addClientNote(ClientNote clientNote);

    /**
     * 通过客户id查询跟进记录
     * @param id
     * @return
     */
    List<ClientNote> findAllByClientId(Serializable id);
}
