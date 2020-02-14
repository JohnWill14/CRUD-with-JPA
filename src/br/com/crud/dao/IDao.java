/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crud.dao;

import java.util.List;



/**
 *
 * @author usuario
 */
public interface IDao<T> {
    public void persiste(T obj);
    public void merge(T obj);
    public List<T> findAll();
    public T getById(int id);
    public void remove(T obj);
    public void removeId(int id);
}
