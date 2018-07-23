/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.repository;

/**
 *
 * @author denys.prokopiuk
 */
public interface ClientRepository {

    public int addClient(String clientId, String actionType);

    public int removeClient(String clientId, String actionType);

    public void createUser(String user);

}
