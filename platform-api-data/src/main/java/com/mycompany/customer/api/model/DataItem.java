/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.customer.api.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Denis
 */
@XmlRootElement
public class DataItem {

    private String description = "description"+hashCode();
    private String itemDetails = "itemDetails"+hashCode();
    private String detailedInformation = "detailedInfo"+hashCode();
    private String anyAdditionalInformation = "anyAdditionalInformation"+hashCode();
    private String uniueReferenc = "uniueReferenc"+hashCode();
    private String brand = "brand"+hashCode();
    private String group = "group"+hashCode();
    private String width = "width"+hashCode();
    private String height = "height"+hashCode();
    private String deep = "deep"+hashCode();
    private String publicationDate = "publicationDate"+hashCode();
    private String versionNumber = "versionNumber"+hashCode();
    private String type = "type"+hashCode();
    //private byte[] image;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(String itemDetails) {
        this.itemDetails = itemDetails;
    }

    public String getDetailedInformation() {
        return detailedInformation;
    }

    public void setDetailedInformation(String detailedInformation) {
        this.detailedInformation = detailedInformation;
    }

    public String getAnyAdditionalInformation() {
        return anyAdditionalInformation;
    }

    public void setAnyAdditionalInformation(String anyAdditionalInformation) {
        this.anyAdditionalInformation = anyAdditionalInformation;
    }

    public String getUniueReferenc() {
        return uniueReferenc;
    }

    public void setUniueReferenc(String uniueReferenc) {
        this.uniueReferenc = uniueReferenc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDeep() {
        return deep;
    }

    public void setDeep(String deep) {
        this.deep = deep;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
