package org.serverless.orchestration;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/save")
@Consumes(MediaType.APPLICATION_JSON)
public class SaveResults {

    private static final Logger LOGGER = LoggerFactory.getLogger(SaveResults.class);

    @POST
    public void save(String body) {
        LOGGER.info("Saved results: {}", body);
    }
}
