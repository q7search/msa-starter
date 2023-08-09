package com.example.userservice.security;

import com.example.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;

@Slf4j
//@RunWith(SpringRunner.class)
@SpringBootTest
class AuthenticationFilterTest {

    private UserService userService;
    @Autowired
    private Environment env;

    @Test
    void envTest(){

        log.debug(env.getProperty("token.expiration_time"));
    }

}