/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciamentos;

import academia.Produto;
import academia.Turma;
import academia.Venda;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */
public class GerenciarVendas {
    
    

    public GerenciarVendas() {
    }
    
    public void gerencia(Produto produto, String datavenda, String valortotal){
       EntityManager em = null; 
        
        try {
            
            Venda venda = new Venda();

        em = PersistenciaPU.createEntityManager();
        
        venda.setItens(produto);
        venda.setDatavenda(datavenda);
        venda.setValortotal(valortotal);

                em.getTransaction().begin();
                
                em.persist(venda);
                
                em.getTransaction().commit();

        
        }catch (Exception e) {

        } 
    }
}
