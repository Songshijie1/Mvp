package com.example.day6.model;

import com.example.day6.bean.UserBean;

/**
 * Created by 宋世杰 on 2017/10/8.
 */

public interface IUserModel {
    void setFirstName(String firstName);
    void setLastName(String lastName);

    String getFirstName();
    String getLastName();

    UserBean load(int id);
}
