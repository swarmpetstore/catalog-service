package org.packt.swarm.petstore.catalog;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class CatalogService {

    private Map<Integer, Item> catalog = new HashMap<>();

    @PersistenceContext(unitName = "CatalogPU")
    private EntityManager em;

    public Item searchByName(String name) {
        return em.createNamedQuery("Item.findByName", Item.class).setParameter("name",name).getResultList().get(0);
    }

    public List<Item> getAll() {
        return em.createNamedQuery("Item.findAll", Item.class).getResultList();
    }

    @Transactional
    public void add(Item pet){
        em.persist(pet);
    }
}
