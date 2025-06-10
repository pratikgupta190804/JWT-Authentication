package com.jwtAuthentication.service;

import com.jwtAuthentication.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);
    List<User> getAllUser();
    String verify(User user);

}
