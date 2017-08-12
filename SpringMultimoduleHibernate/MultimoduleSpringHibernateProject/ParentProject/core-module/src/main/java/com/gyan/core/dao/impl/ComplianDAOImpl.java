/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.core.dao.impl;

import com.gyan.core.dao.ComplainDAO;
import com.gyan.core.entity.Complains;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin_GYAN
 */
@Repository(value = "complainDAO")
public class ComplianDAOImpl extends GenericDAOImpl<Complains> implements ComplainDAO{
    
 }
