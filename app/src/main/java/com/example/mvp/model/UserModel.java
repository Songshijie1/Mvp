package com.example.mvp.model;

import android.util.Log;

import com.example.mvp.bean.UserBean;

/**
 * Created by 宋世杰 on 2017/9/27.
 */

public class UserModel implements IUserModel{

    @Override
    public void setFirstName(String firstName) {
        Log.i("xxx",firstName);
    }

    @Override
    public void setLastName(String lastName) {
        Log.i("xxx", lastName);
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
        return new UserBean("宋世杰","12138");
    }
}
