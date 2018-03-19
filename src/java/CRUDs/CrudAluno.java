/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import Servlets.NovoServlet;
import academia.Aluno;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudAluno {

    
    public CrudAluno() {
    }
    
    public void CadastrarAluno(String nome, String datanasc, String endereco, String rg, String cpf, String telefone, String peso, String altura, String email, String estado, String cidade){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();

                Aluno a = new Aluno();
                //a.setCpf(cpf);
                
                a.setNome(nome);  
                    
                a.setRg(rg);
                
                a.setTelefone(telefone);
                a.setEndereco(endereco);
                a.setDataNasc(datanasc);
                //a.setMensalidadeRef(mensalidade);
                //a.setDataMatricula(datamatr);
                //a.setDataCancelMatr(datacancel);
                a.setAltura(altura);
                a.setPeso(peso);
                a.setCidade(cidade);
                a.setEstado(estado);
                a.setEmail(email);

                em.getTransaction().begin();
                
                em.persist(a);
                
                em.getTransaction().commit();



            
        } catch (Exception e) {

        }
        
            
    }
    
    public void excluirAluno(int id){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
           

                em.getTransaction().begin();

                em.remove(id);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    public void consultarAluno(int id){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();

                em.getTransaction().begin();
                
                Aluno b = em.find(Aluno.class, id);
                b.getNome();

                String cpf = b.getCpf();
                String rg = b.getRg();
                String end = b.getEndereco();
                String fone = b.getTelefone();
                String datanasc = b.getDataNasc();
                String datamatr = b.getDataMatricula();
                String datacancel = b.getDataCancelMatr();
                int mensalidade = b.getMensalidadeRef();

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarAluno(int id, String nome, String endereco, String telefone, String cidade, String estado, String numero, String bairro, String email, String rg, String cpf, String datanasc, int mensalidade, String datamatr, String datacancel){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
 ;

                em.getTransaction().begin();
                
                Aluno a = em.find(Aluno.class, id);


                    a.setNome(nome);

                    a.setRg(rg);
                    
                    a.setCpf(cpf);

                    a.setTelefone(telefone);
   
                    a.setEndereco(endereco);
 
                    a.setDataNasc(datanasc);

                    a.setMensalidadeRef(mensalidade);

                    a.setDataMatricula(datamatr);
 
                    a.setDataCancelMatr(datacancel);
                    
                    a.setCidade(cidade);
                    
                    a.setEstado(estado);
                    
                    
                

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
}
