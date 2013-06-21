/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Gabriela
 */
@Entity
@Table(name = "gestao")
@NamedQueries({
    @NamedQuery(name = "Gestao.findAll", query = "SELECT g FROM Gestao g"),
    @NamedQuery(name = "Gestao.findByIdGestao", query = "SELECT g FROM Gestao g WHERE g.idGestao = :idGestao"),
    @NamedQuery(name = "Gestao.findByAno", query = "SELECT g FROM Gestao g WHERE g.ano = :ano"),
    @NamedQuery(name = "Gestao.findByDescricao", query = "SELECT g FROM Gestao g WHERE g.descricao = :descricao")})
public class Gestao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idGestao", nullable = false)
    private Integer idGestao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ano", nullable = false)
    private int ano;
    @Size(max = 45)
    @Column(name = "descricao", length = 45)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gestao")
    private Collection<Historico> historicoCollection;

    public Gestao() {
    }

    public Gestao(Integer idGestao) {
        this.idGestao = idGestao;
    }

    public Gestao(Integer idGestao, int ano) {
        this.idGestao = idGestao;
        this.ano = ano;
    }

    public Integer getIdGestao() {
        return idGestao;
    }

    public void setIdGestao(Integer idGestao) {
        this.idGestao = idGestao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Collection<Historico> getHistoricoCollection() {
        return historicoCollection;
    }

    public void setHistoricoCollection(Collection<Historico> historicoCollection) {
        this.historicoCollection = historicoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idGestao != null ? idGestao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gestao)) {
            return false;
        }
        Gestao other = (Gestao) object;
        if ((this.idGestao == null && other.idGestao != null) || (this.idGestao != null && !this.idGestao.equals(other.idGestao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Gestao[ idGestao=" + idGestao + " ]";
    }
    
}
