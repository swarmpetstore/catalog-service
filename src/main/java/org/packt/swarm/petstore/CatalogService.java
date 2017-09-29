package org.packt.swarm.petstore;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@ApplicationScoped
public class CatalogService {

    private Map<Integer, Pet> catalog = new HashMap<>();

    @PersistenceContext(unitName = "CatalogPU")
    private EntityManager em;

    private Random random = new Random();

    public Pet searchById(int id) {
        return em.createNamedQuery("Pet.findById", Pet.class).setParameter("id",id).getResultList().get(0);
    }

}
