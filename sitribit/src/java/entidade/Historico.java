/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gabriela
 */
@Entity
@Table(name = "historico")
@NamedQueries({
    @NamedQuery(name = "Historico.findAll", query = "SELECT h FROM Historico h"),
    @NamedQuery(name = "Historico.findByIdGestao", query = "SELECT h FROM Historico h WHERE h.historicoPK.idGestao = :idGestao"),
    @NamedQuery(name = "Historico.findByIdCargo", query = "SELECT h FROM Historico h WHERE h.historicoPK.idCargo = :idCargo"),
    @NamedQuery(name = "Historico.findByIdFuncionario", query = "SELECT h FROM Historico h WHERE h.historicoPK.idFuncionario = :idFuncionario"),
    @NamedQuery(name = "Historico.findByDataInicio", query = "SELECT h FROM Historico h WHERE h.dataInicio = :dataInicio"),
    @NamedQuery(name = "Historico.findByDataFim", query = "SELECT h FROM Historico h WHERE h.dataFim = :dataFim")})
public class Historico implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HistoricoPK historicoPK;
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "dataFim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @JoinColumn(name = "idFuncionario", referencedColumnName = "idFuncionario", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Funcionario funcionario;
    @JoinColumn(name = "idCargo", referencedColumnName = "idCargo", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cargo cargo;
    @JoinColumn(name = "idGestao", referencedColumnName = "idGestao", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Gestao gestao;

    public Historico() {
    }

    public Historico(HistoricoPK historicoPK) {
        this.historicoPK = historicoPK;
    }

    public Historico(int idGestao, int idCargo, int idFuncionario) {
        this.historicoPK = new HistoricoPK(idGestao, idCargo, idFuncionario);
    }

    public HistoricoPK getHistoricoPK() {
        return historicoPK;
    }

    public void setHistoricoPK(HistoricoPK historicoPK) {
        this.historicoPK = historicoPK;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Gestao getGestao() {
        return gestao;
    }

    public void setGestao(Gestao gestao) {
        this.gestao = gestao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (historicoPK != null ? historicoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historico)) {
            return false;
        }
        Historico other = (Historico) object;
        if ((this.historicoPK == null && other.historicoPK != null) || (this.historicoPK != null && !this.historicoPK.equals(other.historicoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Historico[ historicoPK=" + historicoPK + " ]";
    }
    
}
