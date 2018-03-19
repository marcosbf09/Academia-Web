/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Marcos
 */

@Entity
@Table(name="FORNECEDOR")
public class Fornecedor implements Serializable {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @Column(name="CNPJ", length=100)
    private String cnpj;
    @Column(name="RAZAO_SOCIAL", length=100)
    private String razaoSocial;
    @Column(name="ENDERECO", length=100)
    private String endereco;
    @Column(name="TELEFONE", length=100)
    private String telefone;
    @Column(name="NOME_FANTASIA", length=100)
    private String nomefantasia;
    @Column(name="CIDADE", length=100)
    private String cidade;
    @Column(name="ESTADO", length=100)
    private String estado;
    @Column(name="EMAIL", length=100)
    private String email;
    @Column(name="NUMERO", length=100)
    private String numero;
    @Column(name="BAIRRO", length=100)
    private String bairro;
    
    


    public Fornecedor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
    
    
}
