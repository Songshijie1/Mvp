package com.example.day6.model;

import com.example.day6.bean.UserBean;

/**
 * Created by 宋世杰 on 2017/10/8.
 */

public class UserModel implements IUserModel{

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public void setLastName(String lastName) {
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public UserBean load(int id) {
        return new UserBean("张","Sam");
    }
}
