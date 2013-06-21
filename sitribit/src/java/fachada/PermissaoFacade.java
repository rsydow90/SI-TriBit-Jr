/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import entidade.Permissao;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gabriela
 */
@Stateless
public class PermissaoFacade extends AbstractFacade<Permissao> {
    @PersistenceContext(unitName = "SIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PermissaoFacade() {
        super(Permissao.class);
    }
    
}
