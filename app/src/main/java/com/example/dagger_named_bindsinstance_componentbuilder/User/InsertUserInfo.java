package com.example.dagger_named_bindsinstance_componentbuilder.User;

import javax.inject.Inject;
import javax.inject.Named;

public class InsertUserInfo implements UserInfo{

    int id;
    int pass;
    String name;

    @Override
    public void userID() {
        System.out.println("Id : " + id);
    }

    @Override
    public void usreName() {
        System.out.println("Name : " + name);
    }

    @Override
    public void userPass() {
        System.out.println("Password : " + pass);
    }

    @Inject
    public InsertUserInfo(@Named("id") int id,@Named("pass") int pass,@Named("name") String name) {
        this.id = id;
        this.pass = pass;
        this.name = name;
    }
}
