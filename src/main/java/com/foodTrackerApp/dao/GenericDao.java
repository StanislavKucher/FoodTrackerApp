package com.foodTrackerApp.dao;

import java.util.List;

public interface GenericDao<T> extends AutoCloseable{

    T findOne(int id);

    List<T> findAll();

    Integer getCount();

    void add (T object);

    void update(T item);

    void delete(int id);



    void close();
}