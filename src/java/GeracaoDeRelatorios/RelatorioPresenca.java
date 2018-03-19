/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeracaoDeRelatorios;

import CRUDs.CrudAluno;
import CRUDs.CrudEquipamento;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */


public class RelatorioPresenca {

    
    
    public RelatorioPresenca() {
        
    }
    
    
    public void gerar(int cod){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            
                
                CrudAluno b = new CrudAluno();
                em.getTransaction().begin();
                b.consultarAluno(cod);
               
                
                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
       
        
    }
    
    
    
    
}
