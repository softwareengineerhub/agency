/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.endpoint;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author denys.prokopiuk
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    
    {
    
    
    String s = "                    <div class=\"left-half\">\n" +
"                        <article>                            \n" +
"                            <p> <image src=\"png/1.png\" style=\"width:75%\"/></p>\n" +
"                            <p><a class=\"button3\" style=\"width: 100%\" href=\"details.html\">DOWNLOAD</a></p>\n" +
"                        </article>\n" +
"                    </div>\n" +
"                    <div class=\"right-half\">\n" +
"                        <article>\n" +
"                            <h1>AndoverWashed_200x100x80</h1>\n" +
"                            <p><table>\n" +
"                        <tr>\n" +
"                            <td>Uniue reference:</td>\n" +
"                            <td>AndoverWashed_200x100x80</td>                            \n" +
"                        </tr>\n" +
"                        <tr>\n" +
"                            <td>Brand:</td>\n" +
"                            <td>Type of product</td>                            \n" +
"                        </tr>\n" +
"                        <tr>\n" +
"                            <td>Group:</td>\n" +
"                            <td>Andover Washed</td>                            \n" +
"                        </tr>\n" +
"                        <tr>\n" +
"                            <td>Width:</td>\n" +
"                            <td>300</td>                            \n" +
"                        </tr>\n" +
"                        <tr>\n" +
"                            <td>Height:</td>\n" +
"                            <td>400</td>                            \n" +
"                        </tr>\n" +
"                        <tr>\n" +
"                            <td>Deep:</td>\n" +
"                            <td>500</td>                            \n" +
"                        </tr>\n" +
"                        <tr>\n" +
"                            <td>Publication Date:</td>\n" +
"                            <td>500</td>                            \n" +
"                        </tr>\n" +
"                        <tr>\n" +
"                            <td>Version number:</td>\n" +
"                            <td>1</td>                            \n" +
"                        </tr>\n" +
"                        <tr>\n" +
"                            <td>Version number:</td>\n" +
"                            <td>1</td>                            \n" +
"                        </tr>\n" +
"                        <tr>\n" +
"                            <td>Type:</td>\n" +
"                            <td>Type 1</td>                            \n" +
"                        </tr>\n" +
"                    </table></p>\n" +
"                        </article>\n" +
"                    </div>\n" +
"";
    
    
    
    }
    
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.mycompany.customer.api.endpoint.GenericResource.class);
        //resources.add(com.mycompany.mavenproject3.cdi.GenericResource.class);
    }
    
}
