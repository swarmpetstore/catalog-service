package org.packt.swarm.petstore.catalog;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/")
public class CatalogResource {

    @Inject
    private CatalogService catalogService;

    @GET
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> getAll() {
        return catalogService.getAll();
    }

    @GET
    @Path("item/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public Item searchByName(@PathParam("name") String name) {
        return catalogService.searchByName(name);
    }

    @POST
    @Path("item")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNew(Item pet){
        try {
            catalogService.add(pet);
            return Response.ok(pet).build();
        } catch(Exception e){
            return Response.status(Response.Status.BAD_REQUEST).entity(e.getMessage()).build();
        }
    }
}
