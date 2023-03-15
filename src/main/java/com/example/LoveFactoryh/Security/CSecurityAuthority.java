package com.example.LoveFactoryh.Security;

import com.example.LoveFactoryh.Model.CAuthority;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class CSecurityAuthority implements GrantedAuthority {

    private final CAuthority authority;

    @Override
    public String getAuthority(){
        return authority.getName().toString();
    }

}
