package com.example.mmp.model;

import com.example.mmp.bean.UserBean;

/**
 * Created by 宋世杰 on 2017/9/27.
 */

public interface IUserModel {
    void setFirstName(String firstName);

    void setLastName(String lastName);

    String getFirstName();

    String getLastName();

    UserBean load(int id);


}
