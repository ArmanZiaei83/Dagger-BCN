package com.example.dagger_named_bindsinstance_componentbuilder.Dagger;

import androidx.room.Insert;
import androidx.room.PrimaryKey;

import com.example.dagger_named_bindsinstance_componentbuilder.User.InsertUserInfo;
import com.example.dagger_named_bindsinstance_componentbuilder.User.UserInfo;

import dagger.Binds;
import dagger.BindsInstance;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class UserModule {

    @Binds
    abstract UserInfo provideUserInfo(InsertUserInfo userInfo);
}
