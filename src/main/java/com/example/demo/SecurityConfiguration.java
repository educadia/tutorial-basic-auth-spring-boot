package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
//@EnableWebSecurity
public class SecurityConfiguration {

//    @Bean
//    public SecurityFilterChain provideSecurityFilterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeHttpRequests(config -> config.anyRequest().authenticated())
//                .httpBasic(Customizer.withDefaults())
//                .build();
//    }

    @Bean
    public UserDetailsManager provideUserDetailsManager() {
        UserDetails userDetails = User.builder()
                .username("jessy")
                .password("$2a$10$GsBanJPynhAG2u0LRMXdcubIYpyagUCoBnhOa0d2SbNPBj4l0QgJa")
                .build();
        return new InMemoryUserDetailsManager(userDetails);
    }

    @Bean
    public PasswordEncoder providePasswordHashingAlgo() {
        return new BCryptPasswordEncoder();
    }

}
