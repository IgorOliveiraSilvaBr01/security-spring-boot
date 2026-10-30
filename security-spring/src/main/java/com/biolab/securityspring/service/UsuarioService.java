package com.biolab.securityspring.service;

import com.biolab.securityspring.dto.UsuarioDto;
import com.biolab.securityspring.entities.Usuario;
import com.biolab.securityspring.repositories.UsuairoRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuairoRepository usuairoRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuairoRepository usuairoRepository, PasswordEncoder passwordEncoder) {
        this.usuairoRepository = usuairoRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario saveUser(UsuarioDto dto){
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(passwordEncoder.encode(dto.getSenha()));
        usuario.setRole(dto.getRole());
        usuario.setCpf(dto.getCpf());

        usuairoRepository.save(usuario);
        return usuario;
    }

}
