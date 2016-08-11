package com.wsy.webseed.controller;

import com.alibaba.fastjson.JSON;
import com.wsy.webseed.service.SysUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/user")
public class SysUserController {
    @Autowired
    SysUserService sysUserServicee;

    private Logger LOGGER = LoggerFactory.getLogger(SysUserController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String query(HttpServletRequest request) {

        String result = JSON.toJSONString(sysUserServicee.query());
        LOGGER.info(result);
        return result;
    }

}
