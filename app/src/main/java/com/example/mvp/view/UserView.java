package com.example.mvp.view;

/**
 * Created by 宋世杰 on 2017/9/27.
 */

public interface UserView {
    void setFiretName(String firstName);
    void setLastName(String lastName);

    int getId();

    String getFirstName();
    String getLastName();
}
