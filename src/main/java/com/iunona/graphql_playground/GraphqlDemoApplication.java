package com.iunona.graphql_playground;

import com.iunona.graphql_playground.connection.MovieServiceMongoClient;
import com.iunona.graphql_playground.domain.Movie;
import com.iunona.graphql_playground.domain.User;
import com.iunona.graphql_playground.domain.UserRepository;
import com.iunona.graphql_playground.domain.UserService;
import com.mongodb.client.MongoClient;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GraphqlDemoApplication {

    public static void main(String[] args) throws NotFoundException {
        ConfigurableApplicationContext context = SpringApplication.run(new Class<?>[]{GraphqlDemoApplication.class}, args);

        User user = new User(1L, "Iunona", "Panasenco", "ipanasenco");
        context.getBean(UserRepository.class).save(user);
        context.getBean(MovieServiceMongoClient.class).handleDocument();

        System.out.println(context.getBean(UserRepository.class).findAll().stream().findFirst());

    }

}
