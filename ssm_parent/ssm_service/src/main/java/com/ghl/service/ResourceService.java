package com.ghl.service;

import com.ghl.pojo.Resource;
import com.ghl.util.Result;
import com.ghl.vo.ResourceVo;
import com.github.pagehelper.PageInfo;

public interface ResourceService {
    PageInfo findAll(ResourceVo resourceVo);

    Result saveOrUpdateResource(Resource resource);

    void deleteById(Integer id);
}
