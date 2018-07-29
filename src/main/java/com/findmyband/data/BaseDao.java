package com.findmyband.data;

import java.io.Serializable;
import java.util.List;

public interface BaseDao <T> {
    T save(T t);
    T getById(Serializable id);
    T getByObject(T t);
    List<T> getAll();
}
