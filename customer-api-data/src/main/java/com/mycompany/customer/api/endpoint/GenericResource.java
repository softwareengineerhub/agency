/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.endpoint;

import com.mycompany.customer.api.service.ClientService;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author denys.prokopiuk
 */
@Path("user")
public class GenericResource {

    @EJB
    private ClientService clientService;
    @Inject
    private ResourceReader resourceReader;

    @Path("/create")
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String create(@FormParam("user") String user) {
        clientService.createUser(user);
        String js = resourceReader.getContent("/client-html.txt");
        return String.format(js, user, user, user, user);
    }
}
