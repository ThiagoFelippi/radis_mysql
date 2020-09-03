package com.practice.redis_mysql.services.user;

import com.practice.redis_mysql.entities.User;
import com.practice.redis_mysql.entities.UserDTO;
import com.practice.redis_mysql.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FindOneById {
    private final UserRepository userRepository;

    @Cacheable("userCache")
    public UserDTO execute(int id) throws Exception {
        //business rules here...//
        if(id < 0){
            throw new Exception("Please, send valid id");
        }

        Optional<User> user = userRepository.findById(id);
        if(user.isEmpty()){
            throw new Exception("User not found");
        }
        return new UserDTO(user.get());
    }

}
