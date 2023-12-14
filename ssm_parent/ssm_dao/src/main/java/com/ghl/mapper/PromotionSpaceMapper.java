package com.ghl.mapper;

import com.ghl.pojo.PromotionSpace;

import java.util.List;

public interface PromotionSpaceMapper {
   public List<PromotionSpace> findAll();

   public void update(PromotionSpace promotionSpace);

  public void insert(PromotionSpace promotionSpace);

   public PromotionSpace findById(Integer id);
}
