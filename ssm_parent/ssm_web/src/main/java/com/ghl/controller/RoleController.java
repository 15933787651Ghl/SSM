package com.ghl.controller;

import com.ghl.pojo.Menu;
import com.ghl.pojo.Roles;
import com.ghl.service.MenuService;
import com.ghl.service.RoleResourceRelationService;
import com.ghl.service.RoleService;
import com.ghl.util.Result;
import com.ghl.vo.MenuVo;
import com.ghl.vo.RoleResourceRelationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;
    @Autowired
    private MenuService menuService;

    @Autowired
    private RoleResourceRelationService roleResourceRelationService;

    @PostMapping("/findAllRole")
    public Result findAllRole(@RequestBody Roles roles){


       List<Roles> rolesList=  roleService.find(roles);


       return new Result(true,"成功查找",rolesList,200);
    }
    @PostMapping("/saveOrUpdateRole")
    public Result saveOrUpdateRole(@RequestBody Roles roles){


     Result result=   roleService.saveOrUpdateRole(roles);

        return result;
    }
    @GetMapping("/findAllMenu")
    public Result findAllMenu(){

          List<MenuVo> menuList=  menuService.findAll();

          return new Result(true,"查询成功",menuList,200);
    }
    @GetMapping("/findMenuByRoleId")
    public Result findMenuByRoleId(Integer roleId){

        List<Integer> idList = menuService.findByRoleId(roleId);


        return new Result(true,"查询成功",idList,200);

    }
    @PostMapping("/RoleContextMenu")
    public Result RoleContextMenu(RoleResourceRelationVo roleResourceRelationVo){


        roleResourceRelationService.insertByRoleId(roleResourceRelationVo);

        return new Result(true,"成功","修改权限成功",200);

    }

    @GetMapping("/deleteRole")
    public Result deleteRole(Integer id){
        roleService.deleteById(id);

        return new Result(true,"删除成功","找到该角色",200);
    }
}
