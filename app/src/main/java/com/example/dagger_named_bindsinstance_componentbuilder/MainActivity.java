package com.example.dagger_named_bindsinstance_componentbuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger_named_bindsinstance_componentbuilder.Dagger.DaggerUserComponent;
import com.example.dagger_named_bindsinstance_componentbuilder.Dagger.UserComponent;
import com.example.dagger_named_bindsinstance_componentbuilder.User.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    User user;

    UserComponent component;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerUserComponent.builder()
                .bindsUserID(1)
                .bindsUserPass(4750)
                .userName("ArmanZiaei")
                .build();
        component.inject(this);
        user.manageUser();
    }
}