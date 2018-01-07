package org.packt.swarm.petstore.catalog;

import org.packt.swarm.petstore.catalog.model.Item;

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

    public Item searchByItemId(String itemId) {
        return em.createNamedQuery("Item.findByItemId", Item.class).setParameter("itemId",itemId).getResultList().get(0);
    }

    public List<Item> getAll() {
        return em.createNamedQuery("Item.findAll", Item.class).getResultList();
    }

    @Transactional
    public void add(Item pet){
        em.persist(pet);
    }
}
