/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.core.dao;

import java.util.List;

/**
 *
 * @author Admin_GYAN
 * @param <T>
 */
public interface GenericDAO<T> {
    void insert(T t);
    void update(T t);
    List<T> getAll();
    T getById(int id);
    void delete (int id);
    
}
