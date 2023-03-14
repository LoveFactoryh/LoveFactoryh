package com.example.LoveFactoryh.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class WebSecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {

        var christian = User.withUsername("Mordkan")
                .password("password123")
                .roles("read")
                .build();
        var salah = User.withUsername("Salah")
                .password("password123")
                .roles("read")
                .build();
        var celia = User.withUsername("Celia")
                .password("password123")
                .roles("read")
                .build();
        var jordy = User.withUsername("Jordy")
                .password("password123")
                .roles("read")
                .build();

        return new InMemoryUserDetailsManager(christian, salah,celia,jordy);
    }
@Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
}
}