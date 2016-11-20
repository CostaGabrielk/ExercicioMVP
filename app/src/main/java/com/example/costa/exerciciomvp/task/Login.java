package com.example.costa.exerciciomvp.task;


public interface Login {

    interface View{

        void exibirToast();
    }

    interface presenter{

        void verificar(String usrid, String pswdid);
    }
}
