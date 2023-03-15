package repositories;

import com.example.LoveFactoryh.Model.CUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<CUser, Long> {

    Optional<CUser> findByUsername(String username) ;

}
