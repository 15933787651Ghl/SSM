package com.ghl.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class RoleResourceRelation {
    private Integer id;
    private Integer menuId;
    private Integer roleId;
    private Date createTime;
    private Date updateTime;
    private String createBy;
    private String updateBy;


}
