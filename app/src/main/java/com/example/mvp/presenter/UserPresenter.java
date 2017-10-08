package com.example.mvp.presenter;

import com.example.mvp.bean.UserBean;
import com.example.mvp.model.IUserModel;
import com.example.mvp.model.UserModel;
import com.example.mvp.view.UserView;

/**
 * Created by 宋世杰 on 2017/9/27.
 */

public class UserPresenter {
    private UserView userView;
    private final IUserModel iUserModel;

    public UserPresenter(UserView userView) {
        this.userView = userView;
        iUserModel = new UserModel();
    }
    //保存数据
    public void savaUser(int id,String firstName,String lastName){
        UserBean userBean = iUserModel.load(id);
    }
    //查询数据
    public void find(int id){
        UserBean userBean = iUserModel.load(id);
        String firstName = userBean.getFirstName();
        String lastName = userBean.getLastName();
        userView.setFiretName(firstName);
        userView.setLastName(lastName);
    }
}
