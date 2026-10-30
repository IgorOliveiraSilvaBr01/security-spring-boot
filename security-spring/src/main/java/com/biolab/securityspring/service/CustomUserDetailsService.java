package com.biolab.securityspring.service;

import com.biolab.securityspring.entities.Usuario;
import com.biolab.securityspring.repositories.UsuairoRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UsuairoRepository usuairoRepository;

    public CustomUserDetailsService(UsuairoRepository usuairoRepository) {
        this.usuairoRepository = usuairoRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String cpf) throws UsernameNotFoundException {
        Usuario usuario = usuairoRepository.findByCpf(cpf);
        return User.builder()
                .username(usuario.getCpf())
                .password(usuario.getSenha())
                .roles(usuario.getRole().name().replace("ROLE_", ""))
                .build();
    }
}
