package com.ghl.service;

import com.ghl.pojo.PromotionAd;
import com.ghl.util.Result;
import com.github.pagehelper.PageInfo;

public interface PromotionAdService {
   public PageInfo findAll(Integer currentPage, Integer pageSize);

    Result saveOrUpdate(PromotionAd promotionAd);

   public void updateById(PromotionAd promotionAd);

   public PromotionAd findById(Integer id);
}
