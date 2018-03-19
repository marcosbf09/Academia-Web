/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
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
@Table(name="PESSOA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TIPO_PESSOA")

public class Pessoa implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected int id;
    
    @Column(name="NOME", length=100)
    protected String nome;
    @Column(name="RG", length=100)
    protected String rg;
    @Column(name="TELEFONE", length=100)
    protected String telefone;
    @Column(name="ENDERECO", length=100)
    protected String endereco;
    @Column(name="DATANASC", length=100)
    protected String  dataNasc;
    @Column(name="CPF", length=100)
    protected String cpf;
    @Column(name="PESO", length=100)
    protected String peso;
    @Column(name="ALTURA", length=100)
    protected String altura;
    @Column(name="EMAIL", length=100)
    protected String email;
    @Column(name="CIDADE", length=100)
    protected String cidade;
    @Column(name="ESTADO", length=100)
    protected String estado;
    

  
    
    
    public Pessoa() {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
}
