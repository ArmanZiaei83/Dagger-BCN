package com.example.dagger_named_bindsinstance_componentbuilder.Dagger;

import com.example.dagger_named_bindsinstance_componentbuilder.MainActivity;
import com.example.dagger_named_bindsinstance_componentbuilder.User.User;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Provides;

@Component(modules = UserModule.class)
public interface UserComponent {

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder bindsUserID(@Named("id") int userId);
        @BindsInstance
        Builder userName(@Named("name") String name);
        @BindsInstance
        Builder bindsUserPass(@Named("pass") int pass);

        UserComponent build();
    }
}
