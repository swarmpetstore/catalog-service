package org.packt.swarm.petstore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/")
public class CatalogResource {

    private Map<Integer, Pet> pets = new HashMap<>();

    public CatalogResource(){
        Pet tortoise = new Pet();
        tortoise.setId(1);
        tortoise.setName("tortoise");
        tortoise.setQuantity(5);
        pets.put(1, tortoise);
    }

    @GET
    @Path("pet")
    @Produces(MediaType.APPLICATION_JSON)
    public Pet searchById(@QueryParam("id") int id) {
        return pets.get(id);
    }

}
