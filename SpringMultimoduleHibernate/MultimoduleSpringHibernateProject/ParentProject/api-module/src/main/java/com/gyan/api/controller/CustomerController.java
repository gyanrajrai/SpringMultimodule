/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gyan.api.controller;

import com.gyan.core.dao.CustomerDAO;
import com.gyan.core.entity.Complains;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Admin_GYAN
 */
@Controller
@RequestMapping(value = "/api/customer")
public class CustomerController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    String index() {
        return "<h1> Api module works or cusotmer controller works</h1>";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    String complains(@PathVariable("id") int id) {
        StringBuilder content = new StringBuilder();

        for (Complains c : customerDAO.getComplains(id)) {

            content.append("<p>" + c.getSubject() + "</p>");
            content.append("<p>" + c.getDescription() + "</p>");
            content.append("<p>" + c.getCustomer() + "</p>");

        }
        return content.toString();
    }
}
