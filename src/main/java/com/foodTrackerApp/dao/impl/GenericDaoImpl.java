package com.foodTrackerApp.dao.impl;

import com.foodTrackerApp.dao.GenericDao;
import java.util.List;

public class GenericDaoImpl <T> implements GenericDao <T> {
    @Override
    public T findOne(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> findAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Integer getCount() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(T object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(T item) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }
}
