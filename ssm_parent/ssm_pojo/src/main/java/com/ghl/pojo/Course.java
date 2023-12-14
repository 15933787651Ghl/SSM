package com.ghl.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Course {

    private Integer id;
    private String courseName;
    private String brief;
    private Double price;
    private String priceTag;
    private Double discounts;
    private String  discountsTag;
    private String courseDscriptionMarkDown;
    private String courseDescription;
    private String  courseImgUrl;
    private Integer isNew;
    private String isNewDes;
    private Integer lastOperatorId;
    private Date autoOnlineTime;
    private  Date createTime;
    private Date updateTime;
    private Integer isDel;
    private Integer totalDuration;
    private  String courseListImg;
    private Integer status;
    private Integer sortNum;
    private String previewFirstField;
    private String previewSecondField;
    private Integer sales;


}
