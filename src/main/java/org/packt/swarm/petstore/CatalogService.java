package org.packt.swarm.petstore;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@ApplicationScoped
public class CatalogService {

    private Map<Integer, Pet> catalog = new HashMap<>();

    @PersistenceContext(unitName = "CatalogPU")
    private EntityManager em;

    public Pet searchByName(String name) {
        return em.createNamedQuery("Pet.findByName", Pet.class).setParameter("name",name).getResultList().get(0);
    }

    @Transactional
    public void add(Pet pet){
        em.persist(pet);
    }
}
