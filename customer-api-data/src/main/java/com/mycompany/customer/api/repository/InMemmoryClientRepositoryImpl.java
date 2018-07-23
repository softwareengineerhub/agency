/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.repository;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

/**
 *
 * @author denys.prokopiuk
 */
@Singleton
public class InMemmoryClientRepositoryImpl implements ClientRepository {

    private Map<String, Map<String, Integer>> database;

    @PostConstruct
    private void init() {
        database = new HashMap();
    }

    @Override
    public int addClient(String clientId, String actionType) {
        return addByActionAndClient(clientId, actionType);
    }

    @Override
    public int removeClient(String clientId, String actionType) {
        return removeByActionAndClient(clientId, actionType);
    }

    @Override
    public void createUser(String user) {
        database.put(user, new HashMap());
    }

    private int removeByActionAndClient(String clientId, String actionType) {
        Map<String, Integer> map = getActionByClient(clientId);
        if (!map.containsKey(actionType)) {
            map.put(actionType, 0);
            return 0;
        }
        int value = map.get(actionType);
        map.put(actionType, value - 1);
        return value - 1;
    }

    private int addByActionAndClient(String clientId, String actionType) {
        Map<String, Integer> map = getActionByClient(clientId);
        if (!map.containsKey(actionType)) {
            map.put(actionType, 0);
        }
        int value = map.get(actionType);
        map.put(actionType, value + 1);
        return value + 1;
    }

    private Map<String, Integer> getActionByClient(String client) {
        return database.get(client);
    }

}
