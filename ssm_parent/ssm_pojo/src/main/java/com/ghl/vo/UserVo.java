package com.ghl.vo;

import lombok.Data;

import java.util.Date;
@Data
public class UserVo {

    private Integer currentPage;
    private Integer pageSize;
    private Date endCreateTime;
    private Date startCreateTime;
    private String name;
    private Date createTime;
    private Date updateTime;
}
