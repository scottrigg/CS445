package edu.iit.cs445.s2016.srigg;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.*;

@Path ("/order")
public class Order_REST_controller {

	private BoundaryInterface bi = new delectableManager();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getOrders()
	{
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String s = gson.toJson(bi.getOrders());
		return Response.ok(s).build();
	}
	
	@PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createOrder(String json) {
        int id;
        Gson gson = new Gson();
        Order jorder = gson.fromJson(json,Order.class);
        bi.addOrder(jorder);
        
        return Response.created(builder.build()).entity(out).build();
	}  
       // JsonObject jo = getGsonObject(json);
        
        
//        // calls the "Create Lamp" use case
//        Lamp l = bi.createLamp();
//
//        id = l.getID();
//        Gson gson = new Gson();
//        String s = gson.toJson(l);
//        // Build the URI for the "Location:" header
//        UriBuilder builder = uriInfo.getAbsolutePathBuilder();
//        builder.path(Integer.toString(id));
//
//        // The response includes header and body data
//        return Response.created(builder.build()).entity(s).build();
    
	
}
