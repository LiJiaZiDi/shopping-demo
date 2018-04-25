package com.shoping.wg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.shoping.service.entity.UserEntity;

@Controller
@RequestMapping("test")
public class TestController {
	@RequestMapping(value="/test1")
	@ResponseBody
    public UserEntity HelloWorld(UserEntity userEntity){ 
		System.out.println(JSON.toJSONString(userEntity));
        return userEntity;  
    }  

}
