package com.example.costa.exerciciomvp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.costa.exerciciomvp.presenter.PresenterLogin;
import com.example.costa.exerciciomvp.task.Login;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LoginActivity extends AppCompatActivity implements Login.View {

    @BindView(R2.id.user_id)
    TextView userID;

    @BindView(R2.id.password_id)
    TextView passwordID;

    @BindView(R2.id.logar)
    Button loginUser;

    PresenterLogin presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        ButterKnife.bind(this);
        presenter = new PresenterLogin(this);
    }

    public void exibirToast() {
        Toast torradinha = Toast.makeText(this, "Usuario ou senha invalido", Toast.LENGTH_LONG);
        torradinha.show();
    }

    @OnClick(R2.id.logar)
    void verificar() {
        String usrid = userID.getText().toString();
        String pswdid = passwordID.getText().toString();
        presenter.verificar(usrid, pswdid);
    }

}
