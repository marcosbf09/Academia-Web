/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeracaoDeRelatorios;

import CRUDs.CrudEquipamento;
import academia.Equipamento;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */


public class RelatorioEquipamentos {

    public RelatorioEquipamentos() {
    }
    
    public void gerar(int cod){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            
                
                CrudEquipamento b = new CrudEquipamento();
                em.getTransaction().begin();
                b.consultarEq(cod);
                
                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
       
        
        
    }
            
    
}
