/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academia;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;



/**
 *
 * @author Marcos
 */

@Entity
public class Administrador extends Funcionario implements Serializable{

    
    public Administrador() {
        
    }
    
}
