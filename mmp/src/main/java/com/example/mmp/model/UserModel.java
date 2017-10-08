package com.example.mmp.model;

import com.example.mmp.bean.UserBean;

/**
 * Created by 宋世杰 on 2017/9/27.
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
        return new UserBean("德玛西亚","艾欧尼亚");
    }
}
