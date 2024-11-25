package com.example.ppro_c.service;

import com.example.ppro_c.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUsername(String username);

    void save(User user);
}
