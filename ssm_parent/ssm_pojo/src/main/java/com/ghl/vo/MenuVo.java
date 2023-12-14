package com.ghl.vo;

import com.ghl.pojo.Menu;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
public class MenuVo {
    private Integer id;
    private Integer parentId;
    private String href;
    private String icon;
    private String name;
    private String description;
    private Integer orderNum;
    private Integer shown;
    private Integer level;
    private Date createdTime;
    private Date updatedTime;
    private String createdBy;
    private String updatedBy;
    private List<MenuVo> menuList=new ArrayList<>();
    private Integer[] menuIdList;

}
