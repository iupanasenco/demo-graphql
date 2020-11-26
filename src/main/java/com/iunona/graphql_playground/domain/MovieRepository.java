package com.iunona.graphql_playground.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface MovieRepository extends MongoRepository<Movie, Long> {
}
