package com.datariver.powercontroller.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("创建Swagger请求参数")
public class SwaggerReqVO {
 
    @ApiModelProperty("id")
    private Integer id;
 
    @ApiModelProperty("姓名")
    private String name;
 
    @ApiModelProperty("性别")
    private Integer gender;

        // Getter and Setter for id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for gender
    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
