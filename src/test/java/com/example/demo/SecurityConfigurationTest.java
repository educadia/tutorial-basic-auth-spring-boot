package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

class SecurityConfigurationTest {

    @Test
    @Disabled
    void performSinglePasswordHash() {
        PasswordEncoder hashingAlgo = new SecurityConfiguration().providePasswordHashingAlgo();
        System.out.println(hashingAlgo.encode("-"));
    }
}
