/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author denys.prokopiuk
 */
@XmlRootElement
public class DataResponse {

    private String actionType;
    private int amount;

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "DataResponse{" + "actionType=" + actionType + ", amount=" + amount + '}';
    }

}
