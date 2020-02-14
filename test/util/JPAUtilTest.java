/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class JPAUtilTest {
    
    public JPAUtilTest() {
    }

    @Test
    public void testJPAUtil() {
            EntityManager em=  JPAUtil.getEntityManager();
            System.out.println(em.getClass());
            em.close();
        
    }
    
}
