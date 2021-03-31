package com.example.dagger_named_bindsinstance_componentbuilder.User;

import javax.inject.Inject;

public class User {

    UserInfo userInfo;

    public User(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void manageUser(){
        System.out.println("User Is Using The App");
    }
}
