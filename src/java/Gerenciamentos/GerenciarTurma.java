/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciamentos;

import academia.Aluno;
import academia.Atividade;
import academia.Professor;
import academia.Turma;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */
public class GerenciarTurma {
    
 
    public GerenciarTurma() {
    }
    
    public void Alocar(Professor prof, Aluno aluno, Atividade atividade, String dataInicio, String dataTermino){
        
        EntityManager em = null; 
        
        try {

        em = PersistenciaPU.createEntityManager();
        
        
        
        Turma turma = new Turma();
        
        turma.setAluno(aluno);
        turma.setProfessor(prof);
        turma.setAtividade(atividade);
        turma.setDataInicio(dataInicio);
        turma.setDataTermino(dataTermino);
        
         
                em.getTransaction().begin();
                
                em.persist(turma);
                
                em.getTransaction().commit();

        
        }catch (Exception e) {

        }
    }
    
    
    
}
