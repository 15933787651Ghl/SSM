package com.ghl.service.imp;

import com.ghl.mapper.RoleResourceRelationMapper;
import com.ghl.pojo.RoleResourceRelation;
import com.ghl.service.RoleResourceRelationService;
import com.ghl.vo.MenuVo;
import com.ghl.vo.RoleResourceRelationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.dc.pr.PRError;

import java.util.Date;
import java.util.List;


@Service
public class RoleResourceRelationServiceImp implements RoleResourceRelationService {

    @Autowired
    private RoleResourceRelationMapper roleResourceRelationMapper;

    private RoleResourceRelationVo roleResourceRelationVo;

    @Override
    public void insertByRoleId(RoleResourceRelationVo roleResourceRelationVo) {
        Date date = new Date();
        roleResourceRelationVo.setUpdatedTime(date);
        roleResourceRelationVo.setUpdatedBy("ghl");
roleResourceRelationMapper.insertById(roleResourceRelationVo);
    }
}
