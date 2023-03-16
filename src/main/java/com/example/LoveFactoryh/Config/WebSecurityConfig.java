package com.example.LoveFactoryh.Config;

import com.example.LoveFactoryh.utils.EAuthorityName;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    //@Bean
    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws  Exception{
        return http
                .httpBasic()
                .and().authorizeHttpRequests()
                .requestMatchers("/form").hasRole(EAuthorityName.ADMIN.name())
                .and().build();
    }
//    @Bean
//    public UserDetailsService userDetailsService() {
//
//        var christian = User.withUsername("Mordkan")
//                .password("password123")
//                .roles("read")
//                .build();
//        var salah = User.withUsername("Salah")
//                .password("password123")
//                .roles("read")
//                .build();
//        var celia = User.withUsername("Celia")
//                .password("password123")
//                .roles("read")
//                .build();
//        var jordy = User.withUsername("Jordy")
//                .password("password123")
//                .roles("read")
//                .build();
//
//        return new InMemoryUserDetailsManager(christian, salah,celia,jordy);
//    }
@Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
}

}