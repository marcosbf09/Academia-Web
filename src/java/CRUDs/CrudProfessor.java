/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUDs;

import academia.Administrador;
import academia.Aluno;
import academia.Professor;
import java.util.Scanner;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */

public class CrudProfessor {

    public CrudProfessor() {
    }
    
    public void CadastrarProfessor(String nome, String endereco, String telefone, String cidade, String estado, String numero, String bairro, String email, String rg, String cpf){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();

                Professor a = new Professor();
                a.setCidade(cidade);
                a.setNome(nome);
                a.setEndereco(endereco);
                a.setEstado(estado);
                a.setTelefone(telefone);
                a.setEmail(email);
                a.setCpf(cpf);
                a.setRg(rg);
                
                
                em.getTransaction().begin();
                
                em.persist(a);
                
                em.getTransaction().commit();


               

          
        } catch (Exception e) {

        }
        
            
    }
    
    public void ExcluirProfessor(){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            Scanner entrada = new Scanner(System.in);
            int cpf;

                System.out.println("Digite o cpf do professor: ");
                cpf = entrada.nextInt();
                
                em.getTransaction().begin();
                
                em.remove(cpf);

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    public void consultarProf(int id){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();
            em.getTransaction().begin();
                
                Professor b = em.find(Professor.class, id);
                String nome = b.getNome();
                
                String cpf = b.getCpf();
                String rg = b.getRg();
                String end = b.getEndereco();
                String tel = b.getTelefone();
                String datanasc= b.getDataNasc();
                String funcao= b.getFuncao();
                String admissao = b.getDataAdmissao();
                String datadem= b.getDataDemissao();
                int salario = b.getSalarioRef();

                

                em.getTransaction().commit();
 
        } catch (Exception e) {

        }
    }
    
    
    
    
    public void atualizarProf(int id, String nome, String endereco, String datanasc, String funcao, String dataad, String datadem, String cpf, String rg, String telefone, String email){
        EntityManager em = null; 
        
        try {

            em = PersistenciaPU.createEntityManager();

              

           
                
                em.getTransaction().begin();
                
                Administrador a = em.find(Administrador.class, id);
                a.setDataNasc(datanasc);
                a.setDataAdmissao(dataad);
                a.setEmail(email);
                a.setRg(rg);
                a.setCpf(cpf);
                a.setNome(nome);
                a.setEndereco(endereco);
               
  
                em.getTransaction().commit();
                

             
 
        } catch (Exception e) {

        }
    }
}
