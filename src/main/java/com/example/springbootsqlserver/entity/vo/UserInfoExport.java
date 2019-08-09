package com.example.springbootsqlserver.entity.vo;

import com.example.springbootsqlserver.entity.po.User;

import java.util.List;

/**
 * @author: xueshan.zeng
 * @date: 2019/8/9
 */
public class UserInfoExport {
    private List<User> users;
    private String total;


    public UserInfoExport() {
    }

    public UserInfoExport(List<User> users, String total) {
        this.users = users;
        this.total = total;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "UserInfoExport{" +
                "users=" + users +
                ", total='" + total + '\'' +
                '}';
    }
}
