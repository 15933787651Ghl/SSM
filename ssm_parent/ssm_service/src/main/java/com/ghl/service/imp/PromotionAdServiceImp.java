package com.ghl.service.imp;

import com.ghl.mapper.PromotionAdMapper;
import com.ghl.pojo.PromotionAd;
import com.ghl.service.PromotionAdService;
import com.ghl.util.Result;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PromotionAdServiceImp implements PromotionAdService {

@Autowired
private PromotionAdMapper promotionAdMapper;
    @Override
    public PageInfo findAll(Integer currentPage, Integer pageSize) {


        PageHelper.startPage(currentPage,pageSize);


     List<PromotionAd> adList= promotionAdMapper.findAll();

        PageInfo<PromotionAd> promotionAdPageInfo = new PageInfo<>(adList);


        return promotionAdPageInfo;



    }

    @Override
    public Result saveOrUpdate(PromotionAd promotionAd) {

        Date date = new Date();
        promotionAd.setUpdateTime(date);
        promotionAd.setCreateTime(date);
        if (promotionAd.getId()!=null){

            //修改
            promotionAdMapper.update(promotionAd);

            return new Result(true,"修改成功","有id",200);
        }
            //添加
            promotionAdMapper.insert(promotionAd);




        return new Result(true,"添加成功","没有id",200);
    }

    @Override
    public void updateById(PromotionAd promotionAd) {
        Date date = new Date();

        promotionAd.setUpdateTime(date);

        promotionAdMapper.updateById(promotionAd);
    }

    @Override
    public PromotionAd findById(Integer id) {
        return promotionAdMapper.findById(id);
    }
}
