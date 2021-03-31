package com.example.dagger_named_bindsinstance_componentbuilder.Dagger;

import com.example.dagger_named_bindsinstance_componentbuilder.MainActivity;

import dagger.Component;
import dagger.Provides;

@Component(modules = UserModule.class)
public interface UserComponent {

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

    }
}
