package com.practice.redis_mysql.services.user;

import com.practice.redis_mysql.entities.User;
import com.practice.redis_mysql.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateUser {
    private final UserRepository userRepository;

    public User execute(User user) throws Exception {

        //business rules here...//
        if(user.getPassword().length() < 8){
            throw new Exception("Password needs have more than 8 characters");
        }

        return userRepository.save(user);
    }
}
