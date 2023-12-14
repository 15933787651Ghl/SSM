package com.ghl.mapper;

import com.ghl.pojo.Roles;

import java.util.List;

public interface RoleMapper {
   public List<Roles> find(Roles roles);

   public void updateById(Roles roles);

   public void insert(Roles roles);

  public void deleteById(Integer id);
}
