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
@Table(name = "tipocliente")
@NamedQueries({
    @NamedQuery(name = "Tipocliente.findAll", query = "SELECT t FROM Tipocliente t"),
    @NamedQuery(name = "Tipocliente.findByIdTipoCliente", query = "SELECT t FROM Tipocliente t WHERE t.idTipoCliente = :idTipoCliente"),
    @NamedQuery(name = "Tipocliente.findByNome", query = "SELECT t FROM Tipocliente t WHERE t.nome = :nome"),
    @NamedQuery(name = "Tipocliente.findByDescricao", query = "SELECT t FROM Tipocliente t WHERE t.descricao = :descricao")})
public class Tipocliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idTipoCliente", nullable = false)
    private Integer idTipoCliente;
    @Size(max = 45)
    @Column(name = "nome", length = 45)
    private String nome;
    @Size(max = 45)
    @Column(name = "descricao", length = 45)
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipocliente")
    private Collection<Cliente> clienteCollection;

    public Tipocliente() {
    }

    public Tipocliente(Integer idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public Integer getIdTipoCliente() {
        return idTipoCliente;
    }

    public void setIdTipoCliente(Integer idTipoCliente) {
        this.idTipoCliente = idTipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoCliente != null ? idTipoCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocliente)) {
            return false;
        }
        Tipocliente other = (Tipocliente) object;
        if ((this.idTipoCliente == null && other.idTipoCliente != null) || (this.idTipoCliente != null && !this.idTipoCliente.equals(other.idTipoCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Tipocliente[ idTipoCliente=" + idTipoCliente + " ]";
    }
    
}
