/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.core.dao.impl;

import com.gyan.core.dao.CustomerDAO;
import com.gyan.core.entity.Complains;
import com.gyan.core.entity.Customer;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin_GYAN
 */
@Repository(value = "customerDAO")
public class CustomerDAOimpl extends GenericDAOImpl<Customer> implements CustomerDAO {

    @Override
    public List<Complains> getComplains(int id) {
        session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Complains.class);
        criteria.add(Restrictions.eq("customer.customerId", id));
        return criteria.list();

    }

}
