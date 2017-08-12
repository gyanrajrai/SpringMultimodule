/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.core.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Admin_GYAN
 */
@Entity
@Table(name = "tbl_complains")
public class Complains implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complain_id")
    private Integer complainId;
    @Column(name = "subject")
    private String subject;
    @Lob
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    @ManyToOne(optional = false)
    private Customer customer;
    @JoinColumn(name = "department_id", referencedColumnName = "department_id")
    @ManyToOne(optional = false)
    private Department department;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private ComplainStatus status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "complain")
    private List<CustomerComplainStatus> customerComplainStatusList;

    public Complains() {
    }

    public Complains(Integer complainId) {
        this.complainId = complainId;
    }

    public Complains(Integer complainId, String subject, String description) {
        this.complainId = complainId;
        this.subject = subject;
        this.description = description;
    }

    public Integer getComplainId() {
        return complainId;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ComplainStatus getStatus() {
        return status;
    }

    public void setStatusId(ComplainStatus status) {
        this.status = status;
    }

    public List<CustomerComplainStatus> getCustomerComplainStatusList() {
        return customerComplainStatusList;
    }

    public void setCustomerComplainStatusList(List<CustomerComplainStatus> customerComplainStatusList) {
        this.customerComplainStatusList = customerComplainStatusList;
    }

    
}
