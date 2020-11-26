package com.iunona.graphql_playground.connection;

import com.iunona.graphql_playground.domain.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import javassist.NotFoundException;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieServiceMongoClient {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserService userService;

    public @Bean
    MongoClient mongoClient() {
        return MongoClients.create();
    }

    public void handleDocument() throws NotFoundException {
        MongoDatabase database = mongoClient().getDatabase("test");
        MongoCollection<Document> collection = database.getCollection("movie");
        Document myDoc = collection.find().first();

        System.out.println(userService.addMovieToUser(1L, new Movie(myDoc.getObjectId("_id"), myDoc.getString("title"),
                       myDoc.getInteger("year")))) ;

        System.out.println(myDoc.toJson());
    }

}
