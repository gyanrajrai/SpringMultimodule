/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Admin_GYAN
 */
@Entity
@Table(name = "tbl_complain_status")
public class ComplainStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "status_id")
    private Integer statusId;
    @Column(name = "status")
    private String status;
    @Column(name = "color")
    private String color;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private List<Complains> complainsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "status")
    private List<CustomerComplainStatus> customerComplainStatusList;

    public ComplainStatus() {
    }

    public ComplainStatus(Integer statusId) {
        this.statusId = statusId;
    }

    public ComplainStatus(Integer statusId, String status, String color) {
        this.statusId = statusId;
        this.status = status;
        this.color = color;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Complains> getComplainsList() {
        return complainsList;
    }

    public void setComplainsList(List<Complains> complainsList) {
        this.complainsList = complainsList;
    }

    

  

    public List<CustomerComplainStatus> getCustomerComplainStatusList() {
        return customerComplainStatusList;
    }

    public void setCustomerComplainStatusList(List<CustomerComplainStatus> customerComplainStatusList) {
        this.customerComplainStatusList = customerComplainStatusList;
    }

   
    
}
