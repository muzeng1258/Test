package com.helpyou.service;

import com.helpyou.model.User;
import org.springframework.stereotype.Service;

/**
 * @Author:ZhengYinShi
 * @Description:
 * @Date:Create in 2017/11/12 14:40.
 * @Modified By:
 */
public interface UserService {
    /**
     * @Author:ZhengYinShi
     * @Description:
     * @Date: 2017/11/12 14:57
    */
    User findByUsernameAndPwd(String username, String password);
}
