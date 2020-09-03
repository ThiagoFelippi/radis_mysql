package com.practice.redis_mysql.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Getter
@NoArgsConstructor
public class UserDTO implements Serializable {
    private String username;
    private String email;

    public UserDTO(User user){
        this.username = user.getUsername();
        this.email = user.getEmail();
    }

}

