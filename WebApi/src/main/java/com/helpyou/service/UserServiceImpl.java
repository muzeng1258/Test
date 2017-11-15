package com.helpyou.service;

import com.helpyou.dao.UserMapper;
import com.helpyou.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:ZhengYinShi
 * @Description:
 * @Date:Create in 2017/11/12 14:57.
 * @Modified By:
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Resource(name = "UserDao")
    private UserMapper userMapper;

    @Override
    public User findByUsernameAndPwd(String username, String password) {
        return userMapper.findByUsernameAndPwd(username,password);
    }
}
