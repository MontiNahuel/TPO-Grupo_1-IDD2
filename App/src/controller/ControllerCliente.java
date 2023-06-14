package controller;

import model.Cliente;

import javax.naming.ldap.Control;

public class ControllerCliente {
    private static ControllerCliente instance = null;
    private Cliente datos = new Cliente();

    private ControllerCliente(){};

    public static ControllerCliente getInstance(){
        if(instance == null){
            instance = new ControllerCliente();
        }
        return instance;
    }

    public void setUser(String user){
        this.datos.setUsuario(user);
    }
}
