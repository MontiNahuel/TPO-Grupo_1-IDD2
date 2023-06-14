package util;

import java.util.List;

public interface IGenericDao<T> {
    void save(T obj);
    boolean delete(int id);
    boolean update(T obj);
    T search(String id);
}
