package com.gobestsoft.bigdata.controller;

import com.gobestsoft.bigdata.service.LoginService;
import com.gobestsoft.bigdata.utils.CookiesUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController extends PageController{

    @Resource
    private LoginService loginService;


    @PostMapping("/checkUser")
    @ResponseBody
    public int checkUser(String username, String password, HttpServletResponse response) {

        int res = 0;
        try {
            res = loginService.queryUserByUsernameAndPassword( username, password );
            if (res > 0){
                CookiesUtils.setToken( username + password, CookiesUtils.Token_Name, response );
            }
        } catch (Exception e) {
            res = 0;
            e.printStackTrace();
        }
        return res;

    }

}
