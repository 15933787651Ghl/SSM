package com.ghl.vo;

import com.ghl.pojo.Menu;
import com.ghl.pojo.MenuInfo;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ContentVo {
    private List<MenuVo> parentMenuList=new ArrayList<>();

    private MenuInfo menuInfo;
}
