/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.endpoint;

import com.mycompany.customer.api.model.DataResponse;
import com.mycompany.customer.api.service.ClientService;
import javax.ejb.EJB;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author denys.prokopiuk
 */
@Path("client")
public class ClientResource {

    @EJB
    private ClientService clientService;

    @Path("/open")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DataResponse startAction(@QueryParam("clientId") String clientId, @QueryParam("actionType") String actionType) {
        //System.out.println("#########ClientId=" + clientId);
        //System.out.println("#########ActionType=" + actionType);
        int amount = clientService.onboardClient(clientId, actionType);
        DataResponse resp = new DataResponse();
        resp.setActionType(actionType);
        resp.setAmount(amount);
        return resp;
    }

    @Path("/close")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public DataResponse endAction(@QueryParam("clientId") String clientId, @QueryParam("actionType") String actionType) {
        //System.out.println("CLOSE-----------------------------------");
        int count = clientService.closeClient(clientId, actionType);
        DataResponse dataResponse = new DataResponse();
        dataResponse.setAmount(count);
        dataResponse.setActionType(actionType);
        return dataResponse;
    }

}
