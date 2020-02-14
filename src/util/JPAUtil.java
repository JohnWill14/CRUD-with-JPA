/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author usuario
 */
public class JPAUtil {
    private final static EntityManagerFactory emf=Persistence.createEntityManagerFactory("hibernate");
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
