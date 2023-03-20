package com.example.LoveFactoryh.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http

                .csrf()
                .disable()
                .httpBasic()
                .and().authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/form").hasAnyAuthority("USER", "ADMIN")
                        .requestMatchers("/delete/**").hasAuthority("ADMIN")
                        .requestMatchers("/update/**").hasAnyAuthority("USER", "ADMIN")
                        .anyRequest().permitAll()
                )
        .logout()
                .logoutUrl("/logout")
        .logoutSuccessUrl("/login")
        .deleteCookies("JSESSIONID");


        return http.build();
    }



//    @Bean
//    public LogoutConfigurer<HttpSecurity> logoutConfigurer(HttpSecurity http) throws Exception {
//        return http
//                .logout(logout -> logout
//                        .logoutUrl("/logout")
//                        .logoutSuccessUrl("/my/index")
//                        .logoutSuccessHandler(logoutSuccessHandler)
//                        .invalidateHttpSession(true)
//                        .addLogoutHandler(logoutHandler)
//                        .deleteCookies(cookieNamesToClear)
//                ).logout();
//    }


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