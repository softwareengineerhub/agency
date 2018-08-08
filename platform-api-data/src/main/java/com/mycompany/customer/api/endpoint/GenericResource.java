/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.endpoint;

import com.mycompany.customer.api.model.DataItem;
import com.mycompany.customer.api.service.ClientService;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Denis
 */
@Path("generic")
@RequestScoped
public class GenericResource {
    @Inject
    private ClientService clientService;
    
    
    /*@GET
    //@Produces(MediaType.APPLICATION_JSON)
    public String getAll() {
        return "API-TEST";        
    }*/
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<DataItem> getAll() {
        return clientService.getAllItems();        
    }
    
    @Path("/single")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DataItem getItem(@QueryParam("id") int id) {
        return clientService.getItem(id);        
    }

}
