/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.core.dao;

import com.gyan.core.entity.Complains;
import com.gyan.core.entity.Customer;
import java.util.List;

/**
 *
 * @author Admin_GYAN
 */
public interface CustomerDAO extends GenericDAO<Customer>{
    
    //this function is used for hibernate Criteri Queries
    List<Complains> getComplains(int id);
    
}
