package dao;

import com.datastax.oss.driver.api.core.CqlSession;
import util.IGenericDao;

import java.net.InetSocketAddress;

public class CassandraDao implements IGenericDao {
    private static CassandraDao instance = null;
    private CqlSession session;
    private CassandraDao(String address, int port){
        this.session = CqlSession.builder().addContactPoint(new InetSocketAddress(address,port)).build();
    }
    public static CassandraDao getInstance(){
        if(instance == null){
            instance = new CassandraDao("127.0.0.1",9160);
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
