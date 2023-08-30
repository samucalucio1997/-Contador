package com.curso.config.Service;

import org.springframework.stereotype.Service;

import com.curso.config.Model.ClubMember;
import io.jsonwebtoken.Jwts;

@Service
public class TokenServica {
    

    public String gererToken(ClubMember clubMember){
        
        return "Jwts.builder()";
    }
}
