/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;


import academia.Fornecedor;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudFornecedor {

    public CrudFornecedor() {
    }
    
        public void CadastrarFornecedor(String nome, String cnpj, String telefone, String nomefantasia, String endereco, String cidade, String estado, String email, String numero, String bairro){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();

                Fornecedor a = new Fornecedor();

                a.setCnpj(cnpj);
                a.setRazaoSocial(nome);
                a.setBairro(bairro);
                a.setCidade(cidade);
                a.setEmail(email);
                a.setEndereco(endereco);
                a.setNomefantasia(nomefantasia);
                a.setNumero(numero);
                a.setRazaoSocial(email);
                a.setTelefone(telefone);
                
                
                

                em.getTransaction().begin();
                
                em.persist(a);
                
               
                
                em.getTransaction().commit();


                

            
        } catch (Exception e) {

        }
        
            
    }
        
    public void ExcluirFornecedor(int id){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            
                
                em.getTransaction().begin();
                
                em.remove(id);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
        public void consultarFornecedor(int id){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            

                
                
                em.getTransaction().begin();
                
                Fornecedor b = em.find(Fornecedor.class, id);
                String nome = b.getRazaoSocial();
                String cnpj = b.getCnpj();
                String endereco = b.getEndereco();
                String telefone = b.getTelefone();
               

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarFornecedor(int id, String nome, String cnpj, String telefone, String nomefantasia, String endereco, String cidade, String estado, String email, String numero, String bairro){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();

           

                em.getTransaction().begin();
                
                Fornecedor a = em.find(Fornecedor.class, id);
                
               a.setBairro(bairro);
               a.setCidade(cidade);
               a.setCnpj(cnpj);
               a.setEmail(email);
               a.setEndereco(endereco);
               a.setEstado(estado);
               a.setNomefantasia(nomefantasia);
               a.setNumero(numero);
               a.setTelefone(telefone);
               a.setRazaoSocial(nome);
                

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
}
