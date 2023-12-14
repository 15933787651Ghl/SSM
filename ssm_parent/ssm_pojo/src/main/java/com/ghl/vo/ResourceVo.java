package com.ghl.vo;

import lombok.Data;

@Data
public class ResourceVo {

    private Integer currentPage;

    private Integer pageSize;

    private String name;

    private Integer id;

    private String url;
}
