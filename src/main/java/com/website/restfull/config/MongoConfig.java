package com.website.restfull.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

@Configuration
public class MongoConfig {

	@Autowired
	Environment env;
    
	@Bean
	public MongoDatabase getMongoDb() {
		MongoClientURI uri = new MongoClientURI(env.getProperty("spring.data.mongodb.uri"));

		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("test");
		return database;
		
	}
	

}
