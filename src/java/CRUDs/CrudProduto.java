/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import academia.Aluno;
import academia.Produto;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudProduto {
    

    public CrudProduto() {
    }
    
    
    public void cadastrarProduto(int id, String nome, int valor, int estoque){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            
                Produto a = new Produto();

                
                
                a.setNomeProduto(nome);

                a.setIdProduto(id);

                a.setValorVenda(valor);

                a.setEstoque(estoque);
                
                em.getTransaction().begin();
                
                em.persist(a);
                
                em.getTransaction().commit();


              
        } catch (Exception e) {

        }
    
    }
    
    public void excluirProduto(int id){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
           
                
                em.getTransaction().begin();
                
                em.remove(id);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    public void consultarProd(int id){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();

            
                
                em.getTransaction().begin();
                
                Produto b = em.find(Produto.class, id);
                String nome = b.getNomeProduto();
             
                int estoque = b.getEstoque();
                double valor = b.getValorVenda();
               

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarProd(int id, String nome, int estoque, double valor){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
  
                em.getTransaction().begin();
                
                Produto a = em.find(Produto.class, id);

                    a.setNomeProduto(nome);

                    a.setEstoque(estoque);
                
                    a.setValorVenda(valor);
                
 

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
}
