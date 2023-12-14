package com.ghl.controller;

import com.ghl.pojo.PromotionSpace;
import com.ghl.service.PromotionSpaceService;
import com.ghl.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promotionSpace")
public class PromotionSpaceController {

@Autowired
private PromotionSpaceService promotionSpaceService;

    @GetMapping("/findAllPromotionSpace")
    public Result findAllPromotionSpace(){

    List<PromotionSpace>  content  =promotionSpaceService.findAll();

        System.out.println(content);
        return new Result(true,"成功查询",content,200);

    }

    @PostMapping("/saveOrUpdatePromotionSpace")
    public Result saveOrUpdatePromotionSpace(@RequestBody PromotionSpace promotionSpace){


        Result result = promotionSpaceService.saveOrUpdatePromotionSpace(promotionSpace);


        return result;


    }
    @GetMapping("findPromotionSpaceById")
    public  Result findPromotionSpaceById( Integer id){


          PromotionSpace promotionSpace=  promotionSpaceService.findById(id);


          return new Result(true,"查询成功",promotionSpace,200);
    }

}
