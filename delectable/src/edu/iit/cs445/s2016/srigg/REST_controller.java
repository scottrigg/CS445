//package edu.iit.cs445.s2016.srigg;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import javax.annotation.PostConstruct;
//import javax.ws.rs.*;
//import javax.ws.rs.core.*;
//
//
//public class REST_controller {
//
//	private BoundaryInterface bi = new delectableManager();
//	@Path ("/customer")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response getCust()
//	{//calls the "Get customers" use case
//		Gson gson = new GsonBuilder().setPrettyPrinting().create(); 
//		String s =gson.toJson(bi.getCust());
//		return Response.status(Response.Status.OK).entity(s).build();
//	}
//	
////@Path ("/{cid}")
////@GET
////@Produces(MediaType.APPLICATION_JSON)
////public Response getCutomerById(@PathParam("cid") int cid)
////{
////	Gson gson = new Gson();
////	String s;
////	Customer cust = delectableManager.getCustomerByID(cid);
////}
//
//	@Path ("/order")
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public Response getOrders()
//	{
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//		String s = gson.toJson(bi.getOrders());
//		return Response.ok(s).build();
//	}
//	
//}