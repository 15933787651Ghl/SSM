package com.ghl.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    private Integer id;
    private String name;
    private String portrait;
    private String  phone;
    private String password;
    private String regIp;
    private String accountNonExpired;
    private String accountNonLocked;
    private String status;
    private Date createTime;
    private Date updateTime;
}
