package com.ly.pojo;

import java.util.List;

public class VO {
//    VO:有人把它叫做ValueObject值对象，封装数据。也有人把它叫做viewObject，视图对象
    private List<User> userList;
//    一个集合

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
