/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.service;

import com.mycompany.customer.api.model.DataItem;
import java.util.List;

/**
 *
 * @author denys.prokopiuk
 */
public interface ClientService {

    public void addItem(DataItem dataItem);

    public DataItem getItem(int id);
    
    public List<DataItem> getAllItems();

}
