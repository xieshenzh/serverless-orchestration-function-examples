package org.serverless.orchestration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorld {

    @GET
    public String deploy() {
        return "{\"output\" : \"hello world\"}";
    }
}
