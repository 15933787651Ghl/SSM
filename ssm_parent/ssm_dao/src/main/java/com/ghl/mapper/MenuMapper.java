package com.ghl.mapper;


import com.ghl.pojo.Menu;
import com.ghl.pojo.MenuInfo;
import com.ghl.vo.MenuVo;

import java.util.List;

public interface MenuMapper {
   public List<MenuVo> findAll();

  public List<Integer> findByRoleId(Integer roleId);

  public   MenuVo findById(Integer parentId);

   public MenuInfo findByzId(Integer id);

   public void update(Menu menu);

    void insert(Menu menu);
}
