package com.example.LoveFactoryh.services;

import io.jsonwebtoken.Claims;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private static final String SECRET_KEY = "";

    public String extractUsername(String token) {

        return null;
    }

    private Claims extractAllClaims(String token){
        return Jwts
                .paserBuilder()
                .setSigningKey(getSignInKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
}
