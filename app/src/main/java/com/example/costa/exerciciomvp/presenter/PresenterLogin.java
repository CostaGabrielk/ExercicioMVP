package com.example.costa.exerciciomvp.presenter;


import android.content.Intent;


import com.example.costa.exerciciomvp.LoginActivity;
import com.example.costa.exerciciomvp.task.Login;


public class PresenterLogin implements Login.presenter {

    LoginActivity activity;

    public PresenterLogin(LoginActivity activity) {
        this.activity = activity;
    }

    public void verificar(String usrid, String pswdid) {
        if (usrid.equals("usuario") && pswdid.equals("mvp")) {
            Intent intent = new Intent("com.example.costa.exerciciomvp.HomeActivity");
            activity.startActivity(intent);
        } else {
            activity.exibirToast();
        }
    }

}

