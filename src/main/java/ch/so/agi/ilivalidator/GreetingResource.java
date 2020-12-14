package ch.so.agi.ilivalidator;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello jaxrs";
    }
    
    @GET
    @Path("/xml")    
    @Produces(MediaType.APPLICATION_XML)
    public Response helloXML() {
        Book book = new Book();
        book.setIsbn("1234");
        book.setName("Unterm Rad");
        
        return Response.ok(book).build();
    }

}
