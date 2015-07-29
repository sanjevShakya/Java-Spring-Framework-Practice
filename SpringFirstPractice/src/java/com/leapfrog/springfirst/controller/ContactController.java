/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.springfirst.controller;

import com.leapfrog.springfirst.service.ContactService;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author sshakya
 */
@Controller
@RequestMapping(value="/contact")
public class ContactController {
    
    @Autowired
    private ContactService contactService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map){
        map.addAttribute("contacts",contactService.getAll());
        return "contact/index"; 
        
    }
    
    @RequestMapping(value="/test", method = RequestMethod.GET)
    public @ResponseBody String test(){
        return "<h1>Hello World</h1>"; 
        
    }
    
    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String add(){
        return "contact/add"; 
        
    }
    
    @RequestMapping(value="/add", method = RequestMethod.POST)
    public @ResponseBody String save(HttpServletRequest req){
        return req.getParameter("name");
        
    }
    
    @RequestMapping(value="/edit/{id}", method = RequestMethod.GET)
    public @ResponseBody String edit(@PathVariable("id") int id ){
        return "<h1>This is Edit page of ID:" + id +"</h1>"; 
        
    }
    
}
