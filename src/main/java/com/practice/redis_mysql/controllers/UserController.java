package com.practice.redis_mysql.controllers;

import com.practice.redis_mysql.entities.User;
import com.practice.redis_mysql.entities.UserDTO;
import com.practice.redis_mysql.services.user.CreateUser;
import com.practice.redis_mysql.services.user.FindAll;
import com.practice.redis_mysql.services.user.FindOneById;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final FindAll findAll;
    private final FindOneById findOneById;
    private final CreateUser createUser;

    @GetMapping()
    public List<User> findAll(){
        return findAll.execute();
    }

    @GetMapping("/{id}")
    public UserDTO findOneById(@PathVariable int id) throws Exception {
        return findOneById.execute(id);
    }

    @PostMapping()
    public User create(@RequestBody User user) throws Exception {
        return createUser.execute(user);
    }
}
