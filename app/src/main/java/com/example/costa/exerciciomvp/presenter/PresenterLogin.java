package com.example.costa.exerciciomvp.presenter;


import android.app.Activity;
import android.content.Intent;

import com.example.costa.exerciciomvp.HomeActivity;
import com.example.costa.exerciciomvp.LoginActivity;


public class PresenterLogin {

    LoginActivity activity;

    public PresenterLogin(LoginActivity activity) {
        this.activity = activity;
    }

    public void verificar(String usrid, String pswdid) {
        if (usrid.equals("usuario") && pswdid.equals("mvp")) {

            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            
            LoginActivity.this.startActivity(intent);

        }
        activity.exibirToast();
    }

}

