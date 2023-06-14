package controller;

import dao.RedisDao;

public class ControllerAutenticacion {
    private static ControllerAutenticacion instance = null;
    private ControllerAutenticacion(){};
    private static ControllerAutenticacion getInstance(){
        if(instance == null){
            instance = new ControllerAutenticacion();
        }
        return instance;
    }
    private boolean autenticar(String user, String pass){
        String value = RedisDao.getInstance().search(user);
        if(value != null && value.equals(pass)){
            ControllerCliente.getInstance().setUser(user);
            return true;
        }
        return false;
    }
}
