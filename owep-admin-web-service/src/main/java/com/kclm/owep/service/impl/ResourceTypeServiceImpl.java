package com.kclm.owep.service.impl;

import com.kclm.owep.convert.ResourceTypeConvert;
import com.kclm.owep.dto.ResourceTypeDTO;
import com.kclm.owep.entity.ResourceType;
import com.kclm.owep.mapper.ResourceTypeMapper;
import com.kclm.owep.service.ResourceTypeService;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author zhang_hy
 * @version v1.0
 * @date 2020-11-25 11:43
 * @description
 */
@Service
public class ResourceTypeServiceImpl implements ResourceTypeService {

    @Autowired
    private ResourceTypeMapper resourceTypeMapper;
    @Autowired
    private MapperFactory mapperFactory;

    @Override
    public ResourceTypeDTO findByKeywords(String keyword) {

        List<ResourceType> lists = resourceTypeMapper.findByKeywords(keyword);
        ResourceTypeDTO resultDTO = null;

        for (ResourceType list : lists) {
            resultDTO = ResourceTypeConvert.INSTANCE.PO2DTO(list);
        }
        return resultDTO;
    }

    @Override
    public List<ResourceTypeDTO> findAllResourceType() {
        List<ResourceType> lists = resourceTypeMapper.selectAll();
        List<ResourceTypeDTO> listDTO = new ArrayList<>();
        for(ResourceType list:lists){
            listDTO.add(ResourceTypeConvert.INSTANCE.PO2DTO(list));
        }
        return listDTO;
    }

    @Override
    public ResourceTypeDTO findById(Serializable id) {
        ResourceType resourceType = this.resourceTypeMapper.selectById(id);
        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        ResourceTypeDTO resourceTypeDTO = mapperFacade.map(resourceType, ResourceTypeDTO.class);
        return resourceTypeDTO;
    }

    @Override
    public int deleteSelectResourceType(List<Serializable> idList) {
        return resourceTypeMapper.deleteSelect(idList);
    }

    @Override
    public int deleteResourceType(Serializable id) {
        return resourceTypeMapper.deleteById(id);
    }

    @Override
    public int updateResourceType(ResourceType resourceType) {
        return resourceTypeMapper.update(resourceType);
    }

    @Override
    public int addResourcrType(ResourceType resourceType) {
        return resourceTypeMapper.save(resourceType);
    }
}