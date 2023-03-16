package com.example.LoveFactoryh.services;
import com.example.LoveFactoryh.Security.CSecurityUser;
import com.example.LoveFactoryh.repositories.IUserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class CSecurityUserDetailService implements UserDetailsService {

        private final IUserRepository userRepository;
        public CSecurityUserDetailService(IUserRepository userRepository) {
            this.userRepository = userRepository;
             }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            var optUser = this.userRepository.findByUsername(username);

            if(optUser.isPresent()){
                return new CSecurityUser(optUser.get());
            }

        throw new UsernameNotFoundException(("User not found: " + username));
    }
}
