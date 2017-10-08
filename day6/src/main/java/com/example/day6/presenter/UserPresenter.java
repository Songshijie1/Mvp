package com.example.day6.presenter;

import com.example.day6.bean.UserBean;
import com.example.day6.model.IUserModel;
import com.example.day6.model.UserModel;
import com.example.day6.view.UserView;

/**
 * Created by 宋世杰 on 2017/10/8.
 * 用途 实现连接Model层和View层的作用
 */

public class UserPresenter {
    private UserView userview;
    private final IUserModel iUserModel;

    public UserPresenter(UserView userView) {
        this.userview = userView;
        iUserModel = new UserModel();
    }
    //保存数据
    public void saveUser(int id,String firstName,String lastName){
        UserBean userBean = iUserModel.load(id);
    }
    //查询数据
    public void find(int id){
        UserBean userBean = iUserModel.load(id);
        String firstName = userBean.getFirstName();
        String lastName = userBean.getLastName();
        userview.setLastName(lastName);
        userview.setFirstName(firstName);
    }
}
