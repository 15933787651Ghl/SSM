package com.ghl.service;

import com.ghl.pojo.Roles;
import com.ghl.util.Result;

import java.util.List;

public interface RoleService {
   public List<Roles> find(Roles roles);

   public Result saveOrUpdateRole(Roles roles);

   public void deleteById(Integer id);
}
