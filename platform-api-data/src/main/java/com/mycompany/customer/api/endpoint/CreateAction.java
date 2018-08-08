/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.endpoint;

import com.mycompany.customer.api.model.DataItem;
import com.mycompany.customer.api.service.ClientService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Denis
 */
@WebServlet(name = "CreateAction", urlPatterns = {"/CreateAction"})
@MultipartConfig
public class CreateAction extends HttpServlet {

    @Inject
    private ClientService clientService;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("description");
        String itemDetails = req.getParameter("itemDetails");
        String detailedInformation = req.getParameter("detailedInformation");
        String anyAdditionalInformation = req.getParameter("anyAdditionalInformation");
        String uniueReference = req.getParameter("uniueReference");
        String brand = req.getParameter("brand");
        String group = req.getParameter("group");
        String width = req.getParameter("width");
        String height = req.getParameter("height");
        String deep = req.getParameter("deep");
        String publicationDate = req.getParameter("publicationDate");
        String versionNumber = req.getParameter("versionNumber");
        String type = req.getParameter("type");

        DataItem dataItem = new DataItem();
        dataItem.setDescription(description);
        dataItem.setItemDetails(itemDetails);
        dataItem.setDetailedInformation(detailedInformation);
        dataItem.setAnyAdditionalInformation(anyAdditionalInformation);
        dataItem.setUniueReferenc(uniueReference);
        dataItem.setBrand(brand);
        dataItem.setGroup(group);
        dataItem.setWidth(width);
        dataItem.setHeight(height);
        dataItem.setDeep(deep);
        dataItem.setPublicationDate(publicationDate);
        dataItem.setVersionNumber(versionNumber);
        dataItem.setType(type);

        clientService.addItem(dataItem);
        System.out.println(clientService.getAllItems().size());
        resp.sendRedirect("web/create_account_success.html");
    }

}
