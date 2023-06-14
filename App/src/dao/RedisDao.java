package dao;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import util.IGenericDao;

public class RedisDao implements IGenericDao {
    private static RedisDao instance = null;
    private Jedis jedis;
    private RedisDao(String address, int port) {
        JedisPool pool = new JedisPool(address,port);
        this.jedis = pool.getResource();
    }

    public static RedisDao getInstance(){
        if(instance == null){
            instance = new RedisDao("127.0.0.1", 6379);
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
    public String search(String key) {
        return this.jedis.get(key);
    }
}
