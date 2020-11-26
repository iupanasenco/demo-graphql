package com.iunona.graphql_playground.web.graphql;

import com.iunona.graphql_playground.connection.MovieServiceMongoClient;
import com.iunona.graphql_playground.domain.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {

    private final UserService userService;

    private final MovieServiceMongoClient mongoClient;

    @Autowired
    public GraphQLConfig(UserService userService, MovieServiceMongoClient mongoClient) {
        this.userService = userService;
        this.mongoClient = mongoClient;
    }
}
