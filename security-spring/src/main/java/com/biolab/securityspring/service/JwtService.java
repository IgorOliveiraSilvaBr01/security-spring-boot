package com.biolab.securityspring.service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

@Service
public class JwtService {
    private final String SECRET = "temqueter32caracteresparafuncionarentoafacaissodireito";

    // gera um token para o usuário
    public String generateToken(String cpf){
        return Jwts.builder()
                .setSubject(cpf)
                .signWith(SignatureAlgorithm.HS256,SECRET)
                .compact();
    }

    public String getCpf(String token){
        return Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

}
