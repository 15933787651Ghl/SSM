package com.ghl.service.imp;

import com.ghl.mapper.ResourceMapper;
import com.ghl.pojo.Resource;
import com.ghl.service.ResourceService;
import com.ghl.util.Result;
import com.ghl.vo.ResourceVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ResourceServiceImp implements ResourceService {
    @Autowired
    private ResourceMapper resourceMapper;
    @Override
    public PageInfo findAll(ResourceVo resourceVo) {

        PageHelper.startPage(resourceVo.getCurrentPage(),resourceVo.getPageSize());

       List<Resource> list= resourceMapper.findAllByName(resourceVo);

        PageInfo<Resource> resourcePageInfo = new PageInfo<>(list);
        return resourcePageInfo;
    }

    @Override
    public Result saveOrUpdateResource(Resource resource) {


        Date date = new Date();

        resource.setCreatedTime(date);
        resource.setUpdatedTime(date);
        resource.setCreatedBy("ghl");
        resource.setUpdatedBy("ghl");

        //判断是否传入id
        if (resource.getId()!=null){

            //修改
            resourceMapper.updateById(resource);


            return new Result(true,"修改成功","有id",200);
        }

        resourceMapper.insert(resource);











        return new Result(true,"添加成功","没有id",200);
    }

    @Override
    public void deleteById(Integer id) {
        resourceMapper.deleteById(id);
    }
}
