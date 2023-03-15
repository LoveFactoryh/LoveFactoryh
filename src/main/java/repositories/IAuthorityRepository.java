package repositories;

import com.example.LoveFactoryh.Model.CAuthority;
import org.springframework.data.jpa.repository.JpaRepository;
import utils.EAuthorityName;

import java.util.Optional;

public interface IAuthorityRepository extends JpaRepository<CAuthority, Long> {

    Optional<CAuthority> findByName(EAuthorityName name);

}
