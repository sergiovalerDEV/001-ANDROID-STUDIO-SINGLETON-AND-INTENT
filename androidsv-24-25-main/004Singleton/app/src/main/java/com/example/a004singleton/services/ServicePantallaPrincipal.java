package com.example.a004singleton.services;

import android.widget.Toast;

import com.example.a004singleton.MainActivity;
import com.example.a004singleton.MainActivity2;
import com.example.a004singleton.listeners.MyListener;

public class ServicePantallaPrincipal {

    private MyListener mylistener;
    private MyListener myListener1;

    public void setMyListener(MyListener myListener){
        this.mylistener=mylistener;
    }

    public void simularAccionDeListener(){
        if (mylistener!=null){
            mylistener.onSaludar();//Esto es mejor que saludar, por única responsabilidad onclick en realidad
        }
    }

    /*public ServicePantallaPrincipal(MainActivity padre){
        this.padre = padre;
    }*/
    public void saludar(){
        Toast.makeText(MainActivity.getInstance(),
                "Saludar Android!",
                Toast.LENGTH_SHORT).show();
    }


    public void altaUsuario(){
        Toast.makeText(MainActivity2.getInstance(),
                        "Hola 2ª pantalla",
                            Toast.LENGTH_SHORT).show();
    }


}