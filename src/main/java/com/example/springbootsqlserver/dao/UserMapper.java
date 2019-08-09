package com.example.springbootsqlserver.dao;

import com.example.springbootsqlserver.entity.po.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
/**
 * @author: xueshan.zeng
 * @date: 2019/8/7
 */
@Mapper
public interface UserMapper {
    /**
     * 获取User信息
     *
     * @param pageStart 起始页码
     * @param pageEnd   结束页码
     * @param fetchAll  是否查询全部
     * @return User信息
     */
    List<User> selectModels(int pageStart, int pageEnd, boolean fetchAll);
    /**
     * 获取User信息个数
     *
     * @return User信息个数
     */
    int selectCount();
}
