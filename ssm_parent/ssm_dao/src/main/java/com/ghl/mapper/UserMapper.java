package com.ghl.mapper;

import com.ghl.pojo.User;
import com.ghl.vo.UserVo;

import java.util.List;

public interface UserMapper {
   public List<UserVo> findAll(UserVo userVo);

  public void update(User user);
}
