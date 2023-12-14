package com.ghl.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * resource
 * @author 
 */
@Data
public class Resource implements Serializable {
    /**
     * 资源id
     */
    private Integer id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源url
     */
    private String url;

    /**
     * 分类id
     */
    private Integer categoryId;

    /**
     * 简介
     */
    private String description;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 更新时间
     */
    private Date updatedTime;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新人
     */
    private String updatedBy;

    private static final long serialVersionUID = 1L;
}