package com.ghl.service.imp;

import com.ghl.mapper.PromotionSpaceMapper;
import com.ghl.pojo.PromotionSpace;
import com.ghl.service.PromotionSpaceService;
import com.ghl.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PromotionSpaceImp implements PromotionSpaceService {

@Autowired
private PromotionSpaceMapper promotionSpaceMapper;
    @Override
    public List<PromotionSpace> findAll() {
        return promotionSpaceMapper. findAll();
    }

    @Override
    public Result saveOrUpdatePromotionSpace(PromotionSpace promotionSpace) {

        Date date = new Date();
promotionSpace.setUpdateTime(date);
promotionSpace.setCreateTime(date);

        if (promotionSpace.getId()!=null){
            promotionSpaceMapper.update(promotionSpace);

            return new Result(true,"修改成功","有id",200);
        }
             promotionSpaceMapper.insert(promotionSpace);

        return new Result(true,"添加成功","没有id",200);

    }

    @Override
    public PromotionSpace findById(Integer id) {
        return promotionSpaceMapper.findById(id);
    }
}
