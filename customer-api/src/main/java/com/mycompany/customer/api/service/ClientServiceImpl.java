/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.service;

import com.mycompany.customer.api.repository.ClientRepository;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author denys.prokopiuk
 */
@Stateless
public class ClientServiceImpl implements ClientService {

    @EJB
    private ClientRepository clientRepository;

    @Override
    public int onboardClient(String clientId, String actionType) {
        return clientRepository.addClient(clientId, actionType);
    }

    @Override
    public int closeClient(String clientId, String actionType) {
        return clientRepository.removeClient(clientId, actionType);
    }

    @Override
    public void createUser(String user) {
        clientRepository.createUser(user);
    }

}
