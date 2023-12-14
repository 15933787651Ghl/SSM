package com.ghl.service;

import com.ghl.pojo.PromotionSpace;
import com.ghl.util.Result;

import java.util.List;

public interface PromotionSpaceService {
    List<PromotionSpace> findAll();


   public Result saveOrUpdatePromotionSpace(PromotionSpace promotionSpace);

   public PromotionSpace findById(Integer id);
}
