package com.demo.db4h2.service;

import java.util.List;

public interface BaseService<T, ID>{
    // Save operation
    T save(T t);

    // Read operation
    List<T> findAll();

    // Update operation
    T update(T t);

    // Delete operation
    void delete(ID id);
}
