package pruebas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class SshService {
    private static final Logger logger = LoggerFactory.getLogger(SshService.class);

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getCliente() {
        return null;
    }
}
