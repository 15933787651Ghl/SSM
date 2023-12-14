package com.ghl.controller;

import com.ghl.pojo.Resource;
import com.ghl.service.ResourceService;
import com.ghl.util.Result;
import com.ghl.vo.ResourceVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    @PostMapping("/findAllResource")
    public Result findAllResource(@RequestBody ResourceVo resourceVo){

      PageInfo pageInfo= resourceService.findAll(resourceVo);

      return new Result(true,"查询成功",pageInfo,200);
    }
    @PostMapping("/saveOrUpdateResource")
    public Result saveOrUpdateResource(@RequestBody Resource resource){



        Result result = resourceService.saveOrUpdateResource(resource);

        return result;

    }
    @GetMapping("/deleteResource")
    public Result deleteResource(Integer id){

        resourceService.deleteById(id);

        return new Result(true,"删除成功","牛逼",200);
    }
}
