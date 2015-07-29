/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springfirst.service;

import com.leapfrog.springfirst.dao.ContactDAO;
import com.leapfrog.springfirst.entity.Contact;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sshakya
 */

@Service
public class ContactService {
    
    @Autowired
    ContactDAO contactDAO;
    
    public List<Contact> getAll()
    {
        return contactDAO.getAll();
    }
    
    
}
