package com.example.mmp.presenter;

import com.example.mmp.bean.UserBean;
import com.example.mmp.model.IUserModel;
import com.example.mmp.model.UserModel;
import com.example.mmp.view.UserView;

/**
 * Created by 宋世杰 on 2017/9/27.
 */

public class UserPresenter {
        private UserView userView;
        private final IUserModel iUserModel;

    public UserPresenter( UserView userView) {
        iUserModel = new UserModel();
        this.userView = userView;
    }
    //保存数据
    public void savaUser(int id ,String firstName ,String lastName){
        UserBean userbean = iUserModel.load(id);
    };

    //查找数据
    public void find(int id){
        UserBean userbean = iUserModel.load(id);
        String firstName = userbean.getFirstName();
        String lastName = userbean.getLastName();
        userView.setFirstName(firstName);
        userView.setLastName(lastName);
    }
}
