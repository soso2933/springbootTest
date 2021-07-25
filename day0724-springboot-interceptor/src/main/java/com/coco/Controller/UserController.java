package com.coco.Controller;

import com.coco.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author cocoLin
 * @create 2021-07-24 15:03
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {


    /**用户登录的请求
     * @param request
     * @return
     */
    @RequestMapping(value = "/login")
    @ResponseBody
    public Object login(HttpServletRequest request){
        User user = new User();
        user.setId(1001);
        user.setName("zhangsan");
        request.getSession().setAttribute("user",user);
        return "login SUCCESS";
    }

    /**
     * @return 用户登录成功之后的页面
     */
    @RequestMapping(value = "/center")
    @ResponseBody
    public Object center(){
        return "see center MSG";
    }

    @RequestMapping(value = "/out")
    @ResponseBody
    public Object out(){
        return "out see anytime";
    }

    /**
     * @return 如果用户未登录访问了需要登录访问的请求，就跳转至改页面；
     */
    @RequestMapping(value = "/error")
    @ResponseBody
    public Object error(){
        return "error";
    }
}
