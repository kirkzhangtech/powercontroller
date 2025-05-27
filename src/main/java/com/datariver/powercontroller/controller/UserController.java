package com.datariver.powercontroller.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags = "角色管理") //  tags：你可以当作是这个组的名字。
@RequestMapping("/users")
@RestController
public class UserController {
    @GetMapping("/info") 
    public String info(String id){
        return "aaa";
    }
}
