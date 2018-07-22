/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.endpoint;

import java.io.InputStream;

/**
 *
 * @author denys.prokopiuk
 */
public class ResourceReader {

    public String getContent(String filePath) {
        try (InputStream in = getClass().getResourceAsStream(filePath);) {
            byte[] data = new byte[in.available()];
            in.read(data);
            return new String(data);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

}
