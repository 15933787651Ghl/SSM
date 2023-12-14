package com.ghl.service.imp;

import com.ghl.mapper.RoleMapper;
import com.ghl.pojo.Roles;
import com.ghl.service.RoleService;
import com.ghl.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RoleServiceImp implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Roles> find(Roles roles) {
        return roleMapper.find(roles);
    }

    @Override
    public Result saveOrUpdateRole(Roles roles) {
        roles.setUpdatedBy("ghl");
        roles.setCreatedBy("ghl");
        Date date = new Date();
        roles.setUpdatedTime(date);
        roles.setCreatedTime(date);

        if (roles.getId()!=null){

            roleMapper.updateById(roles);
            //修改
            return  new Result(true,"修改成功","",200);
        }
            roleMapper.insert(roles);

        return  new Result(true,"添加成功","",200);
    }

    @Override
    public void deleteById(Integer id) {
        roleMapper.deleteById(id);
    }
}
