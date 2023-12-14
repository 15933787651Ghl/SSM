package com.ghl.service;

import com.ghl.pojo.User;
import com.ghl.vo.UserVo;
import com.github.pagehelper.PageInfo;

public interface UserService {
   public PageInfo findAll(UserVo userVo);

  public void update(User user);
}
