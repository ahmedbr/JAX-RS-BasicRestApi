package WebApplication1;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ahmed BR
 */

@Path("/notifications")
public class NotificationsResources {
    
    
    // To get a message making sure that you're online
    @GET
    @Path("/ping")
    public Response ping(){
        return Response.ok().entity("You're Online :)").build();
    } 
    
    // To get a specific object 
    // Link: http://localhost:8080/BasicRestApp/api/notifications/get/1
    @GET
    @Path ("/get/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNotification (@PathParam("id") int id){
        return Response.ok()
                .entity(new Notification(id,"John","test notification"))
                .build();
    }
    
    
    // To post an object
    // Body: {"id":23,"text":"lorem ipsum","username":"johana"}
    // Header: Content-Type: application/json
    // Link: http://localhost:8080/BasiceRestApp/api/notifications/post/
    @POST
    @Path("/post/")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postNotification(Notification notification){
        return Response.status(201).entity(notification).build();
    }
}
