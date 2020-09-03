package com.practice.redis_mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableCaching
@SpringBootApplication
@EnableJpaRepositories("com.practice.redis_mysql.repositories")
public class RedisMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisMysqlApplication.class, args);
    }

}
