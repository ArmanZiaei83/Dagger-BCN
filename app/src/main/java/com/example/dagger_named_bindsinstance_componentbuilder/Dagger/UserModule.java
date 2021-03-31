package com.example.dagger_named_bindsinstance_componentbuilder.Dagger;

import androidx.room.PrimaryKey;

import dagger.Module;
import dagger.Provides;

@Module
public class UserModule {

    int id;
    
    @Provides
    int provideUserId(){
        return id;
    }
}
