/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jquery.rest.api;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author denys.prokopiuk
 */
@Path("data")
public class GenericResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person get() {        
        Person p = new Person();
        p.setName("Name1");
        p.setAge(1);
        return p;
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putXml(Person person) {
        System.out.println("put().person="+person);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void post(Person person) {
        System.out.println("post().person="+person);
    }
}
