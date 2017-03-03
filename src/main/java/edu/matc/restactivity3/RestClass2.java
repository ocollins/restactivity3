package edu.matc.restactivity3;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by student on 2/26/17.
 *
 * @author O Collins
 */

//This Path annotation means this is a service. If this class calls any utility class it
//does not have to be annotated. This is the class that will be opened to the consumer.
//This is what your service will return. Call it employee if this is what is sent back
@Path("/users/{name}")
public class RestClass2{
    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Produces("text/plain")
    //@Path("{id}")
    public Response getUserByName(@PathParam("name") String name) {
    //return Response.status(200).entity("Testing user ").build();
    return Response.status(200).entity("Welcome: " + name).build();

    }

    //Keep Response name
//    public Response getMessage() {
//        // Return a simple message
//        String output = "Rest class 2. Welcome ";
//        //SEnd diff statuses depending on the result. Do error handling
//        //return Response.status(200).entity(output).build();
//
//    }

}