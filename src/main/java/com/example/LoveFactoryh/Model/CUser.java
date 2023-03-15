package com.example.LoveFactoryh.Model;


import jakarta.persistence.*;
import org.springframework.security.core.userdetails.User;

import java.util.List;

@Entity (name = "users")
public class CUser {


        public CUser(String username, String password, List<CAuthority> authorities){
        this.username = username;
        this.password = password;
        this.authorities = authorities;

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
    private String username;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_authority",
        joinColumns = @JoinColumn(name ="user_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
    private List<CAuthority> authorities;

}
