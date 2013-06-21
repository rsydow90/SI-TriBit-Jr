/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import entidade.Tipocliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gabriela
 */
@Stateless
public class TipoclienteFacade extends AbstractFacade<Tipocliente> {
    @PersistenceContext(unitName = "SIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoclienteFacade() {
        super(Tipocliente.class);
    }
    
}
