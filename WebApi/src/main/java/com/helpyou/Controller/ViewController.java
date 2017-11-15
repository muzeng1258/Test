package com.helpyou.Controller;

import com.helpyou.model.User;
import com.helpyou.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:ZhengYinShi
 * @Description:
 * @Date:Create in 2017/11/12 14:59.
 * @Modified By:
 */
@Controller
@RequestMapping("/user")
public class ViewController {
    private  static Logger logger = LoggerFactory.getLogger(ViewController.class);

    @Resource(name = "UserService")
    private UserService userService;

    @RequestMapping("/index")
    public  String index(){
        return  "login";
    }

    @RequestMapping("/login")
    @ResponseBody
    public Map<String,Object> find(User user, HttpServletRequest request){
        Map<String,Object> modelMap = new HashMap<String, Object>(4);
        logger.info("进入Controller的find方法..");
        User loginUser = userService.findByUsernameAndPwd(user.getUserName(),user.getPwd());
        List<User> userList = new ArrayList<User>();
        userList.add(loginUser);

        if(loginUser != null){
            modelMap.put("result",userList);
            modelMap.put("status",1); //success
            modelMap.put("msg","loginSuccess");
            modelMap.put("count",userList.size());

        }else{
            modelMap.put("result",null);
            modelMap.put("status",3); //error
            modelMap.put("msg","loginFailed");
            modelMap.put("count",0);
        }
        return modelMap;
    }

    @RequestMapping("/success")
    public String success(){
        logger.info("登录成功。。。。");
        return "success";
    }

}
