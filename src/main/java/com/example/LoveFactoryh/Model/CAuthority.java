package com.example.LoveFactoryh.Model;


import jakarta.persistence.*;
import utils.EAuthorityName;

@Entity (name = "authorities")

public class CAuthority {

        public CAuthority(EAuthorityName authorityName){
            this.name = authorityName;
        }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    @Enumerated(EnumType.STRING)
    private EAuthorityName name;



}
