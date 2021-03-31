package com.example.dagger_named_bindsinstance_componentbuilder.User;

import javax.inject.Inject;

public class User {

    UserInfo userInfo;

    @Inject
    public User(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void manageUser(){
        userInfo.userID();
        userInfo.userPass();
        userInfo.usreName();

        System.out.println("User Is Using The App");
    }
}
