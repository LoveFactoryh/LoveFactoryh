package utils;

import com.example.LoveFactoryh.Model.CAuthority;
import com.example.LoveFactoryh.Model.CUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repositories.IAuthorityRepository;
import repositories.IUserRepository;

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
                    new CAuthority(EAuthorityName.READ),
                    new CAuthority(EAuthorityName.WRITE)
            ));
        }
        if(this.userRepository.count()==0){
            this.userRepository.saveAll(List.of(
                    new CUser("Mordkan","Mordkan123",List.of(this.authorityRepository.findByName(EAuthorityName.ADMIN).get())),
                    new CUser("user01", "user01123",List.of(this.authorityRepository.findByName(EAuthorityName.READ).get())),
                    new CUser("user02","user021234",List.of(this.authorityRepository.findByName(EAuthorityName.WRITE).get()))

            ));
        }
    }


}
