/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crud.dao;

import br.com.crud.bean.ClienteBean;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import util.JPAUtil;

/**
 *
 * @author usuario
 */
public class ClienteDao implements IDao<ClienteBean>{
    private static EntityManager em;

    public ClienteDao() {
        super();
    }
    
    private static void inicicializaEntityManager(){
        em=JPAUtil.getEntityManager();
    }
    private static void confirmaFrom(){
        em.getTransaction().commit();
        em.close();
    }
    
    private static void confirma(){
        em.close();
    }
    @Override
    public void persiste(ClienteBean obj) {
        ClienteDao.inicicializaEntityManager();
        em.getTransaction().begin();
        em.persist(obj);
        ClienteDao.confirmaFrom();
    }

    @Override
    public void merge(ClienteBean obj) {
        ClienteDao.inicicializaEntityManager();
        em.getTransaction().begin();
        em.merge(obj);
        ClienteDao.confirmaFrom();
    }

    @Override
    @SuppressWarnings("unchecked") 
    public List<ClienteBean> findAll() {
        ClienteDao.inicicializaEntityManager();
        em.getTransaction().begin();
        Query query= em.createQuery("select c from ClienteBean c",ClienteBean.class);
        List<ClienteBean> lista=query.getResultList();
        ClienteDao.confirma();
        return lista;
    }

    @Override
    public ClienteBean getById(int id) {
        ClienteDao.inicicializaEntityManager();
        ClienteBean bean=em.find(ClienteBean.class, id);
        ClienteDao.confirma();
        return bean;
    }

    @Override
    public void remove(ClienteBean obj) {
        removeId(obj.getId());
    }

    @Override
    public void removeId(int id) {
        ClienteDao.inicicializaEntityManager();
        em.getTransaction().begin();
        ClienteBean obj=em.find(ClienteBean.class, id);
        em.remove(obj);
        ClienteDao.confirmaFrom();

    }
    
}
