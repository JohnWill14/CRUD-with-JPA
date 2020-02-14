/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.crud.dao;

import br.com.crud.bean.ClienteBean;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ClienteDaoTest {
    private ClienteDao dao;
    private ClienteBean cliente;
    {
        dao=new ClienteDao();
        cliente=new ClienteBean();
    }
    public ClienteDaoTest() {
    }

    /**
     * Test of persiste method, of class ClienteDao.
     */
    //@Test
    public void testPersiste() {
      ClienteBean[] cli={
          new ClienteBean(0, "Ligth Yagame", "213.988.903-54"),
          new ClienteBean(0, "Charle Lecclerc", "447.664.323-65"),
          new ClienteBean(0, "Verstapen", "312.544.212-66"),
          new ClienteBean(0, "Bolsonaro", "213.988.903-54"),
          new ClienteBean(0, "I'am L", new StringBuffer("213.988.903-54").reverse().toString())
          
      };
      for(ClienteBean c:cli){
          dao.persiste(c);
      }
    }

    /**
     * Test of merge method, of class ClienteDao.
     */
    @Test
    public void testMerge() {
      cliente.setId(1);
      cliente.setNome("John William Vicente");
      cliente.setCpf("123.453.212-54");
      dao.merge(cliente);
    }

    /**
     * Test of findAll method, of class ClienteDao.
     */
    @Test
    public void testFindAll() {
        List<ClienteBean> lista=dao.findAll();
        for(ClienteBean i:lista){
            System.out.println("====================");
            System.out.println("ID:   "+i.getId());
            System.out.println("Nome: "+i.getNome());
            System.out.println("CPF:  "+i.getCpf());
        }
    }

    /**
     * Test of getById method, of class ClienteDao.
     */
    @Test
    public void testGetById() {
        System.out.println("O ID");
        ClienteBean i=dao.getById(5);
        System.out.println("========== ID ==========");
            System.out.println("ID:   "+i.getId());
            System.out.println("Nome: "+i.getNome());
            System.out.println("CPF:  "+i.getCpf());
    }

    /**
     * Test of remove method, of class ClienteDao.
     */
    @Test
    public void testRemove() {
        ClienteBean bean=dao.getById(5);
        dao.remove(bean);
    }

    /**
     * Test of removeId method, of class ClienteDao.
     */
    @Test
    public void testRemoveId() {
        dao.removeId(1);
    }
    
}
