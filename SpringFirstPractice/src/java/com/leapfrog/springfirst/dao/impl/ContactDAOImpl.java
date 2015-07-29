/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springfirst.dao.impl;

import com.leapfrog.springfirst.dao.ContactDAO;
import com.leapfrog.springfirst.entity.Contact;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sshakya
 */

@Repository
public class ContactDAOImpl implements ContactDAO{
    

    @Override
    public List<Contact> getAll() {
        List<Contact> contactList= new ArrayList<>();
        contactList.add(new Contact(1,"sanjeev","shakya"));
        contactList.add(new Contact(2,"shreeram","chaulagain"));
        contactList.add(new Contact(3,"bishal","shrestha"));
        contactList.add(new Contact(4,"sajn","bajracharya"));
        return contactList;
    }
    
    
}
