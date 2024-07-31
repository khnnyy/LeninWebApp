/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.webserverlenin;

/**
 *
 * @author predator 300
 */
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class AdminService {
    
    private final MangoDBConnection mangoDBConnection;
    
    @Autowired
    public AdminService (MangoDBConnection mangoDBConnection1) {
        this.mangoDBConnection = mangoDBConnection1;
    }
}
