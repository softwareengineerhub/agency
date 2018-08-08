/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.model;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Denis
 */
@XmlRootElement
public class DataItems {

    private List<DataItem> items;

    public List<DataItem> getItems() {
        return items;
    }

    public void setItems(List<DataItem> items) {
        this.items = items;
    }

}
