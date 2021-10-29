/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.ArrayList;
import java.util.List;
import modelo.dto.ContactoDTO;

/**
 *
 * @author Lino Heredia
 */
public class ContactoDAO {

    private static final List<ContactoDTO> lista= new ArrayList<ContactoDTO>();

    public ContactoDAO() {
        
    }

    public List<ContactoDTO> readAll() {

        return lista;
    }
    
    public void create(ContactoDTO nuevo)  {

      lista.add(nuevo);
    }
    public boolean delete(ContactoDTO elim ){
        
       return lista.remove(elim);
    }
}
