package com.biolab.securityspring.service;

import com.biolab.securityspring.dto.UsuarioDto;
import com.biolab.securityspring.entities.Usuario;
import com.biolab.securityspring.repositories.UsuairoRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    private final UsuairoRepository usuairoRepository;

    public UsuarioService(UsuairoRepository usuairoRepository) {
        this.usuairoRepository = usuairoRepository;
    }

    public Usuario saveUser(UsuarioDto dto){
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha());
        usuario.setRole(dto.getRole());

        usuairoRepository.save(usuario);
        return usuario;
    }

}
