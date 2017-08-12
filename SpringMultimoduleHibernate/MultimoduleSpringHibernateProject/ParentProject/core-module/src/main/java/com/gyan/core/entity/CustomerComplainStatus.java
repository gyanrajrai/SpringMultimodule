/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.core.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Admin_GYAN
 */
@Entity
@Table(name = "tbl_customer_complain_status")
public class CustomerComplainStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "complain_status_id")
    private Integer complainStatusId;
    @Column(name = "status_update_date",insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date statusUpdateDate;
    @Lob
    @Column(name = "remarks")
    private String remarks;
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    @ManyToOne(optional = false)
    private ComplainStatus status;
    @JoinColumn(name = "complain_id", referencedColumnName = "complain_id")
    @ManyToOne(optional = false)
    private Complains complain;

    public CustomerComplainStatus() {
    }

    public CustomerComplainStatus(Integer complainStatusId) {
        this.complainStatusId = complainStatusId;
    }

    public CustomerComplainStatus(Integer complainStatusId, Date statusUpdateDate, String remarks) {
        this.complainStatusId = complainStatusId;
        this.statusUpdateDate = statusUpdateDate;
        this.remarks = remarks;
    }

    public Integer getComplainStatusId() {
        return complainStatusId;
    }

    public void setComplainStatusId(Integer complainStatusId) {
        this.complainStatusId = complainStatusId;
    }

    public Date getStatusUpdateDate() {
        return statusUpdateDate;
    }

    public void setStatusUpdateDate(Date statusUpdateDate) {
        this.statusUpdateDate = statusUpdateDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ComplainStatus getStatus() {
        return status;
    }

    public void setStatus(ComplainStatus status) {
        this.status = status;
    }

    

  

    public Complains getComplain() {
        return complain;
    }

    public void setComplain(Complains complain) {
        this.complain = complain;
    }

   
}
