package dao;

import util.IGenericDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDao implements IGenericDao{
    private static SQLDao instance = null;
    private Connection connection;

    private SQLDao(String user, String pass, String address, int port) throws SQLException {
        this.connection = DriverManager.getConnection("jdbc:mariadb://" + address + ":" + port,user,pass);
    }

    public static SQLDao getInstance() throws SQLException {
        if(instance == null){
            instance = new SQLDao("root","root","127.0.0.1",3306);
        }
        return instance;
    }

    @Override
    public void save(Object obj) {}

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(Object obj) {
        return false;
    }

    @Override
    public Object search(String id) {
        return null;
    }
}
