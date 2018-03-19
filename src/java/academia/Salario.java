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
@Table(name="SALARIO")
public class Salario {
    
    @Id
    private int Salarioref;
    @Column(name="MES", length=100, nullable=false)
    private String mes;
    @Column(name="ANO", length=100, nullable=false)
    private String ano;
    @Column(name="HORAS_EXTRAS", length=100, nullable=false)
    private String horasextras;
    @Column(name="VALOR_TOTAL", length=100, nullable=false)
    private String valortotal;

    public Salario() {
    }

    
    
    
    public int getSalarioref() {
        return Salarioref;
    }

    public void setSalarioref(int Salarioref) {
        this.Salarioref = Salarioref;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getHorasextras() {
        return horasextras;
    }

    public void setHorasextras(String horasextras) {
        this.horasextras = horasextras;
    }

    public String getValortotal() {
        return valortotal;
    }

    public void setValortotal(String valortotal) {
        this.valortotal = valortotal;
    }
    
    
    
}
