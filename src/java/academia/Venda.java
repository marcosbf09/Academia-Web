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
@Table(name="VENDA")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Venda {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idvenda;
    
    @Column(name="DATA", length=100)
    private String datavenda;
    @Column(name="VALORTOTAL", length=100)
    private String valortotal;
    @Column(name="ITENS", length=100)
    private Produto itens;
    
    public Venda() {
    }

    
    public int getIdvenda() {
        return idvenda;
    }

    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

    public String getDatavenda() {
        return datavenda;
    }

    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }

    public String getValortotal() {
        return valortotal;
    }

    public void setValortotal(String valortotal) {
        this.valortotal = valortotal;
    }

    public Produto getItens() {
        return itens;
    }

    public void setItens(Produto itens) {
        this.itens = itens;
    }
    
    
    
    
   
}
