package dao;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import util.IGenericDao;

public class MongoDBDao implements IGenericDao {
    private static MongoDBDao instance = null;
    private MongoClient client;

    private MongoDBDao(String user, String pass, String address, int port) {
        String uri = "mongodb://" + user + ":" + pass + "@" + address + ":" + port;
        MongoClientSettings settings = MongoClientSettings.builder().applyConnectionString(new ConnectionString(uri)).build();
        this.client = MongoClients.create(settings);
    }

    public static MongoDBDao getInstance(){
        if(instance==null){
            instance = new MongoDBDao("root","root","127.0.0.1",27017);
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

