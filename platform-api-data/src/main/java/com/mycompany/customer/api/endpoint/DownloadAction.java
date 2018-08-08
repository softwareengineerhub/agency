/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.endpoint;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Denis
 */
@WebServlet(name = "DownloadAction", urlPatterns = {"/DownloadAction"})
public class DownloadAction extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType( "html/text" );
        resp.setHeader( "Content-Disposition", "attachment;filename=" + req.getParameter("id"));
        resp.getOutputStream().write("data".getBytes());
        //resp.sendRedirect("/web/index.html");
    }

    
}
