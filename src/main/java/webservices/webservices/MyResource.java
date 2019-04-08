package webservices.webservices;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    @Path("post")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message postIt(Message newMsg) {
    	newMsg.setMsg(newMsg.getMsg().toUpperCase());
        return newMsg;
    }
    @Path("put")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message putIt(Message editedMsg) {
    	editedMsg.setMsg(editedMsg.getMsg().concat(",edited"));
        return editedMsg;
    } 
    @Path("delete/{id}")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> deleteIt(@PathParam("id") int id){
    	ArrayList<Message> list = new ArrayList<>();
    	list.add(new Message("one"));
    	list.add(new Message("two"));
    	list.add(new Message("three"));
    	list.add(new Message("four"));
    	list.add(new Message("five"));
    	list.remove(id);
    	return list;
    	   	
}
}