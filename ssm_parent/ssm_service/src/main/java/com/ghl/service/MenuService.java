package com.ghl.service;

import com.ghl.pojo.Menu;
import com.ghl.util.Result;
import com.ghl.vo.ContentVo;
import com.ghl.vo.MenuVo;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface MenuService {
    List<MenuVo> findAll();

   public List<Integer> findByRoleId(Integer roleId);

   public PageInfo<MenuVo> findAllMenuList(Integer page, Integer pageSize);

  public ContentVo findMenuInfoById(Integer id);

   public Result saveOrUpdateMenu(Menu menu);
}
