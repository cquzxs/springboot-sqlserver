package com.example.springbootsqlserver.service;

import com.example.springbootsqlserver.entity.dto.UserInfoParamsDTO;
import com.example.springbootsqlserver.entity.vo.UserInfoExport;

/**
 * @author: xueshan.zeng
 * @date: 2019/8/9
 */
public interface IUserService {
    /**
     * 获取用户信息
     *
     * @param userInfoParamsDTO 用户信息请求参数
     * @return 用户信息
     */
    UserInfoExport getUserInfo(UserInfoParamsDTO userInfoParamsDTO);
}
