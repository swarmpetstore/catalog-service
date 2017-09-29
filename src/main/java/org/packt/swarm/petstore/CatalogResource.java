package org.packt.swarm.petstore;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/")
public class CatalogResource {

    @Inject
    private CatalogService catalogService;


    @GET
    @Path("pet")
    @Produces(MediaType.APPLICATION_JSON)
    public Pet searchById(@QueryParam("id") int id) {
        System.out.println("IDZIE POBIERANIE");
        return catalogService.searchById(id);
    }

}
