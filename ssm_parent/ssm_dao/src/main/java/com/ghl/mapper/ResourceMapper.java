package com.ghl.mapper;

import com.ghl.pojo.Resource;
import com.ghl.vo.ResourceVo;

import java.util.List;

public interface ResourceMapper {
    List<Resource> findAllByName(ResourceVo resourceVo);

    public void updateById(Resource resource) ;

   public void insert(Resource resource);

   public void deleteById(Integer id);
}
