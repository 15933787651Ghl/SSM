package com.ghl.service.imp;

import com.ghl.mapper.MenuMapper;
import com.ghl.pojo.Menu;
import com.ghl.pojo.MenuInfo;
import com.ghl.service.MenuService;
import com.ghl.util.Result;
import com.ghl.vo.ContentVo;
import com.ghl.vo.MenuVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MenuServiceImp implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuVo> findAll() {

        List<MenuVo> list = new ArrayList<>();

        List<MenuVo> menuListVo = menuMapper.findAll();

        for (int i = 0; i < menuListVo.size(); i++) {

            if (menuListVo.get(i).getParentId() == -1) {
                list.add(menuListVo.get(i));
            }
        }
        for (MenuVo menuVo : menuListVo) {
            for (MenuVo menu : list) {
                if (menu.getId() == menuVo.getParentId()) {
                    menu.getMenuList().add(menuVo);
                }
            }
        }
        return list;

    }

    @Override
    public List<Integer> findByRoleId(Integer roleId) {
        return menuMapper.findByRoleId(roleId);
    }

    @Override
    public PageInfo<MenuVo> findAllMenuList(Integer page, Integer pageSize) {

        PageHelper.startPage(page, pageSize);


        List<MenuVo> list = new ArrayList<>();

        List<MenuVo> menuListVo = menuMapper.findAll();

        for (int i = 0; i < menuListVo.size(); i++) {

            if (menuListVo.get(i).getParentId() == -1) {
                list.add(menuListVo.get(i));
            }
        }
        for (MenuVo menuVo : menuListVo) {
            for (MenuVo menu : list) {
                if (menu.getId() == menuVo.getParentId()) {
                    menu.getMenuList().add(menuVo);
                }
            }
        }


        PageInfo<MenuVo> menuVoPageInfo = new PageInfo<>(list);


        return menuVoPageInfo;


    }

    @Override
    public ContentVo findMenuInfoById(Integer id) {
        ContentVo content = new ContentVo();

        List<MenuVo> parentMenuList = new ArrayList<>();

        List<MenuVo> list = menuMapper.findAll();

        MenuInfo menuInfo = menuMapper.findByzId(id);


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getParentId() == -1) {
                parentMenuList.add(list.get(i));
            }
        }
        for (MenuVo menuVo : parentMenuList) {
            for (MenuVo menu : list) {
                if (menu.getId() == menuVo.getParentId()) {
                    menu.getMenuList().add(menuVo);
                }
            }
        }

        content.setParentMenuList(parentMenuList);
        content.setMenuInfo(menuInfo);
        System.out.println(content);

        return content;
    }

    @Override
    public Result saveOrUpdateMenu(Menu menu) {

        if (menu.getId()!=null){
            //修改

            menuMapper.update(menu);
            return new Result(true,"修改成功","有id",200);
        }else {

            menuMapper.insert(menu);
            return new Result(true,"添加成功","没有id",200);

        }





    }

}
