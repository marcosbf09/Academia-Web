/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciamentos;

import academia.Aluno;
import academia.Mensalidade;
import academia.Turma;
import java.util.Date;
import javax.persistence.EntityManager;
import modelo.persistencia.PersistenciaPU;

/**
 *
 * @author Marcos
 */
public class GerenciarMensalidades {
    
    private Mensalidade mensalidade;
    
    public void gerencia(Date data, int id){
        EntityManager em = null; 
        
        try {

        em = PersistenciaPU.createEntityManager();
        
        em.getTransaction().begin();
                
        Mensalidade m = em.find(Mensalidade.class, id);
        Date datavenc = m.getDataVencimento();
        
        if(datavenc==data){
            double valor = m.getValortotal(); //mostra na tela
            m.setEstado("PAGA");
        } else {
            //aplicar juros
            double juros = 0.2;
            m.setJuros(juros);
            double valortotal = juros*m.getValortotal();
            m.setValortotal(valortotal);
            m.setEstado("PAGA");
        }
        em.getTransaction().commit();

        
        }catch (Exception e) {

        }
        
    }
}
