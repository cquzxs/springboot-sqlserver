package com.example.springbootsqlserver.service.impl;

import com.example.springbootsqlserver.dao.UserMapper;
import com.example.springbootsqlserver.entity.bo.BasePage;
import com.example.springbootsqlserver.entity.dto.UserInfoParamsDTO;
import com.example.springbootsqlserver.entity.po.User;
import com.example.springbootsqlserver.entity.vo.UserInfoExport;
import com.example.springbootsqlserver.service.IUserService;
import com.example.springbootsqlserver.utils.StringConvertUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: xueshan.zeng
 * @date: 2019/8/9
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    private static final String ONE = "1";

    @Resource
    private UserMapper userMapper;

    @Override
    public UserInfoExport getUserInfo(UserInfoParamsDTO userInfoParamsDTO) {
        checkParams(userInfoParamsDTO);

        BasePage basePage = StringConvertUtils.transferBasePage(userInfoParamsDTO.getPageIndex(), userInfoParamsDTO.getPageSize());
        List<User> users = userMapper.selectModels(basePage.getPageStart(), basePage.getPageEnd(), ONE.equals(userInfoParamsDTO.getFetchAll()));
        int total = userMapper.selectCount();

        return new UserInfoExport(users, total + "");
    }

    private void checkParams(UserInfoParamsDTO userInfoParamsDTO) {
        try{
            Long.parseLong(userInfoParamsDTO.getPageIndex());
            Long.parseLong(userInfoParamsDTO.getPageSize());
        }catch (Exception e){
            throw new RuntimeException("请求不合法");
        }
    }
}
