/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.service;

import com.mycompany.customer.api.model.DataItem;
import com.mycompany.customer.api.repository.ClientRepository;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author denys.prokopiuk
 */
public class ClientServiceImpl implements ClientService {

    @Inject
    private ClientRepository clientRepository;

    @Override
    public void addItem(DataItem dataItem) {
        clientRepository.addItem(dataItem);
    }

    @Override
    public DataItem getItem(int id) {
        return clientRepository.getItem(id);
    }

    @Override
    public List<DataItem> getAllItems() {
        return clientRepository.getAllItems();
    }

}
