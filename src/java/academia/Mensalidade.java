/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Marcos
 */
@Entity
@Table(name="MENSALIDADE")
public class Mensalidade {
    @Id
    private int idMensalidade;
    @Column(name="DATA_VENC", length=100, nullable=false)
    private Date dataVencimento;
    @Column(name="VALOR_TOTAL", length=100, nullable=false)
    private double valortotal;
    @Column(name="MULTA", length=100, nullable=false)
    private double multa;
    @Column(name="JUROS", length=100, nullable=false)
    private double juros;
    @Column(name="ESTADO", length=100, nullable=false)
    private String estado;

    public Mensalidade() {
    }

    public int getIdMensalidade() {
        return idMensalidade;
    }

    public void setIdMensalidade(int idMensalidade) {
        this.idMensalidade = idMensalidade;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
    
    
    
    
}
