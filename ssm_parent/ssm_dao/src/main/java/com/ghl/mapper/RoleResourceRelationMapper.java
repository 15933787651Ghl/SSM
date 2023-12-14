package com.ghl.mapper;

import com.ghl.vo.MenuVo;
import com.ghl.vo.RoleResourceRelationVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleResourceRelationMapper {
   public void insertById(@Param("menuIdList") RoleResourceRelationVo roleResourceRelationVo);
}
