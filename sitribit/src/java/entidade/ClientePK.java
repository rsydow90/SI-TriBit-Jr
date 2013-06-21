/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Gabriela
 */
@Embeddable
public class ClientePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCliente", nullable = false)
    private int idCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipo", nullable = false)
    private int idTipo;

    public ClientePK() {
    }

    public ClientePK(int idCliente, int idTipo) {
        this.idCliente = idCliente;
        this.idTipo = idTipo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idCliente;
        hash += (int) idTipo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientePK)) {
            return false;
        }
        ClientePK other = (ClientePK) object;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (this.idTipo != other.idTipo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.ClientePK[ idCliente=" + idCliente + ", idTipo=" + idTipo + " ]";
    }
    
}
