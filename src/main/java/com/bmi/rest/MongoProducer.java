package com.bmi.rest;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;

@ApplicationScoped
public class MongoProducer {
    
    public MongoClient dbConnect(String Pass){
        String connectionString = String.format("mongodb+srv://user1:%s@taskapp.g7tme.mongodb.net/myFirstDatabase?retryWrites=true&w=majority", Pass);
        MongoClient mongoClient = MongoClients.create(connectionString);
        return mongoClient;
    }

    public MongoDatabase createDB(
            MongoClient client) {
        return client.getDatabase("myFirstDatabase");
    }
    
}
