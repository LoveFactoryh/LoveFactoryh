package com.example.LoveFactoryh.Model;


import jakarta.persistence.*;
import com.example.LoveFactoryh.utils.EAuthorityName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
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
