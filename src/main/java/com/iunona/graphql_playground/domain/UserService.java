package com.iunona.graphql_playground.domain;

import com.sun.istack.NotNull;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private final UserRepository userRepository;

    public User addMovieToUser (Long userId, @NotNull Movie movie) throws NotFoundException {
        User user = userRepository.findById(userId).orElseThrow(()-> new NotFoundException("User not found!"));
        user.setFirstName("Vasilisa");
        user.addMovieToUser(movie);
        return userRepository.save(user);
    }


}
