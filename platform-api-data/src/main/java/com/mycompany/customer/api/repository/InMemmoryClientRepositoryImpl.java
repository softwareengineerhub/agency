/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.repository;

import com.mycompany.customer.api.model.DataItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.inject.Singleton;

/**
 *
 * @author denys.prokopiuk
 */
@Singleton
public class InMemmoryClientRepositoryImpl implements ClientRepository {

    private List<DataItem> list;

    @PostConstruct
    public void init() {
        list = new ArrayList<>();
        list.add(new DataItem());
        list.add(new DataItem());
    }

    @Override
    public void addItem(DataItem dataItem) {
        list.add(dataItem);
    }

    @Override
    public DataItem getItem(int id) {
        return list.get(id);
    }

    @Override
    public List<DataItem> getAllItems() {
        return list;
    }

}
