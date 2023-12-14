package com.ghl.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Roles {
private Integer id;
private String code;
private String name;
private String description;
private Date createdTime;
private Date updatedTime;
private String createdBy;
private String updatedBy;

}
