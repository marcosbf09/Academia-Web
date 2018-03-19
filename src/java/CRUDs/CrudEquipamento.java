/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import academia.Equipamento;
import academia.Fornecedor;
import academia.Produto;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudEquipamento {


    public CrudEquipamento() {
    }
    
    public void CadastrarEquipamento(int  codigo, String descricao, String tipo, String estado){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            
                Equipamento a = new Equipamento();


                
                a.setCodigo(codigo); 
                a.setDescricao(descricao);
                a.setTipoEquipamento(tipo);
                a.setEstado(estado);

                em.getTransaction().begin();
                
                em.persist(a);
                
                em.getTransaction().commit();


                

            
        } catch (Exception e) {

        }
        
            
    }
    
    public void excluirEquipamento(int codigo){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();

                
                em.getTransaction().begin();
                
                em.remove(codigo);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    public void consultarEq(int cod){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            
                
                em.getTransaction().begin();
                
                Equipamento b = em.find(Equipamento.class, cod);
                String desc = b.getDescricao();
                String estado = b.getEstado();
                String tipo = b.getTipoEquipamento();
               

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarEq(int cod, String estado, String descricao, String tipoEquipamento){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();


                em.getTransaction().begin();
                
                Equipamento a = em.find(Equipamento.class, cod);
                
                   
                    a.setEstado(estado);
                    a.setDescricao(descricao);
                    a.setTipoEquipamento(tipoEquipamento);
                

 

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
}
