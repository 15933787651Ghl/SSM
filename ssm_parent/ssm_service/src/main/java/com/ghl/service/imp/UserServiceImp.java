package com.ghl.service.imp;

import com.ghl.mapper.UserMapper;
import com.ghl.pojo.User;
import com.ghl.service.UserService;
import com.ghl.vo.UserVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageInfo findAll(UserVo userVo) {
        PageHelper.startPage(userVo.getCurrentPage(),userVo.getPageSize());

        System.out.println(userVo.getStartCreateTime());
        System.out.println(userVo.getEndCreateTime());
        List<UserVo> list= userMapper.findAll(userVo);

        PageInfo pageInfo = new PageInfo<>(list);



        return pageInfo;
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }
}
