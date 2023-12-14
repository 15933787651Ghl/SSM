package com.ghl.pojo;

import com.ghl.vo.MenuVo;
import lombok.Data;

import java.util.Date;
@Data
public class MenuInfo {
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
    private MenuVo menuVo;
}
