/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Marcos
 */

@Entity
@Table(name="TURMA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Turma {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idTurma;
    @Column(name="DATA", length=100)
    private String dataInicio;
    @Column(name="TERMINO", length=100)
    private String dataTermino;
    @Column(name="PROFESSOR", length=100)
    private Professor professor;
    @Column(name="ALUNO", length=100)
    private Aluno aluno;
    @Column(name="ATIVIDADE", length=100)
    private Atividade atividade;

    public Turma() {
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
    
    
    
}
