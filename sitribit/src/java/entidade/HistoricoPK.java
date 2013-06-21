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
public class HistoricoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "idGestao", nullable = false)
    private int idGestao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCargo", nullable = false)
    private int idCargo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFuncionario", nullable = false)
    private int idFuncionario;

    public HistoricoPK() {
    }

    public HistoricoPK(int idGestao, int idCargo, int idFuncionario) {
        this.idGestao = idGestao;
        this.idCargo = idCargo;
        this.idFuncionario = idFuncionario;
    }

    public int getIdGestao() {
        return idGestao;
    }

    public void setIdGestao(int idGestao) {
        this.idGestao = idGestao;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idGestao;
        hash += (int) idCargo;
        hash += (int) idFuncionario;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoricoPK)) {
            return false;
        }
        HistoricoPK other = (HistoricoPK) object;
        if (this.idGestao != other.idGestao) {
            return false;
        }
        if (this.idCargo != other.idCargo) {
            return false;
        }
        if (this.idFuncionario != other.idFuncionario) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.HistoricoPK[ idGestao=" + idGestao + ", idCargo=" + idCargo + ", idFuncionario=" + idFuncionario + " ]";
    }
    
}
