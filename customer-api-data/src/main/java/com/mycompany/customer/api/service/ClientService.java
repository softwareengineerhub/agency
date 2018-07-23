/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.service;

/**
 *
 * @author denys.prokopiuk
 */
public interface ClientService {

    public int onboardClient(String clientId, String actionType);

    public int closeClient(String clientId, String actionType);

    public void createUser(String user);

}
