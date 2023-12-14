package com.ghl.controller;

import com.ghl.pojo.PromotionAd;
import com.ghl.service.PromotionAdService;
import com.ghl.util.Result;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/promotionAd")
public class PromotionAdController {
    @Autowired
    private PromotionAdService promotionAdService;

    @GetMapping("/findAllPromotionAdByPage")
    public Result findAllPromotionAdByPage(Integer currentPage, Integer pageSize) {

    PageInfo content= promotionAdService.findAll(currentPage,pageSize);

        System.out.println(111);
    return new Result(true,"分页成功",content,200);

    }
    @PostMapping("promotionAdUpload")
    public Result  PromotionAdUpload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        if (file.isEmpty()) {
            throw new RuntimeException();
        }
        //项目路径
        String realPath = request.getServletContext().getRealPath("/");
        System.out.println(realPath);

        String ssm_web = realPath.substring(0, realPath.indexOf("ssm_web"));
        System.out.println(ssm_web);


        //获取原始文件名
        String originalFilename = file.getOriginalFilename();
        System.out.println(originalFilename);


        int i = originalFilename.lastIndexOf(".");
        System.out.println(i);
        //新文件名
      String  newFileName=  System.currentTimeMillis()+ originalFilename.substring(i);

        System.out.println(newFileName);

            //上传文件
        String uploadPath=ssm_web+"PromotionAdUpload\\";

        File file1 = new File(uploadPath, newFileName);


            if (!file1.getParentFile().exists()){
                file1.getParentFile().mkdir();
                System.out.println("创建目录"+file1);
            }

        try {
            file.transferTo(file1);

            HashMap<String, String> map = new HashMap<>();

            map.put("fileName",newFileName);
            map.put("filePath","localhost"+"PromotionAdUpload"+newFileName);
            Result result=new Result(true,"上传成功",map,200);

            return result;



        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @PostMapping("/saveOrUpdatePromotionAd")
    public Result saveOrUpdatePromotionAd(@RequestBody PromotionAd promotionAd){


        Result result=  promotionAdService.saveOrUpdate(promotionAd);

        return result;
    }
    @GetMapping("/updatePromotionAdStatus")
    public Result updatePromotionAdStatus(PromotionAd promotionAd){

            promotionAdService.updateById(promotionAd);

        return new Result(true,"修改状态成功",promotionAd.getStatus(),200);
    }

    @GetMapping("/findPromotionAdById")
    public Result findPromotionAdById(Integer id){

        PromotionAd promotionAd=promotionAdService.findById(id);

        return new Result(true,"查询成功",promotionAd,200);
    }
}
