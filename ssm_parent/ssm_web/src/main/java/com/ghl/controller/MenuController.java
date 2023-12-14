package com.ghl.controller;

import com.ghl.pojo.Menu;
import com.ghl.service.MenuService;
import com.ghl.util.Result;
import com.ghl.vo.ContentVo;
import com.ghl.vo.MenuVo;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private MenuService menuService;

    private static final Integer PAGE_SIZE=10;
    @GetMapping("/findAllMenu")
    public Result findAllMenu(Integer currentPage){

            PageInfo<MenuVo> allMenuList = menuService.findAllMenuList(currentPage, PAGE_SIZE);


        return new Result(true,"查询成功",allMenuList,200);


        }
        @GetMapping("/findMenuInfoById")
        public Result findMenuInfoById(Integer id){

            ContentVo content= menuService.findMenuInfoById(id);


            return new Result(true,"查找成功",content,200);
        }
    @PostMapping("/saveOrUpdateMenu")
    public Result saveOrUpdateMenu(@RequestBody Menu menu){

        Result result = menuService.saveOrUpdateMenu(menu);
        return result;

    }
}
