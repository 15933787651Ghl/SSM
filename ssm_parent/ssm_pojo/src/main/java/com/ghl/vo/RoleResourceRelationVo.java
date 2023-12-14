package com.ghl.vo;

import com.ghl.pojo.Menu;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
public class RoleResourceRelationVo {

    private Integer id;
    private Integer menuId;
    private Integer roleId;
    private Date createdTime;
    private Date updatedTime;
    private String createdBy;
    private String updatedBy;
    private Integer[] menuIdList;
}
