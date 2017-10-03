package org.packt.swarm.petstore;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class CatalogResource {

    @Inject
    private CatalogService catalogService;

    @GET
    @Path("pet")
    @Produces(MediaType.APPLICATION_JSON)
    public Pet searchById(@QueryParam("name") String name) {
        return catalogService.searchByName(name);
    }

    @POST
    @Path("pet")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNew(Pet pet){
        try {
            catalogService.add(pet);
            return Response.ok(pet).build();
        } catch(Exception e){
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }
}
