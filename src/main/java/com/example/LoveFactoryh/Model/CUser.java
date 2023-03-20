package com.example.LoveFactoryh.Model;
import com.example.LoveFactoryh.Token.Token;
import com.example.LoveFactoryh.utils.EAuthorityName;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Collection;
import java.util.List;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@Builder
@NoArgsConstructor

@AllArgsConstructor
@Entity
@Table(name = "_user")
public class CUser implements UserDetails {
    public CUser(String username, String password, EAuthorityName role){
        this.username = username;
        this.password = password;
        this.role = role;

    }
    @Id
    @GeneratedValue
    private Integer id;
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private EAuthorityName role;

    @OneToMany(mappedBy = "user")
    private List<Token> tokens;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

//package com.example.LoveFactoryh.Model;
//
//
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.List;
//@Builder
//@AllArgsConstructor
//@Data
//@Getter
//@Setter
//@NoArgsConstructor
//@Entity (name = "users")
//public class CUser {
//
//
//        public CUser(String username, String password, List<CAuthority> authorities){
//        this.username = username;
//        this.password = password;
//        this.authorities = authorities;
//
//    }
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//   private Integer id;
//    private String username;
//    private String password;
//
//
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "user_authority",
//        joinColumns = @JoinColumn(name ="user_id", referencedColumnName = "id"),
//        inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
//        private List<CAuthority> authorities;
//
//}
