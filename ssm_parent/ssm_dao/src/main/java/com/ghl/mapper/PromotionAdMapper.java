package com.ghl.mapper;

import com.ghl.pojo.PromotionAd;

import java.util.List;

public interface PromotionAdMapper {
   public List<PromotionAd> findAll();

   public void update(PromotionAd promotionAd);

  public void insert(PromotionAd promotionAd);

   public void updateById(PromotionAd promotionAd);

   public PromotionAd findById(Integer id);
}
