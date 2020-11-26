package com.iunona.graphql_playground.web.graphql.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.iunona.graphql_playground.domain.Genre;
import com.iunona.graphql_playground.domain.Movie;
import com.iunona.graphql_playground.domain.User;
import com.iunona.graphql_playground.domain.UserRepository;

import java.util.List;
import java.util.Set;

public class UserResolver implements GraphQLResolver<User> {
    private final UserRepository userRepository;

    public UserResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

//    public List<Movie> getUsersMovies (Long id) {
//        return userRepository.findById(id).get().getUsersMovies();
//    }
//
//    public List<Genre> getUsersGenres (Long id) {
//        return userRepository.findById(id).get().getUserGenres();
//    }
}
