package org.packt.swarm.petstore.org.packt.swarm.petstore.catalog;

import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class PodNameResponseFilter implements ContainerResponseFilter {
    public void filter(ContainerRequestContext req, ContainerResponseContext res)
            throws IOException
    {
        res.getHeaders().add("pod-name",System.getenv("HOSTNAME"));
    }
}
