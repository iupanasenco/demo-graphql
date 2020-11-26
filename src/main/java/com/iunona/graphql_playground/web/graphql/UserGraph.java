package com.iunona.graphql_playground.web.graphql;

import com.iunona.graphql_playground.domain.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserGraph {

    private final UserService userService;

    @Autowired
    public UserGraph (UserService userService) {
        this.userService = userService;
    }


}
