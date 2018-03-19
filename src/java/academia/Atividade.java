/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name="ATIVIDADE")

public class Atividade {
    @Id
    private int idAtividade;
    @Column(name="NOME_ATIVIDADE", length=100, nullable=false)
    private String nomeatividade;
    @Column(name="DESCRICAO", length=100, nullable=false)
    private String descricao;
    

    public Atividade() {
    }

    public int getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(int idAtividade) {
        this.idAtividade = idAtividade;
    }

    public String getNomeatividade() {
        return nomeatividade;
    }

    public void setNomeatividade(String nomeatividade) {
        this.nomeatividade = nomeatividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
