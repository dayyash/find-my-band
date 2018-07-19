package com.findmyband.data;

import java.io.Serializable;

public interface BaseDao <T> {
    T save(T t);
    T getById(Serializable id);
    T getByObject(T t);
}
