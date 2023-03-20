package com.example.LoveFactoryh.utils;

import com.example.LoveFactoryh.Model.CAuthority;
import com.example.LoveFactoryh.Model.CUser;
import com.example.LoveFactoryh.Token.ITokenRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import com.example.LoveFactoryh.repositories.IAuthorityRepository;
import com.example.LoveFactoryh.repositories.IUserRepository;

import java.util.List;
@Component
public class CRunner implements CommandLineRunner {

    private final IUserRepository userRepository;
    private final IAuthorityRepository authorityRepository;

    public CRunner (IUserRepository userRepository, IAuthorityRepository authorityRepository){

        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }
    @Override
    public void run (String... args) throws Exception {
        if (this.authorityRepository.count() == 0) {
            this.authorityRepository.saveAll(List.of(
                    new CAuthority(EAuthorityName.ADMIN),
                    new CAuthority(EAuthorityName.USER)

            ));
        }
        if(this.userRepository.count()==0){
            this.userRepository.saveAll(List.of(
                    new CUser("Mordkan",new BCryptPasswordEncoder().encode("Mordkan123"),this.authorityRepository.findByName(EAuthorityName.ADMIN).get()),
                    new CUser("Celia", new BCryptPasswordEncoder().encode("No123"),List.of(this.authorityRepository.findByName(EAuthorityName.ADMIN).get())),
                    new CUser("Bubblewaffle",new BCryptPasswordEncoder().encode("33"),List.of(this.authorityRepository.findByName(EAuthorityName.USER).get())),
                    new CUser("Ashur", new BCryptPasswordEncoder().encode("Laquetuquieras123"),List.of(this.authorityRepository.findByName(EAuthorityName.USER).get()))

            ));
        }
    }


}
