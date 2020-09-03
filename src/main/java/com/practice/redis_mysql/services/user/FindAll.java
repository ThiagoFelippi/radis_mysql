package com.practice.redis_mysql.services.user;

import com.practice.redis_mysql.entities.User;
import com.practice.redis_mysql.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAll {
    private final UserRepository userRepository;

    public List<User> execute(){
        // If have business rules insert here
        return userRepository.findAll();
    }

}
