package com.datariver.powercontroller.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datariver.powercontroller.entity.SwaggerReqVO;
import com.datariver.powercontroller.entity.SwaggerResVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/swagger")
@Api(value = "用户接口", tags = {"用户接口"})
public class SwaggerController {
 
    @ApiOperation("新增用户")
    @PostMapping("save")
    public String save(@RequestBody SwaggerReqVO req) {
        return "success";
    }
 
    @GetMapping("getById")
    @ApiOperation("根据条件查询用户")
    public SwaggerResVO getById(@RequestBody SwaggerResVO req) {
        return new SwaggerResVO();
    }
}
