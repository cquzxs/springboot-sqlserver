package com.example.springbootsqlserver.controller;

import com.example.springbootsqlserver.entity.dto.UserInfoParamsDTO;
import com.example.springbootsqlserver.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: xueshan.zeng
 * @date: 2019/8/9
 */
@RestController
public class UserController {
    @Resource
    private IUserService userService;

    @GetMapping("userInfo")
    public Object getUserInfo(String pageIndex, String pageSize, String fetchAll){
        UserInfoParamsDTO userInfoParamsDTO = new UserInfoParamsDTO(pageIndex,pageSize,fetchAll);
        return userService.getUserInfo(userInfoParamsDTO);
    }

}
