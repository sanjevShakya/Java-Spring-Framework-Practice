/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springfirst.dao;

import com.leapfrog.springfirst.entity.Contact;
import java.util.List;

/**
 *
 * @author sshakya
 */
public interface ContactDAO {
    List <Contact> getAll();
    
}
